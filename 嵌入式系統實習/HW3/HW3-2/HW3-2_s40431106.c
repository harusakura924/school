// Smpl_GPIO_RGBled 
#include <stdio.h>
#include "NUC1xx.h"
#include "Driver\DrvGPIO.h"
#include "Driver\DrvUART.h"
#include "Driver\DrvSYS.h"

//---變數宣告---

//延遲時間
#define DELAYT 300000

//BGR腳位
int a[3] = {13,12,14};
//int a[3] = {12,13,14};

//LED4腳位
int b[4] = {12,13,14,15};


int s=0,c;

//---副程式---

// Initial GPIO pins (GPA 12,13,14) to Output mode  
void Init_LEDA(int x,int y)
{
	int z;
	for(z=x;z<=y;z++){
		// initialize GPIO pins
		DrvGPIO_Open(E_GPA, z, E_IO_OUTPUT);
		// set GPIO pins output Hi to disable LEDs
		DrvGPIO_SetBit(E_GPA, z);
	}
}  

// Initial GPIO pins (GPC 12,13,14,15) to Output mode  
void Init_LEDC(int x,int y)
{
	int z;
	for(z=x;z<=y;z++){
		// initialize GPIO pins
		DrvGPIO_Open(E_GPC, z, E_IO_OUTPUT); // GPC12 pin set to output mode
		// set GPIO pins output Hi to disable LEDs
		DrvGPIO_SetBit(E_GPC, z);            // Goutput Hi to turn off LED
	}
} 

/*
tp	控制模式 0:GPA(BGR) , 1:GPC(LED4)
x	燈號發亮
*/ 
void LED(int tp,int x)
{
	int n;
	
	//判別 BGR 或 LED4
	switch(tp){
		case 0:
			for(n=0;n<=2;n++){
				if (a[n]==x){
					//BGR 亮
					DrvGPIO_ClrBit(E_GPA,a[n]);
				}else{
					//BGR 滅
					DrvGPIO_SetBit(E_GPA,a[n]);
				}
			}
			break;
		case 1:
			for(n=0;n<=3;n++){
				if (b[n]==x){
					//LED4 亮
					DrvGPIO_ClrBit(E_GPC,b[n]);
				}else{
					//LED4 滅
					DrvGPIO_SetBit(E_GPC,b[n]);
				}
			}
			break;
		default:
			break;
	}
	/*
	---舊式寫法---
	if (x==0){
		DrvGPIO_ClrBit(E_GPA,12);
	}else{
		DrvGPIO_SetBit(E_GPA,12);
	}
	---舊式寫法---
	*/
}

void Delays(int x) // delay
{
	int y;
	for(y=1;y<=x;y++){
		//一秒延遲時間
		DrvSYS_Delay(DELAYT);
	}
}
int main (void)
{
	UNLOCKREG();			   // unlock register for programming
    DrvSYS_Open(48000000);     // set System Clock to run at 48MHz (PLL with 12MHz crystal input)
	LOCKREG();				   // lock register from programming
	
	Init_LEDA(a[0],a[2]);
	Init_LEDC(b[0],b[3]);
	
	
	// GPA12 = Blue
	// GPA13 = Green
	// GPA14 = Red
	while (1)
	{
		switch(s){
			case 0:
				//綠燈亮10秒
				LED(0,a[s]);
				Delays(10);
				//燈號重置
				LED(0,0);
				s++;
				break;
			case 1:
				//黃燈5下，每閃爍一下算一秒
				for(c=1;c<=5;c++){
					//亮
					LED(0,a[s]);
					Delays(1);
					//滅
					LED(0,0);
					Delays(1);
				}
				//燈號重置
				LED(0,0);
				s++;
				break;
			case 2:
				//紅燈亮8秒
				LED(0,a[s]);
				Delays(8);
				//燈號重置
				LED(0,0);
				s++;
				break;
			default:
				s=0;
				//燈號重置
				LED(0,0);
				LED(1,0);
				Delays(5);
				break;
		}
		Delays(3);
	}
}





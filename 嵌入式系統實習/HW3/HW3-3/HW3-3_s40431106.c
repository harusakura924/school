// Smpl_GPIO_RGBled

//前置處理
#include <stdio.h>
#include "NUC1xx.h"
#include "Driver\DrvGPIO.h"
#include "Driver\DrvUART.h"
#include "Driver\DrvSYS.h"

//---變數宣告---

//延遲時間
#define DELAYT 300000

/*
GPA 腳位
GPA12 = Blue
GPA13 = Green
GPA14 = Red

int a[3] = {12,13,14};
*/
int a[3] = {14,12,13};

/*
LED4 腳位
*/
//int b[4] = {15,14,13,12};
int b[4] = {12,13,14,15};

int s,c;

//---副程式---

// Initial GPIO pins (GPA 12,13,14) to Output mode  
void Init_LEDA(int x,int y)
{
	int z;
	for(z=x;z<=y;z++){
		// 定義 GPA 輸出
		DrvGPIO_Open(E_GPA, z, E_IO_OUTPUT);
		// BGA 滅
		DrvGPIO_SetBit(E_GPA, z);
	}
}  

// Initial GPIO pins (GPC 12,13,14,15) to Output mode  
void Init_LEDC(int x,int y)
{
	int z;
	for(z=x;z<=y;z++){
		// 定義 GPC 輸出
		DrvGPIO_Open(E_GPC, z, E_IO_OUTPUT);
		// LED 滅
		DrvGPIO_SetBit(E_GPC, z);
	}
} 

/*
tp	控制模式 0:GPA(BGR) , 1:GPC(LED4)
x	燈號控制
y	1:發亮 , 0:熄滅
*/ 
void LED(int tp,int x,int y)
{
	//判別 BGR 或 LED4
	switch(tp){
		
		// BGR
		case 0:
			if (y==1){
				//BGR 亮
				DrvGPIO_ClrBit(E_GPA,a[x]);
			}else if (y==0){
				//BGR 滅
				DrvGPIO_SetBit(E_GPA,a[x]);
			}
			break;
			
		// LED4
		case 1:
			if (y==1){
				//LED4 亮
				DrvGPIO_ClrBit(E_GPC,b[x]);
			}else if (y==0){
				//LED4 滅
				DrvGPIO_SetBit(E_GPC,b[x]);
			}
			break;
			
		default:
			break;
	}
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
	//解鎖狀態
	UNLOCKREG();
	//設定頻率48MHz(PLL 12MHz
  DrvSYS_Open(48000000);
	//鎖定狀態
	LOCKREG();
	
	//初始化
	Init_LEDA(a[0],a[2]);
	Init_LEDC(b[0],b[3]);
	
	//			      R  B  G
	//int a[3] = {14,12,13};
	//int b[4] = {15,14,13,12};
	
	LED(0,0,1);//紅亮
	while (1)
	{
		//行人
		LED(1,0,1);//紅亮(N
		for(c=1;c<=9;c++){
			Delays(1);
			LED(1,3,1);
			Delays(1);
			LED(1,3,0);
		}
		
		//紅綠燈
		//for(s=0;s<=1;s++){
		for(s=1;s>=0;s--){
			LED(s,0,0);//紅滅
			LED(s,2,1);//綠亮
			Delays(15);
			LED(s,2,0);//綠滅
			for(c=1;c<=6;c++){
				//黃燈(N
				Delays(1);
				LED(s,1,1);
				Delays(1);
				LED(s,1,0);
			}
			Delays(2);
			LED(s,0,1);//紅亮
			
			//雙紅延遲
			Delays(2);
		}
		
		
	/* 舊式寫法
		//-----南北向-----
		
		LED(1,0,0);//紅滅(N
		LED(1,2,1);//綠亮(N
		Delays(15);
		LED(1,2,0);//綠滅(N
		for(c=1;c<=6;c++){
			//黃燈(N
			Delays(1);
			LED(1,1,1);
			Delays(1);
			LED(1,1,0);
		}
		Delays(2);
		LED(1,0,1);//紅亮(N
		Delays(2);
		
		//-----東西向-----
		
		LED(0,0,0);//紅滅
		LED(0,2,1);//綠亮
		Delays(15);
		LED(0,2,0);//綠滅
		for(c=1;c<=6;c++){
			//黃燈
			Delays(1);
			LED(0,1,1);
			Delays(1);
			LED(0,1,0);
		}
		Delays(2);
		LED(0,0,1);//紅亮
		Delays(2);
	*/
	}
}





import java.io.*;
public class pgm8 {
	public static void main(String[] args) throws IOException {
		System.out.println("班級：資工三忠");
		System.out.println("學號：40431106"); 
		System.out.println("姓名：黃子揚");
		System.out.println("--------------\n");
		
		//輸入參數
		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("輸入 停車時間(時)：");
		int go_h = Integer.parseInt(keyin.readLine());
		System.out.print("輸入 停車時間(分)：");
		int go_m = Integer.parseInt(keyin.readLine());
		System.out.print("\n輸入 離開時間(時)：");
		int ex_h = Integer.parseInt(keyin.readLine());
		System.out.print("輸入 離開時間(分)：");
		int ex_m = Integer.parseInt(keyin.readLine());
		
		//宣告
		int difference,money;
		String Rate;
		
		//計算時間
		if((ex_m-go_m)<0){
			ex_m = ex_m+60;
			ex_h = ex_h-1;
			difference = ex_m-go_m;
		}else{
			difference = ex_m-go_m;
		}
		if((ex_h-go_h)<0){
			int dif_h = ex_h-go_h+12;
			difference = difference + (dif_h*60);
		}else if((ex_h-go_h)!=0){
			int dif_h = ex_h-go_h;
			difference = difference + (dif_h*60);
		}
		
		//計算金額
		if(difference<30){
			money = 0;
			Rate = "費率:未滿30分鐘，不收費!";
		}else if(difference<=120){
			int mm=30;
			money = (difference/30)*mm;
			Rate = "費率:30分鐘以上未滿2小時，每小時"+mm+"元";
		}else if(difference<240){
			int mm=40;
			money = (difference/30)*mm;
			Rate = "費率:2小時以上未滿4小時，每小時"+mm+"元";
		}else{
			int mm=60;
			money = (difference/30)*mm;
			Rate = "費率:4小時以上，每小時"+mm+"元";
		}
		System.out.println("\n一共停了："+(difference/60)+"小時 "+(difference%60)+"分鐘");
		System.out.println(Rate);
		System.out.println("所需金額："+money+"元");
	}
}
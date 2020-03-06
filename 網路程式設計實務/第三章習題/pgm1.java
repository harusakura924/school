import java.io.*;
public class pgm1 {
	public static void main(String[] args) throws IOException {
		System.out.println("班級：資工三忠");
		System.out.println("學號：40431106"); 
		System.out.println("姓名：黃子揚");
		System.out.println("--------------\n");

		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("輸入正方形邊長：");
		int Long_side = Integer.parseInt(keyin.readLine());
		System.out.println("\n正方型面積："+(Long_side*Long_side));
		
		/*
		System.out.print("輸入單價： ");
		float price = Float.parseFloat(keyin.readLine());
		System.out.print("輸入數量： ");
		int num = Integer.parseInt(keyin.readLine());
		float money = price * num;

		System.out.println("請輸入貨品報表格式選項： "); 
		System.out.println(" 1：直式 "); 
		System.out.println(" 2：橫式 "); 
		System.out.println(" 3：結束 "); 
		ch = (char)System.in.read();*/
		/*switch (ch) {
			case '1':
				System.out.println("\n貨品名稱： " + goods_name);
				System.out.println("單價： " + price + "元");
				System.out.println("數量： " + num);
				System.out.println("金額： " + money + "元");
				break;

			case '2':
				System.out.println("\n貨品名稱\t\t單價\t數量\t金額");
				System.out.println("=============================================");
				System.out.println(goods_name + "\t\t" + price + "\t" + num + "\t" + money);
				break;

			case '3':
				break;

			default:
				System.out.println("輸入錯誤！");
		}*/
	}
}    

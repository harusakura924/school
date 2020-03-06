import java.io.*;
public class pgm10 {
	public static void main(String[] args) throws IOException {
		System.out.println("班級：資工三忠");
		System.out.println("學號：40431106"); 
		System.out.println("姓名：黃子揚");
		System.out.println("--------------\n");
		
		//輸入參數
		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("1.華氏轉攝氏");
		System.out.print("2.攝氏轉華氏");
		System.out.print("輸入 模式：");
		int ch = Integer.parseInt(keyin.readLine());
		System.out.print("輸入 溫度：");
		int temp = Integer.parseInt(keyin.readLine());
		switch (ch) {
			case 1:
				int celsius = (temp-32)*5/9;
				System.out.print("\n攝氏為："+celsius+" 度");
				break;
			case 2:
				int celsiu = temp*9/5+32;
				System.out.print("\n華氏為："+celsiu+" 度");
				break;
			default:
				break;
		}
	}
}
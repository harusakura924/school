import java.io.*;
public class pgm2 {
	public static void main(String[] args) throws IOException {
		System.out.println("班級：資工三忠");
		System.out.println("學號：40431106"); 
		System.out.println("姓名：黃子揚");
		System.out.println("--------------\n");

		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("輸入票價：");
		int price = Integer.parseInt(keyin.readLine());
		int ty = price/10;
		int fy = price%10/5;
		int oy = (price%10)%5;
		System.out.println("\n10元："+ty+"個\n5元："+fy+"個\n1元："+oy+"個\n");
	}
}    

import java.io.*;
public class pgm3{
	public static void main(String[] args) throws IOException {
		System.out.println("班級：資工三忠");
		System.out.println("學號：40431106"); 
		System.out.println("姓名：黃子揚");
		System.out.println("--------------\n");

		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("輸入 A 變數：");
		float AAA = Float.parseFloat(keyin.readLine());
		System.out.println("\n平方值："+(AAA^2));
		System.out.println("立方值："+(AAA^3));
		
	}
}    
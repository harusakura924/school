import java.io.*;
public class pgm7{
	public static void main(String[] args) throws IOException {
		System.out.println("班級：資工三忠");
		System.out.println("學號：40431106"); 
		System.out.println("姓名：黃子揚");
		System.out.println("--------------\n");

		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("輸入 A 變數：");
		int AAA = Integer.parseInt(keyin.readLine());
		System.out.print("輸入 B 變數：");
		int BBB = Integer.parseInt(keyin.readLine());
		System.out.println("\n兩數和："+(AAA+BBB));
		System.out.println("A 變數平方值："+(AAA*AAA));
		System.out.println("B 變數平方值："+(BBB*BBB));
	}
}    
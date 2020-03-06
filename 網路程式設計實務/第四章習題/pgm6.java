import java.io.*;
public class pgm6 {
	public static void main(String[] args) throws IOException {
		System.out.println("班級：資工三忠");
		System.out.println("學號：40431106"); 
		System.out.println("姓名：黃子揚");
		System.out.println("--------------\n");

		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("輸入 初值：");
		int i = Integer.parseInt(keyin.readLine());
		System.out.print("輸入 終值：");
		int j = Integer.parseInt(keyin.readLine());
		
		System.out.println("\n結果："+(i+j)*(j-i+1)/2+"\n");
	}
}
import java.io.*;
public class pgm2{
	public static void main(String[] args) throws IOException {
		System.out.println("班級：資工三忠");
		System.out.println("學號：40431106"); 
		System.out.println("姓名：黃子揚");
		System.out.println("--------------\n");

		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("輸入 A 變數：");
		float Long = Float.parseFloat(keyin.readLine());
		System.out.print("輸入 B 變數：");
		float wide = Float.parseFloat(keyin.readLine());
		System.out.println("\n和："+(Long+wide));
		System.out.println("積："+(Long*wide)/2);
		
	}
}    

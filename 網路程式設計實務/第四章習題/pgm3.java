import java.io.*;
public class pgm3 {
	public static void main(String[] args) throws IOException {
		System.out.println("班級：資工三忠");
		System.out.println("學號：40431106"); 
		System.out.println("姓名：黃子揚");
		System.out.println("--------------\n");

		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("輸入 被除數：");
		float i = Float.parseFloat(keyin.readLine());
		System.out.print("輸入 除數：");
		float j = Float.parseFloat(keyin.readLine());
		System.out.println("\n商數："+(i/j)+"\n餘數："+(i%j)+"\n");
	}
}    

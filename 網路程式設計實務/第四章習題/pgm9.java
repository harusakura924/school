import java.io.*;
public class pgm9 {
	public static void main(String[] args) throws IOException {
		System.out.println("班級：資工三忠");
		System.out.println("學號：40431106"); 
		System.out.println("姓名：黃子揚");
		System.out.println("--------------\n");
		
		//輸入參數
		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("輸入 任一整數：");
		int i = Integer.parseInt(keyin.readLine());
		
		if((i%2)==0){
			System.out.println("\n"+i+" 為偶數");
		}else{
			System.out.println("\n"+i+" 為奇數");
		}
	}
}
import java.io.*;
public class pgm6{
	public static void main(String[] args) throws IOException {
		System.out.println("班級：資工三忠");
		System.out.println("學號：40431106"); 
		System.out.println("姓名：黃子揚");
		System.out.println("--------------\n");

		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		
		String AAA;
		System.out.print("輸入 X 字元：");
		AAA = keyin.readLine();
		//char BBB = (char)AAA;
		if (AAA.length()==1){
			char BBB = AAA.charAt(0);
			System.out.println(""); 
			System.out.println(BBB+" 字元的字碼為 "+(int)BBB);
		}else{
			char b[] = new char[AAA.length()];
			for(int i=0; i<AAA.length(); i++){
				char BBB = AAA.charAt(i);
				System.out.println(BBB+" 字元的字碼為 "+(int)BBB);
			}
			
		}
	}
}    
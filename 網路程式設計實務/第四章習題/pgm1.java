import java.io.*;
public class pgm1 {
	public static void main(String[] args) throws IOException {
		System.out.println("班級：資工三忠");
		System.out.println("學號：40431106"); 
		System.out.println("姓名：黃子揚");
		System.out.println("--------------\n");

		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("輸入 i 值：");
		int i = Integer.parseInt(keyin.readLine());
		if( i < 31 ){
			/*int j=i;
			i=2;
			while(j-- != 1){
				i = i<<1;
			}*/
			i = 2<<i-1;
		}
		System.out.println("\ni 值："+i);
		
	}
}    

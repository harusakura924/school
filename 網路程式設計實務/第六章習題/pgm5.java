import java.util.*;
public class pgm5 {
	public static void main(String[] argv){
		System.out.println("班級：資工三忠");
		System.out.println("學號：40431106"); 
		System.out.println("姓名：黃子揚");
		System.out.println("--------------\n");
		
		//輸入參數
		System.out.println("5.計算1到100間屬於5或7的倍數之數值");
		int i = 1;
		while(i++<=100) {
			if((i%5)==0 ||(i%7)==0){
				System.out.print(i+"\t");
			}
		}
	}
}
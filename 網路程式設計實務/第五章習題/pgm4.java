import java.util.*;
public class pgm4 {
	public static void main(String[] argv){
		System.out.println("班級：資工三忠");
		System.out.println("學號：40431106"); 
		System.out.println("姓名：黃子揚");
		System.out.println("--------------\n");
		
		//輸入參數
		System.out.print("A：");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		System.out.print("B：");
		sc = new Scanner(System.in);
		int j = sc.nextInt();
		
		if(i>j){
			System.out.println("\nA 較大");
		}else if(i<j){
			System.out.println("\nB 較大");
		}else{
			System.out.println("\nA.B 一樣大");
		}
		System.out.println("\n四則運算:");
		System.out.println("相加:"+(i+j));
		System.out.println("相減:"+(i-j));
		System.out.println("相乘:"+(i*j));
		System.out.println("相除:"+(i/j));
	}
}
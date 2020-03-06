import java.util.*;
public class pgm6 {
	public static void main(String[] argv){
		System.out.println("班級：資工三忠");
		System.out.println("學號：40431106"); 
		System.out.println("姓名：黃子揚");
		System.out.println("--------------\n");
		
		System.out.println("6.輸入兩個長寬，並以*繪製出正方形");
		//輸入參數
		System.out.print("長：");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		System.out.print("寬：");
		sc = new Scanner(System.in);
		int j = sc.nextInt();
		
		int k,m=1;
		while(m++<=j) {
			k=1;
			while(k++<=i) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
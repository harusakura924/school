import java.util.*;
public class pgm3 {
	public static void main(String[] argv){
		System.out.println("班級：資工三忠");
		System.out.println("學號：40431106"); 
		System.out.println("姓名：黃子揚");
		System.out.println("--------------\n");
		
		System.out.println("3.輸入兩個整數，並計算出兩數之間所有整數之和");
		//輸入參數
		System.out.print("第一個數：");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		System.out.print("第二個數：");
		sc = new Scanner(System.in);
		int j = sc.nextInt();
		
		System.out.print("\n\n從 "+i+" 到 "+j+" 間的所有整數和為 ");
		int k = 0;
		while(i++<=j) {
			k = k+i;
		}
		System.out.println(k);
	}
}
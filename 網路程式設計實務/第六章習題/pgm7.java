import java.util.*;
public class pgm7 {
	public static void main(String[] argv){
		System.out.println("班級：資工三忠");
		System.out.println("學號：40431106"); 
		System.out.println("姓名：黃子揚");
		System.out.println("--------------\n");
		
		System.out.println("7.以*繪製出菱形~");
		//輸入參數
		System.out.print("最長邊(題目:7)：");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//執行次數
		n = (n+1)/2;
		
		//上體
		for (int i = 1; i <= n; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k < i * 2; k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		//下體
		for (int i = n - 1; i > 0; i--) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k < i * 2; k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
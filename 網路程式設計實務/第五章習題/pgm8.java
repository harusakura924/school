import java.util.*;
public class pgm8 {
	public static void main(String[] argv){
		System.out.println("班級：資工三忠");
		System.out.println("學號：40431106"); 
		System.out.println("姓名：黃子揚");
		System.out.println("--------------\n");
		
		//輸入參數
		System.out.print("選項 1.男生  2.女生\n");
		System.out.print("輸入 代號：");
		Scanner sc1 = new Scanner(System.in);
		int i = sc1.nextInt();
		switch(i){
			case 1:
				System.out.println("\n男生 標準體重計算：");
				System.out.print("輸入 身高：");
				sc1 = new Scanner(System.in);
				i = sc1.nextInt();
				System.out.println("\n標準體重 計算結果："+(int)((i-80)*0.7));
				break;
			case 2:
				System.out.println("\n女生 標準體重計算：");
				System.out.print("輸入 身高：");
				sc1 = new Scanner(System.in);
				i = sc1.nextInt();
				System.out.println("\n標準體重 計算結果："+(int)((i-70)*0.6));
				break;
			default:
				System.out.print("\n錯誤!");
				break;
		}
	}
}
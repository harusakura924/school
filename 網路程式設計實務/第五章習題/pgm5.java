import java.util.*;
public class pgm5 {
	public static void main(String[] argv){
		System.out.println("班級：資工三忠");
		System.out.println("學號：40431106"); 
		System.out.println("姓名：黃子揚");
		System.out.println("--------------\n");
		
		//輸入參數
		System.out.print("計算 1.三角形面積  2.矩形面積  3.梯形面積\n");
		System.out.print("輸入 代號：");
		Scanner sc1 = new Scanner(System.in);
		int i = sc1.nextInt();
		int j;
		switch(i){
			case 1:
				System.out.println("\n三角形面積 計算：");
				System.out.print("輸入 底：");
				sc1 = new Scanner(System.in);
				i = sc1.nextInt();
				System.out.print("輸入 高：");
				sc1 = new Scanner(System.in);
				j = sc1.nextInt();
				System.out.println("\n三角形面積 計算結果："+(i*j/2));
				break;
			case 2:
				System.out.println("\n矩形面積 計算：");
				System.out.print("輸入 長：");
				sc1 = new Scanner(System.in);
				i = sc1.nextInt();
				System.out.print("輸入 寬：");
				sc1 = new Scanner(System.in);
				j = sc1.nextInt();
				System.out.println("\n矩形面積 計算結果："+(i*j));
				break;
			case 3:
				System.out.println("\n梯形面積 計算：");
				System.out.print("輸入 上底：");
				sc1 = new Scanner(System.in);
				i = sc1.nextInt();
				System.out.print("輸入 下底：");
				sc1 = new Scanner(System.in);
				j = sc1.nextInt();
				System.out.print("輸入 高：");
				sc1 = new Scanner(System.in);
				int k = sc1.nextInt();
				System.out.println("\n梯形面積 計算結果："+((i+j)*k/2));
				break;
			default:
				System.out.print("\n錯誤!");
				break;
		}
	}
}
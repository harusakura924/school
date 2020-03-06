import java.util.*;
public class pgm1 {
	public static void main(String[] argv){
		System.out.println("班級：資工三忠");
		System.out.println("學號：40431106"); 
		System.out.println("姓名：黃子揚");
		System.out.println("--------------\n");
		
		//輸入參數
		System.out.print("輸入 任一整數：");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		if((i%2)==0){
			System.out.println("\n"+i+" 為偶數");
		}else{
			System.out.println("\n"+i+" 為奇數");
		}
	}
}
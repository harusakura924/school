import java.util.*;
public class pgm9 {
	public static void main(String[] argv){
		System.out.println("班級：資工三忠");
		System.out.println("學號：40431106"); 
		System.out.println("姓名：黃子揚");
		System.out.println("--------------\n");
		
		//輸入參數
		System.out.print("輸入 得分、助攻、籃板、抄截、失誤：");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();
		int l = sc.nextInt();
		int m = sc.nextInt();
		
		i = i+j*2+k*2+l*2-m*2;
		if(i>=45){
			System.out.println("\n此籃球員 MVP 值: "+i+" 為 A 級球員");
		}else if(i>=35 && i<45){
			System.out.println("\n此籃球員 MVP 值: "+i+" 為 B 級球員");
		}else if(i>=25 && i<35){
			System.out.println("\n此籃球員 MVP 值: "+i+" 為 板凳級球員");
		}else if(i<25){
			System.out.println("\n此籃球員 MVP 值: "+i+" 為 萬年板凳球員");
		}
	}
}
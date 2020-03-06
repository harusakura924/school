import java.util.*;
public class pgm2 {
	public static void main(String[] argv){
		System.out.println("班級：資工三忠");
		System.out.println("學號：40431106"); 
		System.out.println("姓名：黃子揚");
		System.out.println("--------------\n");
		
		System.out.println("2.輸入一個數N，並利用FOR讓螢幕顯示1*1、2*2、...、N*N");
		//輸入參數
		System.out.print("輸入 N值：");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=1;i<=N;i++){
			System.out.println(i+"*"+i+"="+(i*i));
		}
	}
}
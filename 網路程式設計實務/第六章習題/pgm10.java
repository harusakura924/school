import java.util.*;
public class pgm10 {
	public static void main(String[] argv){
		System.out.println("班級：資工三忠");
		System.out.println("學號：40431106"); 
		System.out.println("姓名：黃子揚");
		System.out.println("--------------\n");
		
		System.out.println("10.寫出一個方程式，其中x跟n可以自行設定:\n(x+1)/n + (x+2)/(n-1) + ... + (x+N)/1");
		
		//輸入參數
		System.out.print("X值：");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		System.out.print("N值：");
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		float k=0;int i=1;
		for (int j=n; j>=1; j--) {
			k = k+(x+i)/j;
			i++;
		}
		System.out.println("結果:"+k);
	}
}
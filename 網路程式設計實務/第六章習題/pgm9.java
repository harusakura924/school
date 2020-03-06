import java.util.*;
public class pgm9 {
	public static void main(String[] argv){
		System.out.println("班級：資工三忠");
		System.out.println("學號：40431106"); 
		System.out.println("姓名：黃子揚");
		System.out.println("--------------\n");
		
		System.out.println("9.輸入六個整數介於1-49之間\n並依序檢查六個整數是否符合設定中六個號碼\n正確顯示中獎");
		System.out.println("\n");
		
		int a[],b[]={10,25,30,35,40,45},c=0;
		Scanner sc;
		a=new int[6];
		
		//輸入參數
		for (int i=0; i<a.length; i++) {
			while(true) {
				System.out.print("輸入"+(i+1)+"個數:");
				sc = new Scanner(System.in);
				a[i] = sc.nextInt();
				if(a[i]>=1 && a[i]<=49){
					break;
				}else{
					System.out.println("\n只能輸入介於1-49的數");
				}
			}
		}
		
		for (int i : a) {
			for (int j : b) {
				if(i == j){
					c++;
				}
			}
		}
		
		if(c == 6){
			System.out.println("\n恭喜中獎");
		}else{
			System.out.println("\n沒中獎，中獎號碼:");
			for (int i : b) {
				System.out.print(i+"\t");
			}
			System.out.println("\n");
		}
	}
}
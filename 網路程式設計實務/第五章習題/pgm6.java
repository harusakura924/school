import java.util.*;
public class pgm6 {
	public static void main(String[] argv){
		System.out.println("班級：資工三忠");
		System.out.println("學號：40431106"); 
		System.out.println("姓名：黃子揚");
		System.out.println("--------------\n");
		
		int i,j;
		Scanner sc;
		//輸入參數
		
		while(true) {
            System.out.print("\n輸入預設密碼：");
			sc = new Scanner(System.in);
			i = sc.nextInt();
            if(i >= 1000 && i <= 9999) {
				System.out.println("密碼設置成功!");
                break;
            }else{
				System.out.println("密碼需要介於 1000~9999 !");
			}
        }
		
		
		while(true) {
            System.out.print("\n輸入密碼：");
			sc = new Scanner(System.in);
			j = sc.nextInt();
            if(i == j) {
				System.out.println("密碼正確!");
                break;
            }else{
				System.out.println("密碼錯誤!");
			}
        }
	}
}
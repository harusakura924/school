import java.util.*;
import java.io.Console;
public class pgm8 {
	public static void main(String[] argv){
		System.out.println("班級：資工三忠");
		System.out.println("學號：40431106"); 
		System.out.println("姓名：黃子揚");
		System.out.println("--------------\n");
		
		System.out.println("8.使用者輸入4位數密碼，並驗證使用者輸入兩次密碼是否符合，輸入3次不正確則顯示錯誤訊息!");
		
		String passdef, pass;
		Scanner sc;
		int err = 1;
		
		while(true) {
			System.out.print("\n輸入預設密碼：");
			Console con = System.console();
			passdef = new String(con.readPassword());
			//sc = new Scanner(System.in);
			//passdef = sc.next();
			if(passdef.length()==4){
				break;
			}else{
				System.out.println("密碼限制4位數!");
			}
		}
		
		while(true) {
            System.out.print("\n輸入密碼：");
			sc = new Scanner(System.in);
			pass = sc.next();
            if(passdef.compareTo(pass) == 0) {
				System.out.println("密碼正確!");
				break;
            }else if(err == 3){
				System.out.println("密碼錯誤!");
				break;
			}
			err++;
        }
	}
}
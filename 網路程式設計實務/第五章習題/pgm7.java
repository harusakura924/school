import java.util.*;
public class pgm7 {
	public static void main(String[] argv){
		System.out.println("班級：資工三忠");
		System.out.println("學號：40431106"); 
		System.out.println("姓名：黃子揚");
		System.out.println("--------------\n");
		
		//輸入參數
		System.out.print("輸入 通話時間(分)：");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		if(i<800){
			System.out.println("\n800 分鐘以下，每分鐘0.9元\n通話費用為 "+(i*0.9)+" 元");
		}else if(i<=1500 && i>=800){
			System.out.println("\n800~1500 分鐘，通話費 9折\n通話費用為 "+(i*0.9)+" 元");
		}else if(i>1500){
			System.out.println("\n1500 分鐘以上，通話費 79折\n通話費用為 "+(i*0.79)+" 元");
		}else{	
			System.out.println("\nERROR");
		}
	}
}
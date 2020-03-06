import java.util.*;
public class pgm2 {
	public static void main(String[] argv){
		System.out.println("班級：資工三忠");
		System.out.println("學號：40431106"); 
		System.out.println("姓名：黃子揚");
		System.out.println("--------------\n");
		
		//輸入參數
		System.out.print("輸入 學生成績：");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		if(i<=100 && i>=90){
			System.out.println("\n"+i+" 為 A");
		}else if(i<90 && i>=80){
			System.out.println("\n"+i+" 為 B");
		}else if(i<80& i>=70){
			System.out.println("\n"+i+" 為 C");
		}else if(i<70 && i>=60){
			System.out.println("\n"+i+" 為 D");
		}else if(i<60){
			System.out.println("\n"+i+" 為 E");
		}else{	
			System.out.println("\nERROR");
		}
	}
}
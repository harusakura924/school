import java.util.*;
public class pgm10 {
	public static void main(String[] argv){
		System.out.println("班級：資工三忠");
		System.out.println("學號：40431106"); 
		System.out.println("姓名：黃子揚");
		System.out.println("--------------\n");
		
		//輸入參數
		System.out.print("輸入整月工時數：");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		System.out.print("每月固定時薪：");
		sc = new Scanner(System.in);
		int j = sc.nextInt();
		
		if(i<60){
			System.out.println("\n薪水為"+(i*j));
		}else if(i>60 && i<=120){
			System.out.println("\n薪水為 "+(int)(i*j*1.33)+" 元");
		}else if(i>120){
			System.out.println("\n薪水為 "+(int)(i*j*1.66)+" 元");
		}
	}
}
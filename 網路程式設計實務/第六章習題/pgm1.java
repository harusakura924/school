import java.util.*;
public class pgm1 {
	public static void main(String[] argv){
		System.out.println("班級：資工三忠");
		System.out.println("學號：40431106"); 
		System.out.println("姓名：黃子揚");
		System.out.println("--------------\n");
		
		System.out.println("1.計算1到100間所有3的倍數之總和");
		int i = 1,j = 0;
		while(i++<=100) {
			if((i%3)==0){
				j = j + i;
			}
		}
		System.out.println("結果:"+j);
	}
}
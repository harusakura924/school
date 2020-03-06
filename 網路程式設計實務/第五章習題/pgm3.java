import java.util.*;
public class pgm3 {
	public static void main(String[] argv){
		System.out.println("班級：資工三忠");
		System.out.println("學號：40431106"); 
		System.out.println("姓名：黃子揚");
		System.out.println("--------------\n");
		
		//輸入參數
		System.out.print("輸入 學生成績：");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		switch(i){
			case 100: case 99: case 98: case 97: case 96: case 95: case 94: case 93: case 92: case 91: case 90:
				System.out.println("\n"+i+" 為 A");
				break;
			case 89: case 88: case 87: case 86: case 85: case 84: case 83: case 82: case 81: case 80:
				System.out.println("\n"+i+" 為 B");
				break;
			case 79: case 78: case 77: case 76: case 75: case 74: case 73: case 72: case 71: case 70:
				System.out.println("\n"+i+" 為 C");
				break;
			case 69: case 68: case 67: case 66: case 65: case 64: case 63: case 62: case 61: case 60:
				System.out.println("\n"+i+" 為 D");
				break;
			default:
				System.out.println("\n"+i+" 為 E");
				break;
		}
	}
}
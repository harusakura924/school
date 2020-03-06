import java.io.*;
public class pgm10 {
	public static void main(String[] args) throws IOException {
		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("輸入 存款利息：");
		float interest =  Float.parseFloat(keyin.readLine());
		
		deposit(240000,interest);
		
		deposit(1500000,interest);
	}
	public static void deposit(int DDD,float III) {
		System.out.println("\n存款"+(int)(DDD/10000)+"萬(利息)："+(DDD*III/12));
		System.out.println("存款"+(int)(DDD/10000)+"萬(本利合)："+(DDD + DDD*III/12));
	}
}    

import java.io.*;
public class pgm10 {
	public static void main(String[] args) throws IOException {
		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("��J �s�ڧQ���G");
		float interest =  Float.parseFloat(keyin.readLine());
		
		deposit(240000,interest);
		
		deposit(1500000,interest);
	}
	public static void deposit(int DDD,float III) {
		System.out.println("\n�s��"+(int)(DDD/10000)+"�U(�Q��)�G"+(DDD*III/12));
		System.out.println("�s��"+(int)(DDD/10000)+"�U(���Q�X)�G"+(DDD + DDD*III/12));
	}
}    

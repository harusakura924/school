import java.io.*;
public class pgm5 {
	public static void main(String[] args) throws IOException {
		System.out.println("班級：資工三忠");
		System.out.println("學號：40431106"); 
		System.out.println("姓名：黃子揚");
		System.out.println("--------------\n");

		/*BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("輸入 i 值：");
		float i = Float.parseFloat(keyin.readLine());
		System.out.print("輸入 j 值：");
		float j = Float.parseFloat(keyin.readLine());*/
		int playground;
		double me,xiaohua;
		//操場長度
		playground = 200*100;
		System.out.println("操場長度："+playground+" 公分");
		//我的步行
		me = 1*100;
		System.out.println("我的步行："+me+" 公分/每秒");
		//小華步行
		xiaohua = 30*2.54;
		System.out.println("小華步行："+xiaohua+" 公分/每秒");
		
		System.out.println("\n多久後相遇："+playground/(xiaohua+me)+"秒\n");
	}
}    

import java.io.*;
public class pgm7 {
	private int head;
	private int foot;

	public static void main(String[] args) throws IOException {
		System.out.println("班級：資工三忠");
		System.out.println("學號：40431106"); 
		System.out.println("姓名：黃子揚");
		System.out.println("--------------\n");
		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("幾個頭：");
		int i = Integer.parseInt(keyin.readLine());
		System.out.print("幾隻腳：");
		int j = Integer.parseInt(keyin.readLine());
		pgm7 test = new pgm7(i, j);
		System.out.println("\n雞有：" + test.getChicken() + "隻");
		System.out.println("兔有：" + test.getRabbit() + "隻");
	}

	public pgm7(int head, int foot) {
		this.head = head;
		this.foot = foot;
	}

	public int getRabbit() {
		return (foot - 2 * head) / 2;
	}

	public int getChicken() {
		return (4 * head - foot) / 2;
	}
}
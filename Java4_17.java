/**
 * 練習問題 4 - 17
九九表（一の段～九の段）を表示するプログラムを作成しなさい。

※ 	System.out.printfを使用する。System.out.printf(" %2d", x );
のように、%2dと記述すると表示が2桁に揃う。
 * @author hangt
 *
 */
public class Java4_17 {
	
	public static void main(String[] args) {
		int i;
		int j;
		for(j = 1; j < 10; j ++) {
			for(i = 1; i <= j; i ++) {
				System.out.print(i + " x " + j + " = " + (j * i));
				System.out.print("    ");
			}
			System.out.println(" ");
		}
	}
}
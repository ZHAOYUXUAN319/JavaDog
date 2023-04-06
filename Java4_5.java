
public class Java4_5 {
/**
 * 練習問題 4 - 5
整数を 10 回入力し、平均値を求めるプログラムを作成しなさい。

※ 	計算は整数で行い、小数点以下は切り捨ててよい。
 * @param args
 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int x = 0;
		for (int i = 1; i < 11; i++) {
			x +=i;
		}
		System.out.print(x/10);
	}

}


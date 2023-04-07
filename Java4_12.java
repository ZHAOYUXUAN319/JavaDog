/**
練習問題 4 - 12
数値を繰り返し入力し、合計が 100 を超えたら入力を止めて合計を表示するプログラムを作成しなさい。
*/
public class Java4_12 {

	public static void main(String[] args) {
		int i;
		int k = 0;
		for(i = 0; i < 101; i++) {
			if(i > 100) {
				break;
			}
			k += i;
		}
		System.out.print(k);
	}

}
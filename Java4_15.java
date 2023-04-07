/**
 * 練習問題 4 - 15
入力された数が素数かどうかを判定するプログラムを作成しなさい。

※ 	判定する数は 4 以上としてよい。
 * @author hangt
 *
 */
public class Java4_15{

	public static void main(String[] args) {
		int [] hairetu = {10,240,5,11};
		int i;
		for(i = 0; i < hairetu.length; i ++) {
			if(hairetu[i] % 2 != 0 || hairetu[i] % 3 != 0 || hairetu[i] % 5 != 0) {
				System.out.print(hairetu[i]+"は素数です。");
			}else {
				System.out.print(hairetu[i]+"は素数じゃない");
			}
		}
	}
}
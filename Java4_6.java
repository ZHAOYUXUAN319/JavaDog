public class Java4_6 {
	/**
	 * 整数、0 か 1 を 10 回入力する。これを対戦成績と考え、0 
	 * を負け、1 を勝ちとして、勝ちの総数、負けの総数を表示するプ
	 * ログラムを作成しなさい。
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i;
		int win = 0;
		int [] b = {1,1,1,1,1,0,0,0,0,0,};
		for(i = 0; i <10; i++) {
			if(b[i] != 0) {
				win +=1;
			}
		}
		System.out.print("勝ちの総数は"+win+"負けの総数は"+(10-win));
	}
}


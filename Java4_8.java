public class Java4_8 {
	/**
	 * 練習問題 4 - 8
		自然数（正の整数）を 10 回入力し、最大値を求めるプログ
		ラムを作成しなさい。
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i;
		int k;
		int max = 0;
		int [] p = new int [10];
		for(i= 0; i < 10; i++ ) {
			int a= (int)(Math.random()*100);
			k = a+i;
			System.out.print(k+" ");
			p[i] = k;
		
			if( max < p[i] ) {
				max = p[i];
			}
		}
		System.out.print("最大値は:"+max);
	}
}


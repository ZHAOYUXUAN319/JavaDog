public class Java4_9 {
	/**
	 * 練習問題 4 - 9
整数を 10 回入力し、最大値と最小値を求めるプログラムを作成しなさい。
	 * @param args
	 */
		public static void main(String[] args) {

			int[] hairetu = { 1, 2,22,9,8, 6, 7, 9, 6, 2};
			int i;
			int max = hairetu[0];
			int min = hairetu[0];
			for (i = 0; i < hairetu.length; i++) {
				if (hairetu[i] < min) {
					min = hairetu[i];
				} else if (hairetu[i] > max) {
					max = hairetu[i];
				}
			}

			System.out.println("min=" + min);
			System.out.println("max=" + max);
		}

	}
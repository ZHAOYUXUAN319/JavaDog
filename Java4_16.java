/**
 * 練習問題 4 - 16
2 以上の数値を入力し、素因数分解した結果を表示しなさい。
 * @author hangt
 *
 */
public class Java4_16 {
	
	public static void main(String[] args) {
	
		int num = 248;
		
		System.out.print(num+"=");
		
		for (int i = 2;i<=num;i++) {
		
			if (num % i == 0) {
			
				num /= i;
				
				if (num == 1) System.out.print(i);
				
					else System.out.print(i + "×");
					
					i = 1;
			
			}
		
		}

	}
}
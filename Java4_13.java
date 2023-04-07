/**
 * ストライク・カウントを数えるプログラムを作成しなさい。

１球ごとにストライクかボールかを入力する。
３ストライクまたは４ボールになったら入力を止め、ストライクとボールのカウントを表示する。
※ 	ストライクの場合は1、ボールの場合は2を入力する。

 * @author hangt
 *
 */
public class Java4_13 {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		for(int i = 1; i > 0; i ++) {
			int a =(int)(Math.random()*2)+1;
			if(a == 1) {
				System.out.println("ストライク=1 or ボール=2 ？");
				System.out.println("1");
				x += 1;
				
			}else {
				System.out.println("ストライク=1 or ボール=2 ？");
				System.out.println("2");
				y += 2;
				
			}
			if(x == 3 || y == 4) {
				break;
			}
		}
		System.out.println("ストライク:"+x);
		System.out.println("ボール:"+y);
	}

}
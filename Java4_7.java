public class Java4_7 {
	/**
	 * 次のプログラムを作成しなさい。

		巨人、阪神戦で毎回の得点を入力する。（１回～９回）
		入力が終わったら、それぞれの得点とどちらが勝ったかを表示する。
		※ 	試合は巨人の先行とする。
		1回表、巨人の得点は？ 0
		1回裏、阪神の得点は？ 0
		2回表、巨人の得点は？ 0
		2回裏、阪神の得点は？ 1
		    ：
		    ：
		    ：
		9回表、巨人の得点は？ 0
		9回裏、阪神の得点は？ 1
		
		巨人：5点, 阪神：6点
		阪神の勝ち
	 */

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int ten = 0;
		int tens = 0;
		int yy = (int)(Math.random()*10);
		for(int i = 0; i < yy; i++) {
			int x = (int)(Math.random()*2);
			int z = (int)(Math.random()*2);
			String[] team = {"巨人","阪神"};
			System.out.println(i+"回表、"+team[z]+"の得点は？"+x);
			if(z == 0 && x== 1) {
				ten ++;
			}else if(z == 1 && x==1) {
				tens ++;
			}
		}
		System.out.println("巨人:"+ten+"点阪神:"+tens+"点");
		if(ten > tens) {
			System.out.print("巨人の勝ち");
		}else if(ten < tens){
			System.out.print("阪神の勝ち");
		}else {
			System.out.print("ドロー");
		}
	}
}


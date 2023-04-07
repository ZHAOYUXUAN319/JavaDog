
import java.util.Scanner;
/**
 * 練習問題 4 - 11
個数を示す数値を入力し、その個数分だけ 0 ～ 9 の数字を表示する
プログラムを作成しなさい。数字は 0, 1, 2, 3, , の順に表示し、9 
の次は 0 に戻るものとします
 * @author hangt
 *
 */
public class Java4_11{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("入力値：");
int n = scanner.nextInt();
scanner.close();

System.out.print("出力値：");
for (int i = 0; i < n; i++) {
System.out.print(i % 10);
}
}
}
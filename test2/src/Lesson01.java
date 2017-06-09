/**
 * Java基礎 Lesson01 3の倍数と3がつく値の出力
 * @author Shota Goto
 */
public class Lesson01 {


	public static void main(String[] args) {

		//出力用の変数
		int outnum=1;

		//10の位の数値をカウント
		int dig=0;

		//出力する数値を100までカウント
		for(outnum = 1; outnum < 10; outnum++){
			//outnumが10の倍数になるたびにdigを増加
			if(outnum % 10 == 0)dig++;

			//3の倍数であるか判別
			if(outnum % 3 == 0)System.out.println(outnum);

			//3のつく数値であるか判別
			else if(outnum-dig*10 == 3)System.out.println(outnum);

			//10の位が30の時出力
			else if(dig==3)System.out.println(outnum);

		}
	}

}

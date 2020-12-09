package packagetest;

import java.util.Random;
import java.util.ArrayList;

public class FizzBuzzQuestion {

	public static void main(String[] args) {

		int n = 41;

		for(int i = 1; i <= n; i++) {

			String strNumber = "";

			if((i / 3 * 3) == i) {
				strNumber += "Fizz";
			}
			if((i / 5 * 5) == i) {
				strNumber += "Buzz";
			}
			if(strNumber.equals("")) {
				strNumber = Integer.toString(i);
			}
			System.out.print(strNumber);

			if(i == n) {
				System.out.print("");
			} else {
				System.out.print(",");
			}
		}

		//追加1
		System.out.println("test");
		System.out.println("test");

		//追加2
		Random ran = new Random();
		int ranNumber = ran.nextInt(53);
		System.out.println(ranNumber);

		//追加3
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int in = 0; in < 4; in++) {
			for(int i = 1; i <= 13; i++) {
				list.add(i);
			}
		}
		System.out.println("山札がセットされました");

		for(int number : list) {
			System.out.print(number);
		}

		System.out.println("終了！");

		String[] stList = {"アメリカ","ジョージア","タイ"};
		for(String st: stList) {
			System.out.println(st);
		}

        //追加4
		//大凶を追加
		//スーパー大吉を追加
		String[] fortuneList = {"吉","大吉","中吉","末吉","凶","大凶","スーパー大吉"};

		Random ranRan = new Random();
		int fortuneNumber = ranRan.nextInt(fortuneList.length);

		System.out.println(fortuneList[fortuneNumber]);
	}
}

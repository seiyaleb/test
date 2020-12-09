package packagetest;

import java.util.Random;

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
	}
}

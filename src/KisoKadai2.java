import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;




/**
 * @author internous
 *
 */
public class KisoKadai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random random = new Random();

		int ans = random.nextInt(100);
		int count = 0;
		int userAns = 0;

		System.out.println("0～100の数字を入力してください。");

		while(count < 10) {
			System.out.printf("%d> ", count + 1);
			userAns = getNumberInput();
			System.out.printf("\t%d ..... ", userAns);
			if(userAns<=100&&userAns>=1)
			if (ans == userAns) {
				System.out.println("正解！");
				break;
			} else if (ans < userAns) {
				System.out.println("大きすぎます。");
			} else {
				System.out.println("小さすぎます。");
			}if(userAns>100){
				System.out.println("1～100までの数字を入力してください。");
			}
			count++;
		}

		if (count == 10 && ans != userAns) {
			System.out.println("Game Over! 正解は " + ans + " でした。");
		}

	}
	private static int getNumberInput() {
		int userAns = -1;

		do {
			String s = getStringInput();
			try {
				userAns = Integer.parseInt(s);
			} catch(NumberFormatException e) {
				System.out.print("もう一度入力してください > ");
			}
		} while(userAns == -1);

		return userAns;
	}private static String getStringInput() {
		BufferedReader br = null;
		String line = null;

		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			line = br.readLine();
		} catch(IOException e) {
			e.printStackTrace();
		}

		return line;
	}}
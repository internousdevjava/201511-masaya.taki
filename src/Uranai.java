/**
 *
 */

/**
 * @author internous
 *
 */
public class Uranai {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("ようこそ。俺が占ってやんよ！");
		System.out.println("名前を教えておくれ。");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("お次は年齢を教えておくれ。");
		String ageString = new java.util.Scanner(System.in).nextLine();
		int age = Integer.parseInt(ageString);
		int fortune = new java.util.Random().nextInt(3);
		fortune++;
		System.out.println("結果が出たぞい。");
		System.out.println(age+"歳の"+name+"さん、あなたの運気番号は"+fortune+"です");
		System.out.println("1:大吉 2:中吉 3:吉 4:凶");



	}

}

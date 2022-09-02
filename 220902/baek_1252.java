package algorithm;

import java.math.BigInteger;
import java.util.Scanner;
public class bael_1252 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		BigInteger bi1 = scanner.nextBigInteger();
		BigInteger bi2 = scanner.nextBigInteger();

		String str1 = bi1.toString();
		String str2 = bi2.toString();

		BigInteger a = new BigInteger(str2, 2);
		BigInteger b = new BigInteger(str2, 2);

		System.out.println(a.add(b).toString(2));
	}
}
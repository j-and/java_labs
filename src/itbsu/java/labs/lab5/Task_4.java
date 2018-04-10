package itbsu.java.labs.lab5;
import itbsu.java.labs.common.Utils;

public class Task_4 {

	public static void main(String[] args) {

		char letterToCheck = Utils.getChar("letter");
		Utils.consoleLog("This letter is vowel - it's ", isVowelMethod1(letterToCheck));
		Utils.consoleLog("This letter is vowel - it's ", isVowelMethod2(letterToCheck));
		Utils.consoleLog("This letter is vowel - it's ", isVowelMethod3(letterToCheck));
	}

	public static boolean isVowelMethod1(char letter) {
		return letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U';
	}

	public static boolean isVowelMethod2(char c) {
		return "AEIOUaeiou".indexOf(c) != -1;
	}

	public static boolean isVowelMethod3(char c) {
		switch (c) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			return true;
		default:
			return false;
		}
	}


}

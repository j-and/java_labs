package itbsu.java.labs.lab5;
import itbsu.java.labs.common.Utils;

public class Task_5 {
	public static void main(String[] args) {
		int surprizeNumber = Utils.findRandom(5);
		Utils.consoleLogStrings("Inside this pie is ", getFilling(surprizeNumber));
	}

	public static String getFilling(int surprizeNumber) {
		String filling = "";
		switch (surprizeNumber) {
		case 1:
			filling = "banana";
			break;
		case 2:
			filling = "apple";
			break;
		case 3:
			filling = "peach";
			break;
		case 4:
			filling = "orange";
			break;
		case 5:
			filling = "pear";
			break;
		}
		return filling;
	}

}

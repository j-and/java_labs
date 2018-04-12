package itbsu.java.labs.lab5;

import itbsu.java.labs.common.Utils;

public class Task_1 {

	public static void main(String[] args) {

		int dragonAge = Utils.scanValue("age");
		Utils.consoleLogStringInt("dragonAge=", dragonAge);
		int dragonHeadsNumber = calcDragonAge(dragonAge);
		Utils.consoleLogStringInt("dragonHeadsNumber=", dragonHeadsNumber);
		Utils.consoleLogStringInt("dragonEyesNumber=", calcDragonEyes(dragonHeadsNumber));
	}

	public class Constants {
		public static final int FIRST_PERIOD = 200;// years
		public static final int SECOND_PERIOD = 300;// years
		public static final int EYES_COUNT = 2;
	}

	public static int calcDragonAge(int num) {
		int numberOfHeads;
		if (num <= Constants.FIRST_PERIOD) {
			numberOfHeads = num * 3;
		} else if (num <= Constants.SECOND_PERIOD) {
			numberOfHeads = Constants.FIRST_PERIOD * 3 + (Constants.SECOND_PERIOD - num) * 2;
		} else {
			numberOfHeads = Constants.FIRST_PERIOD * 3 + (Constants.SECOND_PERIOD - Constants.FIRST_PERIOD) * 2
					+ (num - Constants.SECOND_PERIOD);
		}
		return numberOfHeads;
	}

	public static int calcDragonEyes(int num) {
		return Constants.EYES_COUNT * num;
	}

}


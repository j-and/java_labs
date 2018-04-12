
package itbsu.java.labs.lab5;
import itbsu.java.labs.common.Utils;

public class Task_2 {

		public static void main(String[] args) {
			int mood = Utils.findRandom(10);
			Utils.consoleLogStrings("I am ", showMood(mood));
		}

		public class moodConstants {
			public static final int BAD_MOOD = 3;
			public static final int GOOD_MOOD = 7;
		}

		public static String showMood(int moodValue) {
			String showMoodValue;
			if (moodValue <= moodConstants.BAD_MOOD) {
				showMoodValue = "Bad";
			} else if (moodValue <= moodConstants.GOOD_MOOD) {
				showMoodValue = "Normal";
			} else {
				showMoodValue = "Excellent";
			}
			return showMoodValue;
		}
}

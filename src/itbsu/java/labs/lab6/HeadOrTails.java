package itbsu.java.labs.lab6;
import itbsu.java.labs.common.Utils;

public class HeadOrTails {

	public static void main(String[] args) {
		int numberOfThrowing = Utils.getValue("num");
		Utils.consoleLogStringInt("numberOfThrowing=", numberOfThrowing);
		calcHeads(numberOfThrowing);
		Utils.consoleLogStringInt("countHeads=", calcHeads(numberOfThrowing));
	}

	public static int calcHeads(int num) {
		int isHead;//=0;
		int countHeads=0;
		for(int i=0; i<=num;i++) {
			isHead=Utils.getRandom(2);//returns random value 1(heads) or 2(tails)
			if(isHead==1) {
				countHeads++;
			}
		}
		return countHeads;
	}
}



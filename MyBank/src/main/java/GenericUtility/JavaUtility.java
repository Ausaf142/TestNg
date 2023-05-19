package GenericUtility;

import java.util.Random;

public class JavaUtility {
	
	
	public int getRandomNumber() {
			Random ran = new Random();
			int num=ran.nextInt(1000);
			return num;
}
}
package GenericUtility;

import java.util.Random;

public class JavaUtility {
	public int GetRandomNumber() {
Random random=new Random();
int uniqueNumber = random.nextInt(1000);
return uniqueNumber;
}
}
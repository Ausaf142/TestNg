package Generic;

import java.util.Random;

public class JavaLibrary {
	public int getRandom() {
	Random ran = new Random();
	int key = ran.nextInt(100);
	return key;
}
}
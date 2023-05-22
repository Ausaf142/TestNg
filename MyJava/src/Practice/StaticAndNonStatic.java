package Practice;

public class StaticAndNonStatic {
	public static void maths() {
		System.out.println("it is maths");
	}
	public void chemistry() {
		System.out.println("it is chemsitry");
	}
	public static void main(String[] args) {
		maths();
	/*	chemistry();it is non static so for this we have to create object then call*/
		StaticAndNonStatic san = new StaticAndNonStatic();
		san.chemistry();
	}

}

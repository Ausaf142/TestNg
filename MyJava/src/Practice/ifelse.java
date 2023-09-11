package Practice;

public class ifelse{
	public static void main(String[] args) {
	int a=35;
	int b=35;
	int c=35;
	if(a<33 && b<33 && c<33) {
		System.out.println("you are fail");
	}
	 if((a+b+c)/3<40) {
		System.out.println("fail due to less then 40");
	}
	else {
		System.out.println("pass");
	}
}
}
package Practice;

public class SumOfArrays {
public static void main(String[] args) {
	int sum=0;
	int[] arr = {5,8,6,1,7};
//	for(int num:arr) {
//		sum=sum+num;
//	}
//	System.out.println("The sum of array is "+sum);
	
	
	for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
	}
	System.out.println("The sum of array is "+sum);
	
//	for(int i=0;i<arr.length;i++) 
//		sum=sum+arr[i];
//	System.out.println("The sum of array is "+sum);
	
}
}

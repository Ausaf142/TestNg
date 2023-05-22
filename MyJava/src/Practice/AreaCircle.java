package Practice;

import java.util.Scanner;

public class AreaCircle {
	public static void main(String[] args) {
//		double radius=7.5;
//		double area=Math.PI*radius*radius;
//		double perimeter=2*Math.PI*radius;
//		System.out.println("area of circle :"+area);
//		System.out.println("perimeter of circle: "+perimeter);
		
//		int cont=1;
//		Scanner sc = new Scanner(System.in);
//		while(cont==1){
//		
//		System.out.println("Enter the first number");
//		int x=sc.nextInt();
//		System.out.println("Enter the Second number");
//		int y=sc.nextInt();
//		System.out.println("Enter the Third number");
//		int z=sc.nextInt();
//		double avg=(x+y+z)/3;
//		System.out.println("Avg is :"+ avg);
//		
//		System.out.println("Enter 1 for continue or zero for stop");
//		 cont=sc.nextInt();
//		}	
//		System.out.println("thanyou");
		
		
//		 System.out.println("\nJava Version: "+System.getProperty("java.version"));
//		    System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
//		    System.out.println("Java Home: "+System.getProperty("java.home"));
//		    System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
//		    System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
//		    System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");
		
		
//		String s= "Tom loves jerry";
//		char[] ch=s.toCharArray();
//		for(int i=ch.length-1;i>=0;i--) {
//		System.out.print(s.charAt(i));
//		}
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your number");
//		int x= sc.nextInt();
//		if(x==1) {
//			System.out.println("Monday");
//		}
//		else if(x==2) {
//			System.out.println("tuesday");
//		}
//		else if(x==3) {
//			System.out.println("Wednesday");
//		}
//		else if(x==4) {
//			System.out.println("Thursday");
//		}
//			
//		else if(x==5) {
//			System.out.println("Friday");
//		}
//		else if(x==6) {
//			System.out.println("Saturday");
//		}
//		else if(x==7) {
//			System.out.println("Sunday");
//		}
//		else {
//			System.out.println("Your input is out of range");
//			}
				
		
//		Scanner sc =new Scanner(System.in);
//		String day;
//		System.out.println("enter");
//		int x=sc.nextInt();
//		switch(x) {
//		case 1: System.out.println("monday");
//		break;
//		case 2: System.out.println("Tuesday");
//		break;
//		case 3: System.out.println("wednesday");
//		break;
//		case 4: System.out.println("Thursday");
//		break;
//		case 5: System.out.println("friday");
//		break;
//		case 6: System.out.println("saturday");
//		break;
//		default :System.out.println("invalid");;
//		}
		
		int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
	      System.out.println("Index position of 56 is: " + findIndex(my_array, 6));
	      System.out.println("Index position of 77 is: " + findIndex(my_array, 77));}
	      
		   public static int  findIndex (int[] my_array, int t) {
		        if (my_array == null) return -1;
		        int len = my_array.length;
		        int i = 0;
		        while (i < len) {
		            if (my_array[i] == t) return i;
		            else i=i+1;
		        }
		        return -1;
		   
	}
	}


package Practice;

import java.util.Arrays;

public class ArrayProg1 {
public static void main(String[] args) {
	int[] num= {8,4,1,0,9,7,6,5,3,};

	Arrays.sort(num);	//Arrays is a class having methods like sort,tostring(),search binary num
	
for(int q:num) {
	System.out.print(q+" ");
}

String[] str= {"sun","sajal","ausaf","kshitij","babloo","yogesh"};
Arrays.sort(str);
System.out.println();
System.out.println("Vaishnavi Sharma Beautiful");
for(String q:str) {
	System.out.print(q+" ");
}
}
}

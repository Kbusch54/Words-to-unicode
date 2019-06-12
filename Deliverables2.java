package StringUnicode;
import java.util.Scanner;
public class Unicode {
	public static void main(String[] args) {
	Scanner scr = new Scanner (System.in);
	System.out.println("Input first string");
	String str1 = scr.next();
	System.out.println("Input second string");
	String str2 = scr.next();
	int sum1 = 0;		
	for (int i = 0; i < str1.length(); i++) {
        char c = str1.charAt(i);
        int retVal = str1.codePointAt(i);
        System.out.print(c + ":" + (retVal)+  " " + "\n");
        sum1 =sum1 + c;
    }
	int sum2 = 0;
	for (int i = 0; i < str2.length(); i++) {
        char c2 = str2.charAt(i);
        int retVal2 = str2.codePointAt(i);
        System.out.print("\n"+ c2 + ":" + (retVal2) + " ");
        sum2 = sum2 + c2;    
    }
	System.out.println("\n" + "Difference(absolute value): " + (Math.abs(sum1 - sum2)));	
	}
}

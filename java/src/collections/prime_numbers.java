package collections;

import java.util.*;
public class prime_numbers {

	public static void main(String[] args) {
		
     int i;
     System.out.println(" Enter a Number");

     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     boolean iscomposite = true;
     
     if (n<2)
    	 iscomposite = true;
     else 
    	 for(i= 2;i < n; i++) {
    		 if (n%i==0) {
    			 iscomposite = true;
    			 break;
    		 }
    	 }
     String CheckPrime = iscomposite ? " is a Prime ": " is a Not a Prime";
     System.out.println(n+CheckPrime);
     
	}

}
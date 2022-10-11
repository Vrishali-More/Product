package com;

public class Prime {
	 static boolean checkprime(int no) {
	        int i,n =0;
	        n = no/2;
	        
	        if (no==0||no==1) {
	            return false;
	            
	        }
	        
	        for(i = 2; i <=n;i++) {
	                if (no%i == 0) {
	                    return false;
	                }
	            }
	        return true;
	        }
	           
	    public static void main(String args[]) {
	        System.out.println(checkprime(3));
	    }

}

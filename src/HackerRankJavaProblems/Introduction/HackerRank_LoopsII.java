package HackerRankJavaProblems.Introduction;

import java.util.Scanner;

public class HackerRank_LoopsII {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	     
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            
	            for(int j=0;j<n;j++)
	            {
	         
	                a+=b;
	                
	                 
	             System.out.print(a+ " ");
	             b=b*2;
	               
	            }
	            if(i<t-1)
	            {
	                System.out.print("\n");
	            }
	             
	        }
	}// TODO Auto-generated method stub

	}



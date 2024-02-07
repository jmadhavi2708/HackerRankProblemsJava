package HackerRankJavaProblems.Introduction;

import java.util.Scanner;

public class HackerRank_EndofFile {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
         int i=1;
         String line;

while(sc.hasNext())
{
        line = sc.nextLine();
           System.out.println(i + " "+ line);
           i++;
 
}  
		// TODO Auto-generated method stub

	}

}

package HackerRankJavaProblems.Introduction;
import java.util.Scanner;


public class HackerRank_If_else {
	
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);

int N = scanner.nextInt();
scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
 if(N %2 ==0)
{
    if(N>=6 && N<=20)
    {
    System.out.println("Weird");
    }

else
{
  System.out.println("Not Weird");
}
}
else{
     System.out.println("Weird");
    
}
}
}








import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class leapyear {
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n;
		System.out.println("Enter the year");
		n=Integer.parseInt(br.readLine());
		if(n%4==0&&n%100!=0)
		System.out.println("leap Year");
		else if(n%4==0&&n%100==0&&n%400==0)
		System.out.println("leap Year");
		else 
			System.out.println("not a leap Year");	
	}
}

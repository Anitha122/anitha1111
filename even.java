import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class even {
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		Integer n;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		if(n%2==0)
		System.out.println("even");
		else if(n%2!=0)
	  System.out.println("odd");
 }
 }

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class sumN {
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n,i,sum=0;
		System.out.println("enter the number");
		n=Integer.parseInt(br.readLine());
		for(i=0;i<=n;i++)
		{
		sum=sum+i;
		}
		System.out.println(sum);
	}
}

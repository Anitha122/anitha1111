import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class digits{
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n;
		System.out.println("enter the number");
		n=Integer.parseInt(br.readLine());
		String a=Integer.toString(n);
		System.out.println("number of digits is:"+a.length());
	}
}

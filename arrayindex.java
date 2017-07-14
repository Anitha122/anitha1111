package guvi;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class arrayindex {
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int i,j;
		String c,c1="";
		System.out.println("Enter the size of an array");
		int n=Integer.parseInt(br.readLine());
		int a[]=new int[n];
		System.out.println("Enter the values of an array");
		for(i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
			if(a[i]<0)
			{
				a[i]=-1*a[i];
			}
			c=Integer.toString(a[i]);
			c1=c1+c;
		}
		for(j=0;j<c1.length();j++)
		{
			int k=Integer.parseInt(Character.toString(c1.charAt(j)));
			
			int l=c1.indexOf(c1.charAt(j));
			if(k==l)
			{
				System.out.println(k);
			}
			
		}
	}
}

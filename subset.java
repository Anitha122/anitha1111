package guvi;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class subset {
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int i,j,e=0;
		String c="",c1="",d="",d1="";
		System.out.println("Enter the size of an array 1");
		int n=Integer.parseInt(br.readLine());
		System.out.println("Enter the size of an array 2");
		int m=Integer.parseInt(br.readLine());
		int a1[]=new int[n];
		int a2[]=new int[m];
		System.out.println("Enter the values of an array 1");
		for(i=0;i<n;i++)
		{
			a1[i]=Integer.parseInt(br.readLine());
			c=Integer.toString(a1[i]);
			c1=c1+c;
		}
		System.out.println("Enter the values of an array 2");
		for(i=0;i<m;i++)
		{
			a2[i]=Integer.parseInt(br.readLine());
			d=Integer.toString(a2[i]);
			d1=d1+d;
		}
		for(j=0;j<c1.length();j++)
		{
			if(d1.contains(Character.toString(c1.charAt(j))))
			{
				e++;
			}
		}
		if(e==c1.length())
	    System.out.println("a1 is a subset of a2");
		else
		System.out.println("a1 is not a subset of a2");	
		}
}

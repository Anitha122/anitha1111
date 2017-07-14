package guvi;
import java.io.*;
public class repeat {
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int i,j,c = 0,d=0;
		System.out.println("Enter the size of an array");
		int n=Integer.parseInt(br.readLine());
		int a[]=new int[n];
		System.out.println("Enter the values of an array");
		for(i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					c=a[i];
					d=1;
					break;
				}
		    }
			if(d==1)
				break;
		}
		System.out.println("The repeated first element is "+c);

}
}

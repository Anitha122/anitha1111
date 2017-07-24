import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
public class repeatarray {
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n,i,j;
		HashSet<Integer>h=new HashSet<Integer>();
		System.out.println("Enter the no of registration number");
		n=Integer.parseInt(br.readLine());
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("The repeated numbers are: ");
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
			if(a[i]==a[j])
			{
			h.add(a[i]);
			}
			}
		}
	    for(Integer k11:h)
		{
			System.out.println(k11);
		}
	}
}
	

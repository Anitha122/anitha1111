import java.io.*;
public class unique2 {
	public static void main(String args[]) throws NumberFormatException, IOException
	{
	int i;
	String a1,a2="";
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the size of an array");
	int n=Integer.parseInt(br.readLine());
	int a[]=new int[n];
	System.out.println("Enter the values of an array");
	for(i=0;i<n;i++)
	{
		a[i]=Integer.parseInt(br.readLine());
		a1=Integer.toString(a[i]);
		a2=a2+a1;
	}
	for(i=0;i<a2.length();i++)
	{
	    if(a2.indexOf(a2.charAt(i))==a2.lastIndexOf(a2.charAt(i)))
	    {
	    	System.out.println("The unique value is "+a2.charAt(i));
	    }
	}
	}
}


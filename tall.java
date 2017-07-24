import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class tall{
	public static void main(String args[]) throws NumberFormatException, IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int a1,i,j,k;
	 System.out.println("Enter the no of students");
	 a1=Integer.parseInt(br.readLine());		
	 float a[]=new float[a1];
	 float b[]=new float[a1];
	 System.out.println("Enter the heights in feet");
	 for(i=0;i<a1;i++)
	 {
		 a[i]=Float.parseFloat(br.readLine());
	 }
	 System.out.println("Enter the k value");
	 k=Integer.parseInt(br.readLine());
	 Arrays.sort(a);
	 j=0;
	 for(i=a.length-1;i>=0;i--)
	 {
		 b[j]=a[i];
		 j++;
	 }
	 System.out.println(b[k]);
	}
}

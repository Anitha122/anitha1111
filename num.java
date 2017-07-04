import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class num {
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		Integer n;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		if(n>0)
		System.out.println("positive ");
		else if(n<0)
	    System.out.println("negative ");
		else if(n==0)
		System.out.println("zero");
	}

}

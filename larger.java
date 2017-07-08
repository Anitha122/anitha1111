import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class larger {
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a,b,c,max;
		System.out.println("Enter first Number");
		a=Integer.parseInt(br.readLine());
		System.out.println("Enter second Number");
		b=Integer.parseInt(br.readLine());
		System.out.println("Enter third Number");
		c=Integer.parseInt(br.readLine());
		if(a>b&&a>c)
			max=a;
		else if(b>c)
			max=b;
		else
			max=c;
		System.out.println("Largest Number:"+max);
	}
	}

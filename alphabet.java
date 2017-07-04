import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class alphabet {
	public static void main(String args[]) throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	char c;
	c=(char)br.read();
    int n=Math.abs(c);
	if(n>=65&&n<=90||n>=97&&n<=122)
	System.out.println("alphabet");
	else 
    System.out.println("not an alphabet");
}
}

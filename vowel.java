import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class vowel {
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		String c;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		c=br.readLine();
		if(c.equalsIgnoreCase("a")||c.equalsIgnoreCase("e")||c.equalsIgnoreCase("i")||c.equalsIgnoreCase("o")||c.equalsIgnoreCase("u"))
		System.out.println("vowel");
		else
		System.out.println("consonant");
	}
}

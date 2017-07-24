import java.util.*;
public class reverseword{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String a;
    int i;
    System.out.println("Enter the string");
    a = sc.nextLine();
    String b[]=a.split(" ");
    for(i=b.length-1;i>=0;i--)
    {
    	if(i!=0)
    	System.out.print(b[i]+" ");
    	if(i==0)
    	System.out.print(b[i]);
    }
   }
}

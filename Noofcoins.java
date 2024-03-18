import java.util.*;

public class Noofcoins {
    public static void main(String[] args) {
      
      //System.out.println("Hello, World!");
      int n;
      int one,two,five;
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter any number:");
      n=sc.nextInt();
      five=((n-4)/5);
      if(((n-5*five)%2)==0)
      {
        one=2;
      }
      else
      {
        one=1;
      }
      two=(n-5*five-one)/2;
      System.out.println("Total:"+(one+two+five)+"\n"+"5 rupee coin:"+five+"\n"+"2 rupee coin:"+two+"\n"+"1 ruppe coin:"+one);
  }
}
package java1;
import java.util.Scanner;
public class Java {

 public static void main(String[] args) {
     Scanner obj=new Scanner(System.in);
  int a ;
  int b ;
  //int d=;
  //int sum;

  System.out.println("Before ");
  System.out.println("Value of a is :" );
  a=obj.nextInt();
  System.out.println("Value of b is :" );
  b=obj.nextInt();
  a=a+b;
  b=a-b;
  a=a-b;


  System.out.println("After ");
  System.out.println("Value of a is :" + a);
  System.out.println("Value of b is :" + b);
 }
}
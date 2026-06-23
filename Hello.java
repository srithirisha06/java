import java.util.Scanner;

class Hello{
public static void main (String[] args) 
{
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int c =a;
a=b;
b=c;
System.out.println(a);
System.out.println(b);

}
}
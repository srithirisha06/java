import java.main.Scanner;
public class While{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int count=0;
        
        While(n>0){
            n/=10;
            count++;


        }
        System.out.println(count);
    }
}
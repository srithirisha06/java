public class Exceptiontask {
    public static void main(String[] args) {
        System.out.println("Program started");
        try{
            int result=10/0;
            System.out.println(result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Number cannot be divided by zero");
        }
        finally{
            System.out.println("This is finally block");
        }
        System.out.println("Program ended");
    }
    
}

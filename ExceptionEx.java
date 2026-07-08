public class ExceptionEx {
    public static void main(String[] args) {
        System.out.println("Program started");
        try{
            int result=10/0;
            System.out.println(result);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("Program ended");
    }
}

   


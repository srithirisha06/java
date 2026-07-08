public class WrapperEx {
    public static void main(String[] args) {
        String s="456";
        int x=Integer.parseInt(s);
        String to int
        System.out.println(x);
        int n=100;
        Integer i=Integer.valueOf(n);//boxing-primitive to obj
        i=200;//autoboxing
        int a=i.intValue();//unboxing obj to primitive
        int b=i;//auto unboxing
    }
    
}

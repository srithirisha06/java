import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class Setex {
        public static void main(String[]var0){
        HashSet <Integer> var1 =new HashSet<>();
        var1.add(10);
        var1.add(60);
        var1.add(70);
        var1.add(80);
        for (int var3 : var1){
            System.out.print(var3 + " ");
         
            
        }
        System.out.println();
        LinkedHashSet <Integer> var6 = new LinkedHashSet<>();
        var6.add(10);
        var6.add(80);
        var6.add(70);
        var6.add(20);
        for (int var4 : var6){
            System.out.print(var4 + " ");
        }
        System.out.println();
        TreeSet <Integer> var8 = new TreeSet<>();
        var8.add(90);
        var8.add(100);
        var8.add(60);
        var8.add(50);
        for (int var5 : var8){
            System.out.print(var5 + " ");
        }


    }
    
}

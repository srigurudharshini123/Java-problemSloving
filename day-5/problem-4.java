// Currency formatter
// input:12324.134
// output:
// US: $12,324.13
// India: Rs.12,324.13
// China: ￥12,324.13
// France: 12 324,13 €
import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        NumberFormat u=NumberFormat.getCurrencyInstance(Locale.US);
        String us=u.format(payment);
         NumberFormat i=NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        String india=i.format(payment);
         NumberFormat c=NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china=c.format(payment);
         NumberFormat f=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france=f.format(payment);
        
      
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

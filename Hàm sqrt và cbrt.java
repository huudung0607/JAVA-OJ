
import java.util.Scanner;
import java.lang.Math;
public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        double canHai = Math.sqrt(x);
        double canBa = Math.cbrt(x);
        System.out.printf("%.2f\n", canHai);
        System.out.printf("%.3f", canBa);
    }
}

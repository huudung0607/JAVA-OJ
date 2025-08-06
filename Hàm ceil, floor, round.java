
import java.util.Scanner;
import java.lang.Math;
public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        System.out.println((int)Math.floor(x));
        System.out.println((int)Math.ceil(x));
        System.out.println((int)Math.round(x));
    }
}


import java.util.Scanner;
import java.lang.Math;
public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double res = Math.pow(x,y);
        System.out.println((long)res);
    }
}

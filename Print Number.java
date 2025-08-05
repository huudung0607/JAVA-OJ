
import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x;
        long y;
        float f;
        double d;
        x = sc.nextInt();
        y = sc.nextLong();
        char c = sc.next().charAt(0);
        f = sc.nextFloat();
        d = sc.nextDouble();
        System.out.println(x);
        System.out.println(y);
        System.out.println(c);
        System.out.printf("%.2f\n",f);
        System.out.printf("%.9f\n",d);
    }
}

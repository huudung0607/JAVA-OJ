
import java.util.Scanner;
import java.lang.Math;
public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long res1 = x % 10;
        long res2 = x % 100;
        System.out.println(res1);
        System.out.println(res2);
    }
}

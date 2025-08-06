
import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Long x = sc.nextLong();
        Long y = sc.nextLong();
        Long z = sc.nextLong();
        Long t = sc.nextLong();
        System.out.println(y + "," + z + "," + x + "," + t);
        Long sum = 1L * x + y + z + t;
        System.out.println(sum);
        Long res = 1L * x - y + z * t;
        System.out.println(res);
    }
}

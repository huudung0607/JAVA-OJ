
import java.util.*;
import java.lang.*;
import java.io.*;
public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        long tmp = x;
        x = y;
        y = tmp;
        System.out.print(1L * 128 * x + 97 * y + 1000);
    }
}

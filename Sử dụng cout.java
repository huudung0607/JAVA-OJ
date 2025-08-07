
import java.util.*;
import java.lang.*;
import java.io.*;
public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int t = sc.nextInt();
        System.out.println(x + " " + y + " " + z + " " + t);
        System.out.println(y + "--" + z + "--" + x + "--" + t);
        System.out.println((1L * 2*x) + "," + (1L * 3*y) + "," + (1L * 4*z) + "," + (1L * 5*t));
        System.out.println("KET THUC !!");
    }
}

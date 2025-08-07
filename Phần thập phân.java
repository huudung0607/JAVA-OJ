import java.util.*;
import java.lang.*;
import java.io.*;
public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double f = sc.nextDouble();
        System.out.println((int)f);
        System.out.printf("%.2f",f - (int)f);
    }
}

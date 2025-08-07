import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Chu vi HCN la : " + (1L * (a + b)*2));
        System.out.println("Dien tich HCN la : " + 1L * a * b);
    }
}

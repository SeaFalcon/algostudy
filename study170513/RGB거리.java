package study170513;

/**
 * Created by SeaFalcon on 2017-05-13.
 */
public class RGB거리 {
    public static void main(String [] args){
        fibonacci(5);
    }

    static int fibonacci(int n) {
        if (n==0) {
            System.out.print("0");
            return 0;
        } else if (n==1) {
            System.out.print("1");
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}

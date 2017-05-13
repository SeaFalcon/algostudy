package study170513;

import java.util.Scanner;

/**
 * Created by SeaFalcon on 2017-05-13.
 */
public class Fibonacci {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int [] n = new int[testCase];

        int [] arr = new int[2];

        for(int i=0; i<testCase; i++){
            n[i] = sc.nextInt();
        }

        for(int i=0; i<testCase; i++){
            fibonacci(n[i], arr);
            System.out.println(arr[0] + " " + arr[1]);
            arr[0] = arr[1] = 0;
        }
    }

    static int fibonacci(int n, int [] arr) {
        if (n==0) {
            //System.out.print("0 ");
            arr[0]++;
            return 0;
        } else if (n==1) {
            //System.out.print("1 ");
            arr[1]++;
            return 1;
        } else {
            return fibonacci(n-1, arr) + fibonacci(n-2, arr);
        }
    }
}
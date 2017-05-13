package primeNumber;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by SeaFalcon on 2017-01-07.
 * Problem 2581
 */
public class PrimeStep02 {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int min = Integer.parseInt(br.readLine());
        int max = Integer.parseInt(br.readLine());

        boolean prime [] = new boolean[10001];
        prime[0] = true;
        prime[1] = true;

        for(int i=0; i*i<prime.length; i++){
            if(prime[i] == false){
                for(int j=i+i; j<prime.length; j=j+i){
                    prime[j] = true;
                }
            }
        }

        int sum = -1;
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i=min; i<=max; i++) {
            if (prime[i] == false) {
                arr.add(i);
                sum += i;
            }
        }

        if(sum != -1){
            sum++;
            System.out.println(sum);
            System.out.println(arr.get(0));
        }else{
            System.out.println(sum);
        }



    }
}

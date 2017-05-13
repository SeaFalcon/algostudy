package primbeNumber;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by SeaFalcon on 2017-01-07.
 * Problem 1978
 */
public class PrimeStep01 {
    public static void main(String args[]) throws Exception{
    	boolean prime[] = new boolean[1001];
        int answer = 0;

        for (int i = 0; i < prime.length; i++) {
            prime[i] = true;
        }
        prime[0] = false;
        prime[1] = false;

        for(int i = 2; i < 1001; i++) {
            if(prime[i] == true){
                for(int j=i+i; j<1001; j=j+i){
                    prime[j] = false;
                }
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        String num [] = br.readLine().trim().split(" ");

        for (int i = 0; i < cnt; i++) {
            if(prime[Integer.parseInt(num[i])] == true){
                answer++;
            }
        }

        System.out.println(answer);

    }
}
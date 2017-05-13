import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by SeaFalcon on 2016-12-24.
 */
public class Stair2579 {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int dp [][] = new int[n][2];
        dp[0][0] = arr[0];
        dp[0][1] = 0;
        dp[1][0] = arr[1];
        dp[1][1] = arr[0] + arr[1];

        for(int i=2; i<n; i++) {
            dp[i][0] = Math.max(dp[i-2][0], dp[i-2][1]) + arr[i];
            dp[i][1] = dp[i-1][0] + arr[i];
        }

        System.out.println(Math.max(dp[n - 1][0], dp[n - 1][1]));
        br.close();
    }
}

/**
 * Created by SeaFalcon on 2016-12-10.
 */
import java.io.*;
import java.util.StringTokenizer;

public class Jump1890{
    public static BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw =
            new BufferedWriter(new OutputStreamWriter(System.out));

    public static long[][] dp;
    public static int[][] arr;
    public static int n;

    public static void main(String args[]) throws IOException{
        n = Integer.parseInt(br.readLine());
        dp = new long[n][n];
        arr = new int[n][n];
        StringTokenizer st;
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                dp[i][j] = -1;
            }
        }

        bw.write(cal(0, 0)+"\n");
        bw.close();
    }

    public static long cal(int y, int x){
        if(dp[y][x] != -1) return dp[y][x];
        else if(x == n-1 && y == n-1) return 1;
        dp[y][x] = 0;
        if(x+arr[y][x] < n) dp[y][x] += cal(y, x+arr[y][x]);
        if(y+arr[y][x] < n) dp[y][x] += cal(y+arr[y][x], x);
        return dp[y][x];
    }
}
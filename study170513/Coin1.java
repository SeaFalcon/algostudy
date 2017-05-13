package study170513;

/**
 * Created by SeaFalcon on 2017-05-13.
 * https://www.acmicpc.net/problem/2293
 */
public class Coin1 {
}


/*
    3   10
    1
    2
    5

    1x10
    1x8     2x1
    1x6     2x2
    1x5     5x1
    1x4     2x3
    1x2     2x4

    천천히 푸는 법
    1. Container 사용 ( map, set )

    [1,2] == [2,1] 같아야함, 가장좋은 해결법은 sort




#include <cstdio>
#include <iostream>
using namespace std;

int d[10001];
int a[101];

int main() {

   int n, k;
   cin >> n >> k;
   for (int i = 0; i < n; i++) {
      scanf("%d", &a[i]);
   }

   d[0] = 1;

   // for문의 순서를 바꾸면 값이 다르게 나온다.
   for (int j = 0; j < n; j++) { // 사용할 수 있는 동전
      for (int i = 0; i <= k; i++) { // 만드는 돈
         if (i - a[j] >= 0) {        // 100 원을 100원짜리로는 1, 500원 짜리로는 0 이걸확인하는 부분
            d[i] += d[i - a[j]];
         }
      }
   }

   cout << d[k] << '\n';

   return 0;
}

*/
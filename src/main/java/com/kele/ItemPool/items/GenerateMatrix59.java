package com.kele.ItemPool.items;

import com.kele.ItemPool.Solution;

/**
 * @author: kele3601
 * @date: 2022/10/13 17:02
 * @description:
 */
public class GenerateMatrix59 extends Solution {

    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int l = 0, r = n - 1, t = 0, b = n - 1;
        int num = 1, tar = n * n;
        while (num <= tar) {
            //left to right
            for (int i = l; i <= r; i++) {
                res[t][i] = num++;
            }
            t++;

            //top to bottom
            for (int i = t; i <= b; i++) {
                res[i][r] = num++;
            }
            r--;

            //right to left
            for (int i = r; i >= l; i--) {
                res[b][i] = num++;
            }
            b--;

            //bottom to top
            for (int i = b; i >= t; i--) {
                res[i][l] = num++;
            }
            l++;
        }

        return res;
    }
}

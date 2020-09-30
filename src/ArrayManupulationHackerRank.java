import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class ArrayManupulationHackerRank {
    static long arrayManipulation_failed_took_too_much_time(int n, int[][] queries) {
        long [] ans = new long[n];
        long max = -9999;


        for (int i = 0; i < queries.length ; i++) {
            int [] query = queries[i];
            int a = query[0];
            int b = query[1];
            int k = query[2];
            // System.out.println("a = " + a + " b = " + b);

            for (int j = a-1; j < b; j++) {
                long itemInAns = ans[j];
                long addition = itemInAns + k;
                // add k
                ans[j] = addition;
                if(addition > max){
                    max = addition;
                }

            }
            //System.out.println(Arrays.toString(ans));

        }

        return max;
    }


    static long arrayManipulation(int n, int[][] queries) {
        long [] ans = new long[n*2];
        long max = -99999;



        for (int i = 0; i < queries.length ; i++) {
            int [] query = queries[i];
            int a = query[0];
            int b = query[1];
            int k = query[2];

ans[a-1] += k;
            ans[ b] -= k;

        //    System.out.println(Arrays.toString(ans));


        }
    //    System.out.println(Arrays.toString(ans));

        for (int i = 1; i < ans.length ; i++) {
            long num = ans[i];
            long add = ans[i-1] +num ;
            ans[i] = add;
            if(add>max){
                max = add;
            }


        }

        return max;
    }


    public static void main (String[] args){
        /*

        2 3 603
1 1 286
4 4 882
        */

//int[][]arr = {{2,6,8},{3,5,7},{1,8,1},{5,9,15}};
      //  int[][]arr = {{1,5,3},{4,8,7},{6,9,1}};
        int [][] arr = {{1 ,2, 100},
                {2, 5, 100},
                {3, 4, 100}};

//        int [][] arr = {{2 ,6 ,8},
//        {3 ,5 ,7},
//        {1 ,8 ,1},
//        {5 ,9, 15}};
        System.out.println(arrayManipulation(10,arr));


    }
}

/*
QUESTION
// https://www.hackerrank.com/challenges/crush/problem
// had to watch this video to be able to solve it https://www.youtube.com/watch?v=JtJKn_c9lB4&feature=youtu.be


// Array Manipulation
Starting with a 1-indexed array of zeros and a list of operations, for each operation add a value to each of the array element between two given indices, inclusive. Once all operations have been performed, return the maximum value in the array.
 */
// https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
//2d array solution
import java.util.ArrayList;
import java.util.List;

public class MaxHourGlassHackerRank {
    static int hourglassSum(int[][] arr) {


        int max = -999999999;



        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                int a = arr[i][0 + j];
                int b = arr[i][1 + j];
                int c = arr[i][2+ j];
                int d = arr[i + 1][1+ j];
                int e = arr[i + 2][0+ j];
                int f = arr[i + 2][1+ j];
                int g = arr[i + 2][2+ j];

                int add = a + b + c + d + e + f + g;
                if (add > max) {
                    max = add;
                }


            }
        }

        return max;

    }

    public static void main (String[] args){
int[][] arr = {
                {1, 1, 1, 0, 0, 0,},
                {0, 1, 0, 0, 0, 0,},
                {1, 1, 1, 0, 0, 0,},
                {0, 0, 2, 4, 4, 0,},
                {0, 0, 0, 2, 0, 0,},
                {0, 0, 1, 2, 4, 0,},

        };
        System.out.println(hourglassSum(arr));

    }
}

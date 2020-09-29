import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class ArrayManupulationHackerRank {

static Long[] inBetween (Long[] track, int[]query){



        int a = query[0];
        int b = query[1];
        int k = query[2];

        long trackA = track[0];
        long trackB = track[1];
        long trackK = track[2];

        long newA = 0;
        long newB = 0;
        long newK = 0;

        if(a <= trackB && a >= trackA){
            newA = a;
        }else if(a < trackA ){
            newA = trackA;
        } else {
           // System.out.println("comparing a=" + a + " trackA=" + trackA);
        }

        if(b >= trackB && newA != 0){
            newB = trackB;
        } else if(b < trackB && b >trackA){
            newB = b;
        }

        if(newA != 0 && newB != 0){
            newK = trackK + k;
            track[0] = newA;
            track[1] = newB;
            track[2] = newK;
        } else if ( k > track[2]){
            newK =  k;
            track[0] = (long) a;
            track[1] = (long) b;
            track[2] = newK;
        } else {
            track[2] = (long) 0;
        }

        return track;



}
    static long arrayManipulation(int n, int[][] queries) {


        // long[][] tracks = {{queries[0][0],queries[0][1],queries[0][2]}};
        ArrayList<Long[]> tracks = new ArrayList<>();
        long globalMax = queries[0][2];
        for (int i = 0; i < queries.length; i++) {

            int[] query = queries[i];
            if (i == 0) {
                Long[] l = new Long[3];
                l[0] = (long) queries[0][0];
                l[1] = (long) queries[0][1];
                l[2] = (long) queries[0][2];
                tracks.add(l);
                continue;
            }



            Long[] betweenMax = new Long [3];
            betweenMax[0] = 0l;
            betweenMax[1] = 0l;
            betweenMax[2] = 0l;
            for (Long[] track : tracks) {
                Long[] between = inBetween(track, query);
//
//                System.out.println("track -- " + Arrays.toString(track));
//                System.out.println("query -- " + Arrays.toString(query));
              //  System.out.println("between -- " + Arrays.toString(between));

                if (between[2] != 0) {

                    if (between[2] > (betweenMax[2] != null ? betweenMax[2] : 0)) {
                        betweenMax = between;
                    }

                }

            }
            if(betweenMax[2] != 0){
              //  System.out.println("aadding -- " + Arrays.toString(betweenMax));
                Long[] betweenLong = new Long[3];
                betweenLong[0] = (Long) betweenMax[0];
                betweenLong[1] = (Long) betweenMax[1];
                betweenLong[2] = (Long) betweenMax[2];






                tracks.add(betweenLong );
                if(betweenMax[2] > globalMax){
                    globalMax = betweenMax[2];
                }

            } else {
                Long[] queryLong = new Long[3];
                queryLong[0] = (long) query[0];
                queryLong[1] = (long) query[1];
                queryLong[2] = (long) query[2];
                tracks.add(queryLong );
                System.out.println("aadding -- " + Arrays.toString(queryLong));

                if(queryLong[2] > globalMax){
                    globalMax = betweenMax[2];
                }
            }



        }
//        String all = "";
//        for (Long[] track : tracks) {
//
//            all+= (" " + Arrays.toString(track));
//        }
//        System.out.println("all-- " + all);

        return globalMax;
    }

    static long arrayManipulation_failed(int n, int[][] queries) {
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


// Array Manipulation
Starting with a 1-indexed array of zeros and a list of operations, for each operation add a value to each of the array element between two given indices, inclusive. Once all operations have been performed, return the maximum value in the array.
 */
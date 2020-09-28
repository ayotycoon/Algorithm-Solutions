import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class MinimumSwapsHackerRank {

static int[] originalQueue(int[] q){
        int max = -9999;
        int[] arr = new int[q.length];
        for (int i = 0; i < q.length; i++) {
            if(q[i] > max){
                max = q[i];
            }

        }
        for (int i = 1; i <= max; i++) {
           arr[i-1] = i;

        }

        return arr;

    }
    static int minimumSwaps(int[] q) {
        int[] original = originalQueue(q);

            int moves = 0;
            int[] arranged = Arrays.copyOf(q, q.length);

            Map<Integer,Integer> arrangedMap = new HashMap<Integer, Integer>() ;

        for (int i = 0; i < arranged.length; i++) {
            arrangedMap.put(arranged[i],i);
        }


                for (int i = 0; i <arranged.length ; i++) {

                   if(arranged[i] != original[i]){


                       int indexInArranged = arrangedMap.get(original[i]);

moves += 1;

                           // shift the current item
                           int toBeMovedIndex = indexInArranged;
                           int itemAtToBeMovedIndex = arranged[toBeMovedIndex];
                           int itemAtCurrentIndex = arranged[i];
                           // switch
                           arranged[toBeMovedIndex] = itemAtCurrentIndex;
                           arranged[i] = itemAtToBeMovedIndex;

//                           System.out.println(Arrays.toString(arranged));

// update the map
                           arrangedMap.put(itemAtToBeMovedIndex,i);
                           arrangedMap.put(itemAtCurrentIndex,toBeMovedIndex);








                }


            }

return moves ;


    }
    public static void main (String[] args){
int[]arr = {4 ,3, 1, 2};

        System.out.println(minimumSwaps(arr));


    }
}

/*
QUESTION
// https://www.hackerrank.com/challenges/minimum-swaps-2/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

// minimum swaps

You are given an unordered array consisting of consecutive integers  [1, 2, 3, ..., n] without any duplicates. You are allowed to swap any two elements. You need to find the minimum number of swaps required to sort the array in ascending order.

For example, given the array  we perform the following steps:
 */
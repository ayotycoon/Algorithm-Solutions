import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class NewYearChaosHackerRank {

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
    static void minimumBribes(int[] q) {
        int[] original = originalQueue(q);

            int moves = 0;
            int[] arranged = Arrays.copyOf(q, q.length);

            Map<Integer,Integer> arrangedMap = new HashMap<Integer, Integer>() ;

        for (int i = 0; i < arranged.length; i++) {
            arrangedMap.put(arranged[i],i);
        }


                for (int i = original.length - 1; i >= 0 ; i--) {
                    // find the index of the largest unsorted ellement
                    int largest = original[i];
int indexInArranged = arrangedMap.get(largest);
                    int diff = i - indexInArranged;
                    if(diff > 2){
                        System.out.println("Too chaotic");
                    return;
                    }
                   if(diff != 0){


moves += diff;
                       for (int j = 1; j <= diff ; j++) {
                           // shift the current item
                           int toBeMovedIndex = indexInArranged + j;
                           int itemAtToBeMovedIndex = arranged[toBeMovedIndex];
                           int itemAtToPreviousIndex = arranged[toBeMovedIndex - 1];
                           // switch
                           arranged[toBeMovedIndex -1] = itemAtToBeMovedIndex;
                           arranged[toBeMovedIndex] = itemAtToPreviousIndex;

//                           System.out.println(Arrays.toString(arranged));

// update the map
                           arrangedMap.put(itemAtToBeMovedIndex,toBeMovedIndex -1);
                           arrangedMap.put(itemAtToPreviousIndex,toBeMovedIndex);
                       }







                }


            }

System.out.println(moves);


    }
    public static void main (String[] args){
int[]arr = {2 ,1 ,5 ,3, 4};

        minimumBribes(arr);


    }
}

/*
QUESTION
// https://www.hackerrank.com/challenges/new-year-chaos/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
// new year chaos
It's New Year's Day and everyone's in line for the Wonderland rollercoaster ride! There are a number of people queued up, and each person wears a sticker indicating their initial position in the queue. Initial positions increment by  from  at the front of the line to  at the back.

Any person in the queue can bribe the person directly in front of them to swap positions. If two people swap positions, they still wear the same sticker denoting their original places in line. One person can bribe at most two others. For example, if  and  bribes , the queue will look like this: .

Fascinated by this chaotic queue, you decide you must know the minimum number of bribes that took place to get the queue into its current state!

Function Description

Complete the function minimumBribes in the editor below. It must print an integer representing the minimum number of bribes necessary, or Too chaotic if the line configuration is not possible.

minimumBribes has the following parameter(s):

q: an array of integers
Input Format

The first line contains an integer , the number of test cases.

Each of the next  pairs of lines are as follows:
- The first line contains an integer , the number of people in the queue
- The second line has  space-separated integers describing the final state of the queue.


*/

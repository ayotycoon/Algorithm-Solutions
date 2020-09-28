
public class LeftRotationHackerRank {
    static int[] rotLeft(int[] a, int d) {
        // 1 2 3 4 5
        int[] ans = new int[a.length];

        for(int i = 0; i < a.length; i ++){
            int movement = i - d;
            if(movement < 0){
                movement = a.length + movement;//%a.length;
            }

            System.out.println("movement - " + movement);
            ans[i] = a[movement];

        }

        return ans;


    }
    public static void main (String[] args){
int[] arr = {1,2,3,4,5};
        System.out.println(rotLeft(arr,4));

    }
}


/*
QUESTION
//https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays&h_r=next-challenge&h_v=zen
//Left Rotation Hackerrank


A left rotation operation on an array shifts each of the array's elements  unit to the left. For example, if  left rotations are performed on array , then the array would become .

Given an array  of  integers and a number, , perform  left rotations on the array. Return the updated array to be printed as a single line of space-separated integers.

Function Description

Complete the function rotLeft in the editor below. It should return the resulting array of integers.

rotLeft has the following parameter(s):

An array of integers .
An integer , the number of rotations.
Input Format

The first line contains two space-separated integers  and , the size of  and the number of left rotations you must perform.
The second line contains  space-separated integers .

Constraints

Output Format

Print a single line of  space-separated integers denoting the final state of the array after performing  left rotations.

 */
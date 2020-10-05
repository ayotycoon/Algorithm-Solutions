import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SquareConfigurations {
    public static Long getX(long m, long n) {

        if(m > n){
            Long j = n;
            n = m;
            m = j;
        }

        return m * (m + 1) * (2 * m + 1) / 6 + (n - m) * m * (m + 1) / 2;
    }

    public static void solve(long x) {
        if(x==1){
            System.out.println(1);
            System.out.println(1+ " " + 1);
            return;
        }
        int same = 0;
        ArrayList<String> ans = new ArrayList<String>();


        long n = x;

        for (long m = 1; m < n + 1; m++) {
            n = (((6 * x) - (m * (m + 1) * (2 * m + 1))) / (3 * (m * m + m))) + m;
            if(m <= n){
                if (getX(m, n) == x) {
                    String pair = m + " " + (long) n;
                    ans.add(pair);

                    if(m == n){
                        same++;
                    }


                }
            } else {
                break;
            }

        }System.out.println((ans.size() * 2) - same);


        for(int i = 0;i < ans.size(); i++) {
            String __mn = ans.get(i);
            String[] _mn =__mn.split(" ");

            System.out.println(_mn[0] + " " + _mn[1]);



        }

        for(int i = ans.size()-1; i >= 0; i--) {
            String __mn = ans.get(i);
            String[] _mn =__mn.split(" ");

            if(!_mn[1].equals(_mn[0])){
                System.out.println(_mn[1] + " " + _mn[0]);


            }

        }


    }





    public static void main(String[] args) {

        long x = 26;

   solve(x);




    }

}



/*
QUESTION
// https://www.hackerrank.com/contests/apt-coding-challenge/challenges/square-configurations/problem

Lucy is a brilliant student. Her teacher asked her to determine the number of unique squares in a m x n board. In no time, Lucy produced the answer for any given m and n. For example, when m = 15 and n = 1, then the answer is 15. When m = 2 and n = 9, the answer 26.

Lucy's teacher was so surprised Lucy could solve the question effortlessly, so she gave Lucy a variant of the problem which Lucy is now stuck on. Can you help Lucy?

Given a number d, determine the number of boards with exactly d unique squares.

Input Format

*/


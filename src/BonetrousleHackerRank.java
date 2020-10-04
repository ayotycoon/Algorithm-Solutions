import java.util.Arrays;

public class BonetrousleHackerRank {
    static long[] range (int start, int stop){
long [] r = new long[(stop-start)];
int track = 0;
        for (int i = start; i < stop; i++) {
            r[track] = i;


            track++;

        }

return r;
    }

    static long[] bonetrousle(long n, long k, int b) {

        long low = b*(b+1)/2;
        long high = b*k - b*(b-1)/2;

        if( n>=low && n<=high){
        long x = (n-low)/b;

        long diff = n - ((x+1)*b) - (b*(b-1)/2);

        long [] y = range((int)x+1,(int)x+1+b);


        int index = (int)(diff >= 0 ? diff  : y.length - diff%y.length);
        long val = y[index] + diff;
        y[index] = val;

            return y;
        }
	else {
           return null;
        }
    }




    public static void main (String[] args){
        int n = 95;
        int k = 20;
        int b = 10;



        System.out.println(Arrays.toString(bonetrousle(n,k,b)));


    }
}

/*
QUESTION
// https://www.hackerrank.com/challenges/bonetrousle/problem

Here's a humerus joke:

Why did Papyrus the skeleton go to the store by himself? Because he had no body to go with him!

Did you like it? Don't worry, I've got a ton more. A skele-ton.

Once upon a time, Papyrus the skeleton went to buy some pasta from the store. The store's inventory is bare-bones and they only sell one thing — boxes of uncooked spaghetti! The store always stocks exactly  boxes of pasta, and each box is numbered sequentially from  to . This box number also corresponds to the number of sticks of spaghetti in the box, meaning the first box contains  stick, the second box contains  sticks, the third box contains  sticks, …, and the  box contains  sticks. Because they only stock one box of each kind, the store has a tendon-cy to sell out of spaghetti.

During each trip to the store, Papyrus likes to buy exactly  sticks of spaghetti by purchasing exactly  boxes (no more, no less). Not sure which boxes to purchase, Papyrus calls Sherlock Bones for help but he's also stumped! Do you have the guts to solve this puzzle?

Given the values of , , and  for  trips to the store, determine which boxes Papyrus must purchase during each trip. For each trip, print a single line of  distinct space-separated integers denoting the box number for each box of spaghetti Papyrus purchases (recall that the store only has one box of each kind). If it's not possible to buy  sticks of spaghetti by purchasing  boxes, print -1 instead.

For example, Papyrus wants to purchase  sticks of spaghetti in  boxes and the store has  different box sizes. He can buy boxes of sizes , ,  and other combinations. Any of the combinations will work.

 */
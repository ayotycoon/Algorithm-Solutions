//https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays&h_r=next-challenge&h_v=zen
//Left Rotation Hackerrank
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

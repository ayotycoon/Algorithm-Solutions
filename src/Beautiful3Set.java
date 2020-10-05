import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Beautiful3Set {
    private static void arrayReverser(Integer [] arr){
        int a = arr[0];
        int b = arr[1];
        int c = arr[2];
      System.out.println(c+" " + b + " " + a);
        System.out.println(a+" " + c + " " + b);
        System.out.println(b+" " + a + " " + c);
    }
    public static void solver(int n) {

        Integer[] base = {0,0,0};
        ArrayList<Integer[]> ans = new ArrayList();
        if(n == 1){
            base[0] = 1;
        } else if(n == 2){
            base[0] = 1;
            base[1] = 1;
        } else if(n == 3){
            base[0] = 2;
            base[1] = 1;
        } else {
            base[0] = n-1;
            base[1] = 1;


        }
        System.out.println(n);
        arrayReverser(base);

int i = 1;
        while (true) {
            int a = base[0];

            if(a - i >= 2){

               base[0]-= i;
               if(i%2 != 0){
                   base[1]+=1;
               }else {
                   base[2]+=1;
               }


                arrayReverser(base);
                i++;

            } else {
                break;
            }


        }


    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input = bufferedReader.readLine().trim();
        Arrays.stream(input.split("\\n")).forEach(n -> solver(Integer.parseInt(n.trim())));


        bufferedReader.close();

    }

}




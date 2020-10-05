import java.util.Arrays;

public class KMPAlgorithim {
    private static int[] patternPrefixFinder(String[] patternAsArr) {
        int[] patternPrefix = new int[patternAsArr.length];

        int i = 0;
        int j = 0;


        while (true) {
            //   System.out.println("i=" + i + ",j=" + j);
            if (i == 0 && j == 0) {
                patternPrefix[0] = 0;
                j++;
                continue;
            }

            String iItem = patternAsArr[i];
            String jItem = patternAsArr[j];


            if (!iItem.equals(jItem) && i == 0) {
                patternPrefix[j] = 0;
                j++;
                if (j > patternAsArr.length - 1) {
                    break;
                }
            } else if (!iItem.equals(jItem) && i != 0) {

                int previousIChar = patternPrefix[i - 1];
                i = previousIChar;
                continue;
            } else if ((j + 1) > patternAsArr.length - 1) {

                patternPrefix[j] = i + 1;

                break;

            } else {

                patternPrefix[j] = i + 1;
                i++;
                j++;


            }


        }

        return patternPrefix;
    }

    public static Integer find(String text, String pattern) {
        String[] textAsArr = text.split("");
        String[] patternAsArr = pattern.split("");
        int[] patternPrefix = patternPrefixFinder(patternAsArr);
       // System.out.println(Arrays.toString(patternPrefix));
        int i = 0;
        int j = 0;
        while (i < textAsArr.length) {

            String itemAtI = textAsArr[i];
            String itemAtJ = patternAsArr[j];

            if (!itemAtI.equals(itemAtJ)) {
          //      System.out.println("not-equal -- itemAtI= " + itemAtI + " itemAtJ= " + itemAtJ + " ----" );
                if(j == 0){
                    i++;



                } else {


                    int valueAtPreviousPrefixJ = patternPrefix[j - 1];


                    j = valueAtPreviousPrefixJ;
                }




                continue;

            } else if (j == patternAsArr.length - 1) {
                return i - j;

            }
         //   System.out.println("equal -- itemAtI= " + itemAtI + " itemAtJ= " + itemAtJ );
            i++;
            j++;


        }
        return null;

    }

    public static void main(String[] args) {
        String text = "helloworld";
        ;
        String pattern = "world";

        System.out.println(find(text, pattern));
        // System.out.println(Arrays.toString(patternPrefixFinder( pattern.split(""))));
    }
}
/*
https://en.wikipedia.org/wiki/Knuth%E2%80%93Morris%E2%80%93Pratt_algorithm
https://www.youtube.com/watch?v=GTJr8OvyEVQ
 */
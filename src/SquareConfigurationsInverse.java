public class SquareConfigurationsInverse {
  public static int solver(int m,int n) {
      int tot = 0;

      for (int i = 0; i < m; i++) {
          int l = ((m-i)  * (n-i));


          tot+=l;
      }
return tot;
    }

    public static void main(String[] args) {
        int m = 4;
        int n = 12;

        int x = solver(m,n);
        System.out.println(x);

    }

}




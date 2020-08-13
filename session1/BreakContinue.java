/*public class BreakContinue {
    //public static int factorial(int n){
      //  return factorial(n-1) + a[i + k]

   // }
    public static void windowPosSum(int[] a, int n) {
        for(int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                continue;
            }
            for (int k = n; k > 0; k--) {

                int[] good = new int[k];
                good[1] = a[i + 1];
                good[k] = good[k - 1] + a[i + k];
                if (i > 5) {
                    a[i] = 0;
                }
                a[i] = good[k];
            }

        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);

        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));
    }
}*/

public class BreakContinue {
    public static void windowPosSum(int[] a, int n) {
        /** your code here */
        int tmp =0;
        for (int i = 0 ; i<a.length; i +=1){
            tmp = a[i];
            if (a[i]<0){
                continue;
            }
            for (int j = i+1 ; j <= i+n; j +=1){
                if (j>a.length-1){
                    break;
                }
                tmp += a[j];
            }
            a[i] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);

        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));
    }
}

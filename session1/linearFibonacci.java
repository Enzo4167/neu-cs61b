/*class man {
    public static int linearfibonacci(int k) {
        int k = 10;
        int[] rabbit = new int[size];
        int n;
        rabbit[n] = n;
        if (k <= 1) {
            return rabbit[k,0];
        } else {
            int i;
            rabbit[i] =linearfibonacci(k - 1);
            return[k, i];
        }

    }
}
public class linearFibonacci{
    public static void main(){
        man.linearfibonacci(10);
    }

}*/

/*public class linearFibonacci {
    public static int getFib3(int n) {
        if (n < 0) {
            System.out.println("对不起，您输入的值有误");
            return -1;

        } else if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            int[] fibAry = new int[n + 1];//数组的大小
            fibAry[0] = 0;
            fibAry[1] = fibAry[2] = 1;
            for (int i = 3; i <= n; i++) {
                fibAry[i] = fibAry[i - 1] + fibAry[i - 2];
            }
            return fibAry[n];
        }
    }
    public static int factorial(int n){
        if(n == 1){
            return 1;
        }else if(n == 2) {
            return 2;
        }else{
                return factorial(n-1) + getFib3(n); //递归
            }
        }
    public static void main(String[] args){
        java.util.Scanner s = new java.util.Scanner(System.in);
        int i = s.nextInt(); //输入n的值
        System.out.println(factorial(i));
    }
}
*/

/*public class linearFibonacci{
    public static int resultFib(int n){
        int[] getFib = new int[n+1];
        if (n == 1 || n == 2) {
            getFib[n] = 1;
        }else if(n == 0){
            getFib[n] = 0;
        } else if(n < 0){
            System.out.println("error");
            getFib[n] = -1;
        }else {
            getFib[0] = 0;
            getFib[1] = getFib[2] = 1;
            for (int i = 3 ; i <= n; i++) {
                getFib[i] = getFib[i - 1] + getFib[i - 2];
            }
        }
        return getFib[n];
    }
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        if (n >= 2) {
            return factorial(n - 1)+ resultFib(n);
        }else{
            return 0;
        }
    }
    public static void main(String[] args){
        System.out.println(resultFib(10));
        System.out.println(factorial(2));
    }
}*/

public class linearFibonacci {
    public static void main(String[] args) {
        int count = 0;
        for(int n = 1; n <= 100; n++){
            System.out.print(getfib(n) + " ");
            count++;
            if(count % 8 == 0){
                System.out.println();
            }
        }
        System.out.println(getfib(100));
    }
    public static int getfib(int n) {
        int[] getFib = new int[n + 1];
        if (n == 1) {
            getFib[1] = 1;
        }else if (n == 2) {
            getFib[2] = 1;
        }else { //n>= 3的时候
            getFib[0] = 0;
            getFib[1] = getFib[2] = 1; //在这个else要额外定义
            for ( int i = 3; i <= n; i++) { //这句话是必须的
                getFib[i] = getFib[i - 1] + getFib[i - 2]; //形参
                //getFib[n] = getFib[ n - 1] + getFib[n - 2]; //形参  //因为他需要迭代，迭代完了的值并没有显示在n中
            }
        }
        return getFib[n];
    }
    //public static int sumFib(int n){
        //sumFib(n) = sumFib(n - 1) + getFib(n);

    //}
}//结果超过2的31次方






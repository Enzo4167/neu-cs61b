/*public class primeNumber {
    public static void main(String[] args) {
        //boolean suShu = true;如果放在这里的值，他的值不会被renew，就不会继续输出结果

        int n = 100;
        int count = 0;
        for (int j = 2; j <= n; j++) {
            boolean suShu = true; //each time it has a renewed true.
            for (int i = 2; i < j; i++) { //不会先执行一次
                if (j % i == 0) {
                    suShu = false;
                    break;
                }
            }
            if (suShu) {
                System.out.print(j + " ");
                count++;
                if (count % 8 == 0) {
                    System.out.println();
                }

            }
        }
    }
}




*/
/*public class primeNumber{
    public static void main(String[] args){
        int count = 0;
        int n = 100;
        for (int i = 2; i <= n ; i++) {
            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    prime = false;
                    break;
                }
            }
            if(prime){
                System.out.print(i + " ");
                count++;
                if(count % 8 ==0){
                    System.out.println();
                }
            }
        }
    }
}*/
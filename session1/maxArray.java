/*public class maxArray {
    public static int MaxByFunction(int m[]) {
        int max = m[0];
        for (int i = 0; i < m.length; i++) {
            if (m[i] > max)
                max = m[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(numbers[1]);
        int x = MaxByFunction(numbers); //方法+数组名称
        System.out.println(x);
        Dog[] dogs = new Dog[2];
        //dogs[0] = new Dog(8);
        //dogs[1] = new Dog(20);
        //maxArray[] dog = new maxArray[];
       // dog[0] = new maxArray(6);
    }
   // public int weightinpounds;
    //public maxArray(int n){
     //   weightinpounds = n;

    }*/

public class maxArray{
    public static int max(int[] m){
        int maxNumber = m[0];
        for(int i = 1; i < m.length; i ++){ //length是从1开始的，i如果等于他长度其实就是i+1；
            if(maxNumber < m[i]){
                maxNumber = m[i];
            }
        }
        return maxNumber;
    }
    public static void main(String[] args){
        int[] numbers = new int[]{9,2,15,2,22,10,6};
        System.out.println(max(numbers));
    }

}


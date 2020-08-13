public class demo {
    public static void main(String[] args) {
            String[] a = {"cat", "dog", "laser horse", "ketchup", "horse", "horbse"};

            for (int i = 0; i < a.length; i += 1) {
                for (int j = 0; j < 3; j += 1) {
                    System.out.println(a[i]);
                    if (a[i].contains("horse")) {
                        break; //结束当前进程
                    }
                }
            }
    }
}
/*public class ContinueDemo {
    public static void main(String[] args) {
        String[] a = {"cat", "dog", "laser horse", "ketchup", "horse", "horbse"};

        for (int i = 0; i < a.length; i += 1) {
            if (a[i].contains("horse")) {
                continue; //跳过当前的直接进入下一个
            }
            for (int j = 0; j < 3; j += 1) {
                System.out.println(a[i]);
            }
        }
    }
}*/
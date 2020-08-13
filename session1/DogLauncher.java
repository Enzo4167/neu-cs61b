public class DogLauncher {
    public static void main(String[] args) {
        Dog d = new Dog(20);
        d.makeNoise();
        Dog[] dogs = new Dog[4]/*{2,5}*/; //引用数据类型无法直接赋值
        dogs[0] = new Dog(8);
        dogs[1] = new Dog(20); //基本数据类型不需要new Dog()这个形势
        dogs[0].makeNoise();

    }
}
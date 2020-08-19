public class TestBody {
    public static void TestBody() {


        Body b1 = new Body(1.0, 1.0, 3.0, 4.0, 5.0, "jupiter.gif");
        Body b2 = new Body(2.0, 1.0, 3.0, 4.0, 4e11, "jupiter.gif");
        Body[] bodies = {b1,b2};
        double xNetForce = b1.calcNetForceExertedByX(bodies);
        double yNetForce = b1.calcNetForceExertedByY(bodies);
        double NetForce = Math.sqrt(xNetForce*xNetForce+yNetForce*yNetForce);
        System.out.println(NetForce);

    }
    public static void main(String[] args){
        TestBody();
    }
}

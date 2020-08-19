import java.lang.Math;

public class Body {
    public static double G = 6.67e-11;
    public double xxPos;
    public double yyPos;
    public double xxVel;
    public double yyVel;
    public double mass;
    public String imgFileName;
    public Body(double xP, double yP, double xV, double yV, double m, String img){
        xxPos = xP;
        yyPos = yP;
        xxVel = xV;
        yyVel = yV;
        mass = m;
        imgFileName = img;
    }
    public Body(Body b){
        xxPos = b.xxPos;
        yyPos = b.yyPos;
        xxVel = b.xxVel;
        yyVel = b.yyVel;
        mass = b.mass;
        imgFileName = b.imgFileName;
    }
    public double calcDistance(Body b){
        // double p = square(Samh.xP-B.xP) + square(Samh.yP1 - B.yP2);
        //return Math.sqrt(p);
        double dx = b.xxPos - this.xxPos;
        double dy = b.yyPos - this.yyPos;
        double r = Math.sqrt(square(dx) + square(dy));
        return r;
    }

    public double calcForceExertedBy(Body b){
        double force = G*this.mass*b.mass/square(this.calcDistance(b));
        return force;
    }

    public double calcForceExertedByX(Body b){
        double f1_x = calcForceExertedBy(b)*(b.xxPos - this.xxPos)/this.calcDistance(b);
        return f1_x;
    }
    public double calcForceExertedByY(Body b){
        double f1_y = calcForceExertedBy(b)*(b.yyPos - this.yyPos)/this.calcDistance(b);
        return f1_y;
    }


    public double calcNetForceExertedByX(Body[] bs){
        double fxNet = 0;
        for(Body b:bs){
            if(!this.equals(b)) {
                fxNet += this.calcForceExertedByX(b);
            }

        }
        return fxNet;
    }
    public double calcNetForceExertedByY(Body[] bs){
        double fyNet = 0;
        for(Body b:bs){ //在bs这个数组范围内的b
            if(!this.equals(b) ){ //就是本身
                fyNet += this.calcForceExertedByY(b);
            }
        }
        return fyNet;
    }
//equals 是值相同， ==是地址相同 是一个。
    public void update(double dt, double fX, double fY){
        double anetx = fX/this.mass;
        double anety = fY/this.mass;
        this.xxVel += dt*anetx;
        this.yyVel += dt*anety;
        this.xxPos += dt*this.xxVel;
        this.yyPos += dt*this.yyVel;
    }

    public static double square(double f){
        return f*f;
    }

    public double squareroot(double k){
        return Math.sqrt(k);

    }
    public static int exponent2(int f){
        int tmp = 1;
        while(f != 0){
            tmp = tmp * 2;
            f --;
        }
        return tmp;
    }
    //System.out.println(exponent2(3));
    public void draw(){
        StdDraw.picture(this.xxPos, this. yyPos, this.imgFileName);
    }
}


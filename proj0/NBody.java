public class NBody {
    public static double readRadius(String fileName){
        In in = new In(fileName);
        double num = in.readDouble();
        double radius = in.readDouble();
        return  radius;

    }

    public static Body[] readBodies(String fileName){
        In in = new In(fileName);
        int num = in.readInt();
        Body[] planets = new Body[num];
        in.readDouble();
        for(int i = 0; i < num; i ++){
            double xxPos = in.readDouble();
            double yyPos = in.readDouble();
            double xxVel = in.readDouble();
            double yyVel = in.readDouble();
            double m = in.readDouble();
            String k = in.readString();
            String img = "/images/" + k;
            Body a = new Body(xxPos, yyPos, xxVel, yyVel, m, img);
            planets[i] = new Body(a);
        }
        return planets;
    }

    public static String background = "/images/starfield.jpg";

    public static void main(String[] args){
        double T = Double.parseDouble(args[0]);
        double dt = Double.parseDouble(args[1]);
        String filename = args[2];
        double radius = readRadius(filename);
        Body[] clone = readBodies(filename);

        StdDraw.setScale(-radius, radius);
        StdDraw.picture(0, 0, background);

        for(Body planet: clone){
            planet.draw();
        }
        StdDraw.show();
        StdDraw.enableDoubleBuffering();
        for(double t = 0; t <= T; t+=dt){
            double[] xForces = new double[clone.length];
            double[] yForces = new double[clone.length];
            for(int i = 0; i <clone.length; i++){
                xForces[i] = clone[i].calcNetForceExertedByX(clone);
                yForces[i] = clone[i].calcNetForceExertedByY(clone);
                clone[i].update(dt, xForces[i], yForces[i]);
            }
            StdDraw.picture(0, 0, background);
            /**
             * Draw all planets
             */
            for(Body planet: clone){
                planet.draw();
            }
            StdDraw.show();
            StdDraw.pause(10);
        }
        StdOut.printf("%d\n", clone.length);
        StdOut.printf("%.2e\n", radius);
        for (int i = 0; i < clone.length; i++) {
            StdOut.printf("%11.4e %11.4e %11.4e %11.4e %11.4e %12s\n",  //\n是换行
                    clone[i].xxPos, clone[i].yyPos, clone[i].xxVel,
                    clone[i].yyVel, clone[i].mass, clone[i].imgFileName);
            //%e指数型  %s字符串
        }

    }
}

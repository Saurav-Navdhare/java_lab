public class A_12 {
    public static void main(String[] args) {
        double r = 2.5, l = 3.5, b = 4.5, h=5.5;
        float a = (float) 5.0;
        System.out.println("Area of circle with radius "+r+ " unit(s) is " + area(r)+" unit square");
        System.out.println("Area of parallelogram with length "+l+ " unit(s) and breadth "+b+ " unit(s) is " + area(l, b)+" unit square");
        System.out.println("Area of square with side "+a+" unit(s) is "+area(a));
        System.out.println("Area of triangle with sides "+l+" unit(s)," + b+" unit(s) and " + h +" unit(s) is " + area(l,b,h)+" unit square");
    }
    static public double area(double r){        //area of circle
        return 3.14*r*r;
    }
    static public float area(float a){       //area of square
        return a*a;
    }
    static public double area(double l,double b){   //area of parallelogram
        return l*b;
    }
    static public double area(double a, double b, double c){    //area of triangle
        double s=(a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}
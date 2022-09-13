// Write a program to create a “distance” class with properties “start point” and “end point” and with methods to calculate distance.
// Assume that the distance is computed in meters.
// Provide a method to calculate and print the distance for an object.

public class B_03{
    public static void main(String[] args) {
        Distance d1 = new Distance();
        d1.setStartPoint(150);
        d1.setEndPoint(175.5);
        Distance d2 = new Distance(0, 100);
        System.out.println("d1 object: " + d1);
        System.out.println("Distance of d1 "+ d1.getDistance()+" meters");
        System.out.println("d2 object: " + d2);
        System.out.println("Distance of d2 "+ d2.getDistance()+" meters");
    }
}

class Distance{
    private double startPoint, endPoint;
    Distance(double startPoint, double endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    Distance(){}

    Distance(Distance d1){
        this.startPoint = d1.startPoint;
        this.endPoint = d1.endPoint;
    }

    //getters and setters
    public double getStartPoint() {         //getter
        return startPoint;
    }
    public double getEndPoint(){            //getter
        return endPoint;
    }
    public void setStartPoint(double startPoint){   //setter
        this.startPoint = startPoint;
    }
    public void setEndPoint(double endPoint){       //setter
        this.endPoint = endPoint;
    }

    double getDistance(){
        return Math.abs(endPoint - startPoint);     //To return absolute value
    }

    public String toString(){
        return "Start Point: " + startPoint + ", End Point: " + endPoint;
    }
}
import java.lang.Math;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        boolean run = true;
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Joystick Input: ");
            double input = scan.nextDouble();
            System.out.println("Output: " + joystickToQuadrantAngle(input));
        }
            

    }

    public static double clamp(double val, double min, double max) {
        return Math.max(min, Math.min(max, val));
    }

    public static double joystickToQuadrantAngle(double controller) {
        double theta = controller;
        if (theta > 45 && theta < 135) {
            theta = 0;
        } else if (theta > 135 && theta < 225) {
            theta = 90;
        } else if (theta > 225 && theta < 315) {
            theta = 180;
        } else {
            theta = -90;
        }
        return theta;
    }

}

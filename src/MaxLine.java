import java.util.Scanner;
public class MaxLine
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter first point coordinates:");

        int x1 = scan.nextInt();
        int y1 = scan.nextInt();

        System.out.println ("Enter second point coordinates:");

        int x2 = scan.nextInt();
        int y2 = scan.nextInt();

        System.out.println ("Enter third point coordinates:");

        int x3 = scan.nextInt();
        int y3 = scan.nextInt();

        // Calculation of the length of the lines from the obtained points according to the formula:
        double line1 = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

        double line2 = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));

        double line3 = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));

        // Checking what the length of the longest line is:
        if (line1 >= line2 && line1 >= line3){
            System.out.println ("Max line created by the following points:" + "(" + x1 + "," + y1 + "), (" + x2 + "," + y2 + ")");
        }

        else {
            if (line2 >= line1 && line2 >= line3) {
                System.out.println("Max line created by the following points:" + "(" + x2 + "," + y2 + "), (" + x3 + "," + y3 + ")");
            } else {
                System.out.println("Max line created by the following points:" + "(" + x1 + "," + y1 + "), (" + x3 + "," + y3 + ")");
            }
        }

    } // end of method main
} //end of class MaxLine

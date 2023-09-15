// Scientific Calculator
    // Written by Charlie Nau
        // CCOMP-11J Fall 2023
            // Completed

// Need this utility to get and use user input
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // Diections for calculator print at beginning
        System.out.println("Scientific Calculator");
        System.out.println("Operations: Multiply/Divide, Add/Subtract, Square Root, Cube Root, Sine, Cosine (radians)");

        // create a new scanner object
        // (unlike python, we have to typecast variables)
        Scanner opInput = new Scanner(System.in);
        
        System.out.println("Operation?");
        // collect the user input on the "Operation?" prompt
        String operationType = opInput.nextLine();

        // gross if tree (can't use switch because it doesn't support ||)
        // multiplication
        if (operationType.equals("Multiply") || operationType.equals("multiply") || operationType.equals("x") || operationType.equals("X")) {
            // Collect the nuymbers to be multiplied
            System.out.println("Argument 1?");
            Scanner argInputOne = new Scanner(System.in);
            String argOne = argInputOne.nextLine();
            // this should cast the user input as a float
            Float argOneVal = Float.parseFloat(argOne);
            
            System.out.println("Argument 2?");
            Scanner argInputTwo = new Scanner(System.in);
            String argTwo = argInputTwo.nextLine();
            Float argTwoVal = Float.parseFloat(argTwo);
            
            Float product = (argOneVal * argTwoVal);
            // make product into a formatted string
            System.out.printf("%f x %f = %f", argOneVal, argTwoVal, product);

            // close scanners
            argInputOne.close();
            argInputTwo.close();
        }
        // Division
        if (operationType.equals("Divide") || operationType.equals("divide") || operationType.equals("Div") || operationType.equals("div") || operationType.equals("/")) {
            // Collect the nuymbers to be divided
            // variables are local to {} brackets luckily
            System.out.println("Argument 1?");
            Scanner argInputOne = new Scanner(System.in);
            String argOne = argInputOne.nextLine();
            // this should cast the user input as a float
            Float argOneVal = Float.parseFloat(argOne);
            
            System.out.println("Argument 2?");
            Scanner argInputTwo = new Scanner(System.in);
            String argTwo = argInputTwo.nextLine();
            Float argTwoVal = Float.parseFloat(argTwo);
            
            Float product = (argOneVal / argTwoVal);
            // make product into a formatted string
            System.out.printf("%f / %f = %f", argOneVal, argTwoVal, product);

            // close scanners
            argInputOne.close();
            argInputTwo.close();
        }
        // square root
        if (operationType.equals("Square Root") || operationType.equals("square root") || operationType.equals("sqrt") || operationType.equals("Squrt")) {
            System.out.println("Argument?");
            Scanner argInput = new Scanner(System.in);
            String arg = argInput.nextLine();
            Double argVal = Double.parseDouble(arg);
            Double root = Math.sqrt(argVal);

            System.out.printf("sqrt(%.2f) = %.2f", argVal, root);
            argInput.close();
        }
        // cube root
        if (operationType.equals("Cube Root") || operationType.equals("cube root") || operationType.equals("cbrt") || operationType.equals("Cbrt")) {
            System.out.println("Argument?");
            Scanner argInput = new Scanner(System.in);
            String arg = argInput.nextLine();
            Double argVal = Double.parseDouble(arg);
            Double root = Math.cbrt(argVal);

            System.out.printf("cbrt(%.2f) = %.2f", argVal, root);
            argInput.close();
        }
        // sine
        if (operationType.equals("Sine") || operationType.equals("sine") || operationType.equals("Sin") || operationType.equals("sin")) {
            System.out.println("Argument?");
            Scanner argInput = new Scanner(System.in);
            String arg = argInput.nextLine();
            Double argVal = Double.parseDouble(arg);
            Double sin = Math.sin(argVal);

            System.out.printf("sin(%.2f) = %.2f", argVal, sin);
            argInput.close();
        }
        // cosine
        if (operationType.equals("Cosine") || operationType.equals("cosine") || operationType.equals("Cos") || operationType.equals("cos")) {
            
        }

    // Close first scanner
    opInput.close();
  }
}

// need a way to cast the arguments from strings to floats


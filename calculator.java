// Scientific Calculator
    // Written by Charlie Nau
        // CCOMP-11J Fall 2023
            // Completed 9/16/2023

// Need this utility to get and use user input
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
class Main {
    public static void main(String[] args) throws IOException {
    // File writing stuff
    // Writing to history.txt file
        FileWriter tape = new FileWriter("history.txt");
    // Diections for calculator print at beginning
        System.out.println("Scientific Calculator");
        System.out.println("Operations: Multiply/Divide, Add/Subtract, Square Root, Cube Root, Sine, Cosine (radians)");
        System.out.println("Type 'done' when finished calculating");
        // create a new scanner object to get user input
        // (unlike python, we have to typecast variables)
        Scanner opInput = new Scanner(System.in);
        while (true) {
            System.out.println("Operation?");
            // collect the user input on the "Operation?" prompt
            String operationType = opInput.nextLine();
            // end the loop when the user types "done"
            if (operationType.equalsIgnoreCase("done")) {
                System.out.println("Calculation ended, thank you");
                break;
            }
            // gross if tree (can't use switch because it doesn't support ||)
            // multiplication
            if (operationType.equals("Multiply") || operationType.equals("multiply") || operationType.equals("x") || operationType.equals("X")) {
                // Collect the nuymbers to be multiplied
                System.out.println("Argument 1?");
                Scanner argInputOne = new Scanner(System.in);
                String argOne = argInputOne.nextLine();
                // this casts the user input as a float
                Float argOneVal = Float.parseFloat(argOne);
                System.out.println("Argument 2?");
                Scanner argInputTwo = new Scanner(System.in);
                String argTwo = argInputTwo.nextLine();
                Float argTwoVal = Float.parseFloat(argTwo);
                Float product = (argOneVal * argTwoVal);
                // make product into a formatted string, ending in a new line
                System.out.printf("%f x %f = %f \n", argOneVal, argTwoVal, product);
                String tapeText = String.format("%f x %f = %f \n", argOneVal, argTwoVal, product);
                tape.write(tapeText);
                // tape.close();
            }
            // Division
            if (operationType.equals("Divide") || operationType.equals("divide") || operationType.equals("Div") || operationType.equals("div") || operationType.equals("/")) {
                // Collect the numbers to be divided
                // variables are local to {} brackets luckily
                System.out.println("Argument 1?");
                Scanner argInputOne = new Scanner(System.in);
                String argOne = argInputOne.nextLine();
                // this casts the user input as a float
                Float argOneVal = Float.parseFloat(argOne);
                System.out.println("Argument 2?");
                Scanner argInputTwo = new Scanner(System.in);
                String argTwo = argInputTwo.nextLine();
                Float argTwoVal = Float.parseFloat(argTwo);
                Float product = (argOneVal / argTwoVal);
                // make product into a formatted string
                System.out.printf("%f / %f = %f \n", argOneVal, argTwoVal, product);
                String tapeText = String.format("%f / %f = %f \n", argOneVal, argTwoVal, product);
                tape.write(tapeText);
                // tape.close();
            }
            // square root
            if (operationType.equals("Square Root") || operationType.equals("square root") || operationType.equals("sqrt") || operationType.equals("Squrt")) {
                System.out.println("Argument?");
                Scanner argInput = new Scanner(System.in);
                String arg = argInput.nextLine();
                // use doubles for the square root (and sin and cos and cbrt)
                Double argVal = Double.parseDouble(arg);
                // import the sqrt from the math module
                Double root = Math.sqrt(argVal);
                // different string format for doubles
                System.out.printf("sqrt(%.2f) = %.2f \n", argVal, root);
                String tapeText = String.format("sqrt(%.2f) = %.2f \n", argVal, root);
                tape.write(tapeText);
                // tape.close();
            }
            // cube root
            if (operationType.equals("Cube Root") || operationType.equals("cube root") || operationType.equals("cbrt") || operationType.equals("Cbrt")) {
                System.out.println("Argument?");
                Scanner argInput = new Scanner(System.in);
                String arg = argInput.nextLine();
                // cast the string as a double
                Double argVal = Double.parseDouble(arg);
                Double root = Math.cbrt(argVal);
                System.out.printf("cbrt(%.2f) = %.2f \n", argVal, root);
                String tapeText = String.format("cbrt(%.2f) = %.2f \n", argVal, root);
                tape.write(tapeText);
                // tape.close();
            }
            // sine
            if (operationType.equals("Sine") || operationType.equals("sine") || operationType.equals("Sin") || operationType.equals("sin")) {
                System.out.println("Argument?");
                Scanner argInput = new Scanner(System.in);
                String arg = argInput.nextLine();
                Double argVal = Double.parseDouble(arg);
                Double sin = Math.sin(argVal);
                System.out.printf("sin(%.2f) = %.2f \n", argVal, sin);
                String tapeText = String.format("sin(%.2f) = %.2f \n", argVal, sin);
                tape.write(tapeText);
                // tape.close();
            }
            // cosine
            if (operationType.equals("Cosine") || operationType.equals("cosine") || operationType.equals("Cos") || operationType.equals("cos")) {
                System.out.println("Argument?");
                Scanner argInput = new Scanner(System.in);
                String arg = argInput.nextLine();
                Double argVal = Double.parseDouble(arg);
                Double sin = Math.cos(argVal);
                System.out.printf("cos(%.2f) = %.2f \n", argVal, sin);
                String tapeText = String.format("cos(%.2f) = %.2f \n", argVal, sin);
                tape.write(tapeText);
                // tape.close();
            }
            if (operationType.equals("Add") || operationType.equals("add") || operationType.equals("+")) {
                System.out.println("Argument 1?");
                Scanner argInputOne = new Scanner(System.in);
                String argOne = argInputOne.nextLine();
                Float argOneVal = Float.parseFloat(argOne);
                System.out.println("Argument 2?");
                Scanner argInputTwo = new Scanner(System.in);
                String argTwo = argInputTwo.nextLine();
                Float argTwoVal = Float.parseFloat(argTwo);
                Float sum = (argOneVal + argTwoVal);
                // make product into a formatted string
                System.out.printf("%f + %f = %f \n", argOneVal, argTwoVal, sum);
                String tapeText = String.format("%f + %f = %f \n", argOneVal, argTwoVal, sum);
                tape.write(tapeText);
                // tape.close();
            }
            if (operationType.equals("Subtract") || operationType.equals("subtract") || operationType.equals("-")) {
                System.out.println("Argument 1?");
                Scanner argInputOne = new Scanner(System.in);
                String argOne = argInputOne.nextLine();
                Float argOneVal = Float.parseFloat(argOne);
                System.out.println("Argument 2?");
                Scanner argInputTwo = new Scanner(System.in);
                String argTwo = argInputTwo.nextLine();
                Float argTwoVal = Float.parseFloat(argTwo);
                Float sum = (argOneVal - argTwoVal);
                System.out.printf("%f - %f = %f \n", argOneVal, argTwoVal, sum);
                String tapeText = String.format("%f - %f = %f \n", argOneVal, argTwoVal, sum);
                tape.write(tapeText);
                // tape.close();
            }
    }
    tape.close();
  }
}


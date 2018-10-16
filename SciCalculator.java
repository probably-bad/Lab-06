import java.util.Scanner;

public class SciCalculator {
    public static void main(String[] args){
        //declaring variables
        Scanner in = new Scanner (System.in);
        double one = 0;         //first operand
        double two = 0;         //second operand
        double ans = 0;         //current result
        double ansTotal = 0;    //total of all answers
        double avg;             //average of all calculations
        int calcs = 0;          //number of calculations
        String pick;            //user input
        String result;
        boolean keepRunning = true;
        boolean innerLoop = true;


        while (keepRunning) {

            System.out.println("Current Result: " + ans);
            System.out.println();
            System.out.println("Calculator Menu \n" +
                    "--------------- \n" +
                    "0. Exit Program \n" +
                    "1. Addition \n" +
                    "2. Subtraction \n" +
                    "3. Multiplication \n" +
                    "4. Division \n" +
                    "5. Exponentiation \n" +
                    "6. Logarithm \n" +
                    "7. Display Average");

            innerLoop = true;

            while (innerLoop) {
                System.out.println();
                System.out.print("Enter Menu Selection: ");
                pick = in.next();

                    //determining operation and doing calculation
                    switch (pick) {
                        case "0": //exits program
                            System.out.println();
                            System.out.println("Thanks for using this calculator. Goodbye!");
                            System.exit(0);
                            break;
                        case "1": //addition
                            System.out.print("Enter first operand: ");
                            result = in.next();
                            if (result.equals("RESULT"))
                                one = ans;
                            else
                                one = Double.parseDouble(result);
                            System.out.print("Enter second operand: ");
                            result = in.next();
                            if (result.equals("RESULT"))
                                two = ans;
                            else
                                two = Double.parseDouble(result);
                            ans = one + two;
                            ansTotal += ans;
                            calcs += 1;
                            innerLoop = false;
                            break;
                        case "2": //subtraction
                            System.out.print("Enter first operand: ");
                            result = in.next();
                            if (result.equals("RESULT"))
                                one = ans;
                            else
                                one = Double.parseDouble(result);
                            System.out.print("Enter second operand: ");
                            result = in.next();
                            if (result.equals("RESULT"))
                                two = ans;
                            else
                                two = Double.parseDouble(result);
                            ans = one - two;
                            ansTotal += ans;
                            calcs += 1;
                            innerLoop = false;
                            break;
                        case "3": //multiplication
                            System.out.print("Enter first operand: ");
                            result = in.next();
                            if (result.equals("RESULT"))
                                one = ans;
                            else
                                one = Double.parseDouble(result);
                            System.out.print("Enter second operand: ");
                            result = in.next();
                            if (result.equals("RESULT"))
                                two = ans;
                            else
                                two = Double.parseDouble(result);
                            ans = one * two;
                            ansTotal += ans;
                            calcs += 1;
                            innerLoop = false;
                            break;
                        case "4": //division
                            System.out.print("Enter first operand: ");
                            result = in.next();
                            if (result.equals("RESULT"))
                                one = ans;
                            else
                                one = Double.parseDouble(result);
                            System.out.print("Enter second operand: ");
                            result = in.next();
                            if (result.equals("RESULT"))
                                two = ans;
                            else
                                two = Double.parseDouble(result);
                            ans = one / two;
                            ansTotal += ans;
                            calcs += 1;
                            innerLoop = false;
                            break;
                        case "5": //exponential
                            System.out.print("Enter first operand: ");
                            result = in.next();
                            if (result.equals("RESULT"))
                                one = ans;
                            else
                                one = Double.parseDouble(result);
                            System.out.print("Enter second operand: ");
                            result = in.next();
                            if (result.equals("RESULT"))
                                two = ans;
                            else
                                two = Double.parseDouble(result);
                            ans = Math.pow(one, two);
                            ansTotal += ans;
                            calcs += 1;
                            innerLoop = false;
                            break;
                        case "6": //logarithm
                            System.out.print("Enter first operand: ");
                            result = in.next();
                            if (result.equals("RESULT"))
                                one = ans;
                            else
                                one = Double.parseDouble(result);
                            System.out.print("Enter second operand: ");
                            result = in.next();
                            if (result.equals("RESULT"))
                                two = ans;
                            else
                                two = Double.parseDouble(result);
                            ans = (Math.log(two) / Math.log(one));
                            ansTotal += ans;
                            calcs += 1;
                            innerLoop = false;
                            break;
                        case "7": //average
                            if (calcs > 0) {
                                avg = ansTotal / calcs;
                                System.out.print("\nSum of calculations: " + ansTotal +
                                        "\nNumber of calculations: " + calcs + "\n");
                                System.out.printf("Average of calculations: %.2f %n", avg);
                            } else
                                System.out.println("\nError: No calculations yet to average!");
                            break;
                        default: //non-menu selection
                            System.out.println("\nError: Invalid selection!");
                    }
                }
            System.out.println();
            }
        }
    }


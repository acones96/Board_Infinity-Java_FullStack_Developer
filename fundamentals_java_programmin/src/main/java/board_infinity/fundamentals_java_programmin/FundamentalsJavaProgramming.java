
package board_infinity.fundamentals_java_programmin;

import java.util.Date;
import java.util.Scanner;

class dataTypes {

    byte age = 23;
    long viewsCount = 1_112_345_678;
    float price = 234.56F;
    char gender = 'M';
    boolean isValid = true;
    String name = "Adrian";

    dataTypes() {
        System.out.println("----- Data Types -----");
    }

    public void primitiveData() {
        System.out.println(age);
        System.out.println(viewsCount);        
        System.out.println(price);
        System.out.println(gender);
        System.out.println(isValid);
    }

    public void nonPrimitiveData() {
        
        System.out.println(name);
        Date now = new Date();
        System.out.println(now);
    }
}

class scannerClass {

    Scanner scanner = new Scanner(System.in);
    double contact;
    char gender;
    int age;
    String name;

    scannerClass() {
        System.out.println("----- Scanner -----");
    }

    public void printDetails() {
        System.out.println("-----User Details-----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Contact: " + contact);
    }

    public void inputDetails() {
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.print("Enter your age: ");
        age = scanner.nextByte();
        System.out.print("Enter your gender (M/F): ");
        gender = scanner.next().charAt(0);
        System.out.print("Enter your contact number: ");
        contact = scanner.nextDouble();
    }
}

class typeCasting {

    int intValueImplicit = 100;
    double doubleValueExplicit = 100.56;

    typeCasting() {
        System.out.println("----- Type Casting -----");
    }
    
    public void implicit() {
        // Implicit type casting from int to long
            long longValueImplicit = intValueImplicit;
        // Implicit type casting from long to double
            double doubleValueImplicit = longValueImplicit;

        System.out.println(intValueImplicit);
        System.out.println(longValueImplicit);
        System.out.println(doubleValueImplicit);
    }

    public void explicit() {
        // Convert type from double to float
            long longValueExplicit = (long)doubleValueExplicit;
        // Convert type from float to int
            int intValueExplicit = (int)longValueExplicit;
        // Convert type from float to int
            byte byteValueExplicit = (byte)intValueExplicit;
        
        System.out.println(doubleValueExplicit);
        System.out.println(longValueExplicit);
        System.out.println(intValueExplicit);
        System.out.println(byteValueExplicit);
    }        
}

class Operators {
    int num1 = 100, num2 = 50;
    boolean bool1 = true, bool2 = false;
    boolean isAuthenticated = true;

    Operators() {
        System.out.println("----- Operators ------");
    }

    public void arithemecit() {
        System.out.println("** Arithmetic  operators **");
        System.out.println("num1 = " + num1 + " and num2 = " + num2);

        System.out.println("Addition : " + (num1 + num2));
        System.out.println("Substraction : " + (num1 - num2));
        System.out.println("Multiplication : " + (num1 * num2));
        System.out.println("Division : " + (num1 / num2));
        System.out.println("Remainder : " + (num1 % num2));

        System.out.println("Post increament : " + (num1++));
        System.out.println("Pre increament : " + (++num1));

        System.out.println("Post decrement : " + (num1--));
        System.out.println("Pre decrement : " + (--num1));
    }

    public void relationalOperator() {
        System.out.println("** Relational operators **");
        System.out.println("num1 = " + num1 + " and num2 = " + num2);

        System.out.println("num1 > num2 : " + (num1 > num2));
        System.out.println("num1 < num2 : " + (num1 < num2));
        System.out.println("num1 >= num2 : " + (num1 >= num2));
        System.out.println("num1 <= num2 : " + (num1 <= num2));
        System.out.println("num1 == num2 : " + (num1 == num2));
        System.out.println("num1 != num2 : " + (num1 != num2));
    }

    public void conditionalOperators() {
        System.out.println("** Conditional operators **");
        System.out.println("bool1 = " + bool1 + " and bool2 = " + bool2);

        System.out.println("bool1 && bool2 : " + (bool1 && bool2));
        System.out.println("bool1 || bool2 : " + (bool1 || bool2));
        System.out.println("bool1 != bool2 : " + (bool1 != bool2));
        System.out.println("!bool1 : " + (!bool1));
    }

    public void ternaryOperator() {
        System.out.println("** Ternary operator **");
        System.out.println("Using if condition : ");

        if (isAuthenticated) {
            System.out.println("User is authenticated");
        } else {
            System.out.println("User is not authenticated");
        }

        System.out.println("Using ternary : ");

        /*
        * We can simplfy the previous conditions
        * by using this ternary
        */
            String result = (isAuthenticated) ? "User is authenticated" : "User is not authenticated";
            System.out.println(result);
    }
}

class Arrays {

    Arrays() {
        System.out.println("----- Arrays -----");
    }

    public void singleDimension() {
        System.out.println("**Single-dimension array**");

        // Declare an array
            // Option 1
                // int[] arry1; 
                // arry1 = new int[5]; 
            // Option 2
                // int[] arry2 = new int[5];

        // Declare and initialize array
            // int[] arry3 = new int[] {10, 20, 30, 40, 50};

        // Declare and assign
            int [] arry4 = new int[5];

            // Assign individualy
                arry4[0] = 100;
                arry4[1] = 60;
                arry4[2] = 70;
                arry4[3] = 30;
                arry4[4] = 40;

            // Assign or print each index

                // for loop
                    System.out.println("*** For Loop Array ***");
                    for (int forArry = 0; forArry < arry4.length; forArry++) {
                        System.out.print(arry4[forArry] + "\t");;
                    }

                    System.out.println("");

                // for each loop
                    System.out.println("** *For Each Loop Array ***");
                    for (int forEachArry : arry4) {
                        System.out.println(forEachArry);
                    }
    }

    public void multiDimension() {
        System.out.println("**Multi-dimension array**");

        // Declare and assign
            int arry5[][] = {
                {11, 12, 13, 14, 15},
                {21, 22, 23, 24, 25},
                {31, 32, 33, 34, 35}
            };

            // Print values
                
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (j < 4) {
                            System.out.print(arry5[i][j] + ", ");
                        } else {
                            System.out.println(arry5[i][j]);
                        }
                        
                    }
                }
    }
}

class loopStatement {

    int iteration = 1;
    Scanner scanner = new Scanner(System.in);
    String input = "";

    loopStatement() {
        System.out.println("----- Loop statements -----");
    }

    public void forLoopStatement() {
        System.out.println("** For loop **");

        for (iteration = 1; iteration <= 10; iteration++) {
            System.out.println("Hello for client #" + iteration);
        }
    }

    public void whileLoopStatement() {
        System.out.println("** While loop **");
        iteration = 1;
        
        while (iteration <= 10) {
            System.out.println("Hello while client #" + iteration++);
        }
    }

    public void doWhileLoopStatement() {
        System.out.println("** Do... While loop");

        do {
            System.out.print("Enter Message : ");
            input = scanner.nextLine().toLowerCase();
            input = "exit";
            if (input.equals("exit")) 
                break;
            if (input.equals("pass"))
                continue;
            System.out.println("Message is : " + input);
        } while (!input.equals("exit"));
    }

    public void forEachStatement() {
        System.out.println("** for-each loop **");
        String[] names = {"King", "Jorge", "Angel", "Miguel"};

        for (String forEachIteration1 : names) {
            System.out.println(forEachIteration1);
        }
    }         
}

class conditionalStatements {

    boolean isAuthenticated = true;
    float sellingPrice = 1200, costPrice = 1000;

    conditionalStatements() {
        System.out.println("----- Conditional statements -----");
    }

    public void ifStatement() {
        System.out.println("** if statement **");
        System.out.println("Authentication is : " + isAuthenticated);

        if (isAuthenticated) {
            System.out.println("LoggedIn");
        }

        if (isAuthenticated) {
            System.out.println("Not LoggedIn");
        }
    }

    public void ifElseStatement() {
        System.out.println("** if-else statement **");
        isAuthenticated = false;

        if (isAuthenticated) {
            System.out.println("LoggedIn");
        } else {
            System.out.println("Not LoggedIn");
        }
    }

    public void ifElseNested() {
        System.out.println("** if-else nested statement **");

        if (sellingPrice > costPrice) {
            System.out.println("Profit");
        } else if (costPrice > sellingPrice) {
            System.out.println("Loss");
        } else {
            System.out.println("No Profit Nor Loss");
        }
    }

    public void switchStatement() {
        System.out.println("** Switch statement **");

        for (int k = 0; k < 5; k++) {
            switch (k) {
                case 1:
                    System.out.println("Value is : " + (k + 10));
                    break;
                case 2:
                    System.out.println("Value is : " + (k + 40));
                    break;
                case 3:
                    System.out.println("Value is : " + (k + 60));
                    break;
                default:
                    System.out.println("Value not recognized");
                    break;
            }
        }
    }
    
            
}


public class FundamentalsJavaProgramming {
    
    public static void main(String[] args) {

        // Variables declaration
            dataTypes dataTypes = new dataTypes();
            scannerClass scanner = new scannerClass();
            typeCasting typeCasting = new typeCasting();
            Arrays array = new Arrays();
            Operators operators = new Operators();
            conditionalStatements conditionalStatements = new conditionalStatements();
            loopStatement loopStatement = new loopStatement();

        // Data Type
            dataTypes.nonPrimitiveData();
            dataTypes.primitiveData();


        // Scanner
            scanner.inputDetails();
            scanner.printDetails();        
        
        // Type Casting
            typeCasting.implicit();
            typeCasting.explicit();
            
        // Operators

            // Arithemecit operators     
                operators.arithemecit();

            // Relational operators
                operators.relationalOperator();
                
            // Conditional operators
                operators.conditionalOperators();

            // Ternary operator
                operators.ternaryOperator();
                
        // Arrays
            array.singleDimension();
            array.multiDimension();

        // Conditional statements

            // if statements
                conditionalStatements.ifStatement();
                
            // if-else statement
                conditionalStatements.ifElseStatement();

            // if-else nested statement
                conditionalStatements.ifElseNested();

            // Switch statement
                conditionalStatements.switchStatement();
        
        // Loops statements

            // For loop
                loopStatement.forLoopStatement();

            // While loop
                loopStatement.whileLoopStatement();
                
            // Do... While loop
                loopStatement.doWhileLoopStatement();
            
            // For-each loop
                loopStatement.forEachStatement();
    }
}
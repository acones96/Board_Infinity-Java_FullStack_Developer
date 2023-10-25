package board_infinity.fundamentals_java_programmin;

import java.util.Scanner;

// Inheritance with constructor chaining
    class Person {
        String name;

        public Person() {
            System.out.println("Person Class Constructor Invoked");
            name = "King Kochhar";
        }

        public Person(String name) {
            System.out.println("Person Class Parameterize Constructor Invoke");
            this.name = name;
        }
    }

    class Employee extends Person {
        String designation;

        public Employee() {
            System.out.println("Employee Class Constructor Invoked");
            designation = "Manager";
        }

        public Employee(String designation) {
            super("Karthik");
            System.out.println("Employee Class Parameterize Constructor Invoke");
            this.designation = designation;
        }
    }

// Constructors / Constructors Chaining by parameters
    class Student {

        // Data Members
            private int studentId, studentAge;
            private String studentName;
            protected Scanner scanner = new Scanner(System.in);

            Student() {
                this(101, "Karthik", 23);
                this.studentId = 100;
                this.studentAge = 23;
                this.studentName = "Adrian";
            }

            Student(int studentId, String studenName, int studentAge) {
                this(102, 23, "Gautam");
                this.studentId = studentId;
                this.studentAge = studentAge;
                this.studentName = studenName;
            }

            Student(int studentId, int studentAge, String studentName) {
                this.studentId = studentId;
                this.studentAge = studentAge;
                this.studentName = studentName;
            }

        // Member function
            void acceptDetails() {
                System.out.print("Enter Student id : ");
                this.studentId = this.scanner.nextInt();
                System.out.print("Enter Student Name : ");
                this.studentName = this.scanner.next();
                System.out.print("Enter Student Age : ");
                this.studentAge = this.scanner.nextInt();
            }

            protected void displayDetails() {
                System.out.println("Student Id : " + this.studentId);
                System.out.println("Student Name : " + this.studentName);
                System.out.println("Student Age : " + this.studentAge);
            }
    }   

// Simple inheritance
    class Marks extends Student {
        protected float objectiveMarks;
        protected float subjectiveMarks;

        void acceptDetails() {
            super.acceptDetails();
            System.out.print("Enter Objective Marks : ");
            objectiveMarks = scanner.nextFloat();
            System.out.print("Enter Subjective Marks : ");
            subjectiveMarks = scanner.nextFloat();
        }

        protected void displayDetails() {
            super.displayDetails();
            System.out.println("Objective Marks : " + objectiveMarks);
            System.out.println("Subjective Marks : " + subjectiveMarks);
        }
    }

// Multi-level inheritance
    class Sports extends Marks {
        protected float score;

        void acceptDetails() {
            super.acceptDetails();
            System.out.print("Enter Sport Score : ");
            score = scanner.nextFloat();
        }

        protected void displayDetails() {
            super.displayDetails();
            System.out.println("Sport Score : " + score);
        }

    }
    
    class Result extends Sports {
        private float totalMarks, averageMarks;

        void calculate() {
            totalMarks = objectiveMarks + subjectiveMarks + score;
            averageMarks = totalMarks / 3;
            System.out.println("Total Marks : " + totalMarks);
            System.out.println("Average Marks : " + averageMarks);

        }
    }

// Typecasting
    class Vehicle {
        void drive() {
            System.out.println("Driving a Vehicle...");
        }
    }

    class Car extends Vehicle {
        void drive() {
            System.out.println("Driving a Car.");
        }

        void speedUp() {
            System.out.println("Speeding Up a Car...");
        }
    }

// Polymorphism
    // Method Overloading
        class Calculation {
            public static int Addition(int num1, int num2) {
                return num1 + num2;
            }

            public final int Addition(int num1, int num2, int num3) {
                return num1 + num2 + num3;
            }

            public static float Addition(float num1, float num2) {
                return num1 + num2;
            }

            public final float Addition(int num1, float num2) {
                return num1 + num2;
            }

            public final float Addition(float num1, int num2) {
                return num1 + num2;
            }
        }

    // Method Overriding
        class Animal {
            String type;
            String sound;

            Animal(String type, String sound) {
                this.type = type;
                this.sound = sound;
            }

            public void print() {
                System.out.println(this.type + " makes this sound : " + this.sound);

            }
        }    

        class Dog extends Animal {
            String name;

            Dog(String type, String sound, String name) {
                super(type, sound);
                this.name = name;
            }

            public void print() {
                super.print();
                System.out.println("His name is : " + name);
            }
        }

// Abstract
    
    abstract class ABCBank {
        abstract void openAccount();
        abstract void closeAccount();

        public void message() {
            System.out.println("Welcome to ABCBank!");
        }
    }

    abstract class BankAccount extends ABCBank {
        abstract void deposit();
        abstract void withdraw();
        abstract void balance();
    }

    class SavingAccount extends BankAccount {
        @Override
        void closeAccount() {
            System.out.println("Close Account");
        }

        @Override
        void openAccount() {
            System.out.println("Open Account");
        }

        @Override
        void balance() {
            System.out.println("Balance in Saving Accoung");
        }

        @Override
        void deposit() {
            System.out.println("Deposit in Saving Account");
        }

        @Override
        void withdraw() {
            System.out.println("Withdraw from Saving Account");
        }
    }

    class CurrentAccount extends BankAccount {
        @Override
        void closeAccount() {
            System.out.println("Close Account");
        }

        @Override
        void openAccount() {
            System.out.println("Open Account");
        }

        @Override
        void balance() {
            System.out.println("Balance in Current Account");
        }

        @Override
        void deposit() {
            System.out.println("Deposit in Current Account");
        }

        @Override
        void withdraw() {
            System.out.println("Withdraw from Current Account");
        
        }
    }

// Interface
    interface IABCBank {
        void openAccount();
        void closeAccount();
        default void message() {
            System.out.println("Welcoe to ABC Bank!");
        }
    }

    interface IBankAccount {
        void deposit();
        void withdraw();
        void balance();
    }

    class Saving implements IBankAccount, IABCBank {
        
        @Override
        public void closeAccount() {
            System.out.println("Close Account");
        }

        @Override
        public void openAccount() {
            System.out.println("Open Account");
        }

        @Override
        public void balance() {
            System.out.println("Balance in Saving Account");
        }

        @Override
        public void deposit() {
            System.out.println("Deposit in Saving Account");
        }

        @Override
        public void withdraw() {
            System.out.println("Withdraw from Saving Account");
        }
    }

public class ClassesAndObjectsExample {
    public static void main(String[] args) {

        // Class Student
            System.out.println("-------- Student #1 --------");
            Student student1 = new Student();
            student1.displayDetails();
            student1.acceptDetails();
            student1.displayDetails();
            
            System.out.println("-------- Student #2 --------");
            Student student2 = new Student(260685, "Adrian", 27);
            student2.displayDetails();
            student2.acceptDetails();
            student2.displayDetails();

        System.out.println("********************");

        // Class Person -> Employee
            Employee employee = new Employee();
            System.out.println(employee.name);

            Employee employee1 = new Employee("Senior Manager");
            System.out.println(employee1.name);

        // Class Student -> Marks
            Marks marks = new Marks();
            marks.acceptDetails();
            marks.displayDetails();

        // Class Studen -> Marks -> Sports
            Sports sports = new Sports();
            sports.acceptDetails();
            sports.displayDetails();
 
        // Class Studen -> Marks -> Sports -> Result
            Result result = new Result();
            result.acceptDetails();
            result.displayDetails();
            result.calculate();

        // Typecast - Vehicle -> Car

            // Downcasting - From Parent to Child
                Vehicle vehicle = new Car(); 

                // Child c = (child) Parent
                    Car car = (Car) vehicle; 
                    car.drive();
                    car.speedUp();
            
            // Upcasting - From Child to Parent
                // Parent p = Child 
                Vehicle vehicle1 = new Car();
                vehicle1.drive();

        // Polymorphism
            // Overloading
                Calculation calculation = new Calculation();
                System.out.println(calculation.Addition(100F, 20));
                System.out.println(calculation.Addition(4, 10, 98));
                System.out.println(calculation.Addition(234, 5345F));

            // Overriding
                Dog dog = new Dog("Cannin", "Bark","Chopper");
                dog.print();

        System.out.println("********************");

        // Abstraction
            SavingAccount savingAccount = new SavingAccount();
            savingAccount.message();
            savingAccount.openAccount();
            savingAccount.deposit();
            savingAccount.balance();
            savingAccount.withdraw();
            

            CurrentAccount currentAccount = new CurrentAccount();
            currentAccount.message();
            currentAccount.openAccount();
            currentAccount.deposit();
            currentAccount.withdraw();
            currentAccount.balance();
            currentAccount.closeAccount();

        System.out.println("********************");

        // Interface
            Saving saving = new Saving();
            saving.message();
            saving.openAccount();
            saving.balance();
            saving.deposit();
            saving.withdraw();
            saving.closeAccount();
    }
}
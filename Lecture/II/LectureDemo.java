import java.util.*;

public class LectureDemo {
    public static final double CM_PER_INCH = 2.54;

    public static void main(String[] args) {
        System.out.println("Hello Students");

        final double M_PER_INCH = 0.0254;
        float paperWidth = (float)8.5D;
        float paperHeight = 11.0f;

        System.out.println("Rozmiar papieru w centymetrach: " + paperWidth * CM_PER_INCH + 
        " na " + paperHeight * CM_PER_INCH);

        var text = String.format("Rozmiar papieru w metrach: %2.4f na %2.4f", paperWidth * M_PER_INCH,
        paperHeight * M_PER_INCH, args);

        System.out.println(text);


        {
            System.out.println("Unary Operator");
            int x = 10;
            System.out.println(x++);
            System.out.println(++x);
            System.out.println(x--);
            System.out.println(--x);
        }
        {
            System.out.println("Unary Operator Example 2: ++ and --");
            int a = 10;
            int b = 10;
            System.out.println(a++ + ++a);// 10+12=22
            System.out.println(b++ + b++);// 10+11=21
        }
        {
            System.out.println("Unary Operator Example: ~ and !");
            int a = 10;
            int b = -10;
            boolean c = true;
            boolean d = false;
            System.out.println(~a);// -11 (minus of total positive value which starts from 0)
            System.out.println(~b);// 9 (positive of total minus, positive starts from 0)
            System.out.println(!c);// false (opposite of boolean value)
            System.out.println(!d);// true
        }

        {
            System.out.println("Arithmetic Operator Example");
            int a = 10;
            int b = 5;
            System.out.println(a + b);// 15
            System.out.println(a - b);// 5
            System.out.println(a * b);// 50
            System.out.println(a / b);// 2
            System.out.println(a % b);// 0
        }

        {
            System.out.println("Arithmetic Operator Example: Expression");
            System.out.println(10 * 10 / 5 + 3 - 1 * 4 / 2);
        }

        {
            System.out.println("Left Shift Operator Example");
            System.out.println(10 << 2);// 10*2^2=10*4=40
            System.out.println(10 << 3);// 10*2^3=10*8=80
            System.out.println(20 << 2);// 20*2^2=20*4=80
            System.out.println(15 << 4);// 15*2^4=15*16=240
        }

        {
            System.out.println("Right Shift Operator Example");
            System.out.println(10 >> 2);// 10/2^2=10/4=2
            System.out.println(20 >> 2);// 20/2^2=20/4=5
            System.out.println(20 >> 3);// 20/2^3=20/8=2
        }
        {
            System.out.println("Shift Operator Example: >> vs >>>");
            // For positive number, >> and >>> works same
            System.out.println(20 >> 2);
            System.out.println(20 >>> 2);
            // For negative number, >>> changes parity bit (MSB) to 0
            System.out.println(-20 >> 2);
            System.out.println(-20 >>> 2);
        }
        {
            System.out.println("AND Operator Example: Logical && and Bitwise &");
            int a = 10;
            int b = 5;
            int c = 20;
            System.out.println(a < b && a < c);// false && true = false
            System.out.println(a < b & a < c);// false & true = false
        }
        {
            System.out.println("AND Operator Example: Logical && vs Bitwise &");
            int a = 10;
            int b = 5;
            int c = 20;
            System.out.println(a < b && a++ < c);// false && true = false
            System.out.println(a);// 10 because second condition is not checked
            System.out.println(a < b & a++ < c);// false && true = false
            System.out.println(a);// 11 because second condition is checked
        }

        {
            System.out.println("OR Operator Example: Logical || and Bitwise |");
            int a = 10;
            int b = 5;
            int c = 20;
            System.out.println(a > b || a < c);// true || true = true
            System.out.println(a > b | a < c);// true | true = true
            // || vs |
            System.out.println(a > b || a++ < c);// true || true = true
            System.out.println(a);// 10 because second condition is not checked
            System.out.println(a > b | a++ < c);// true | true = true
            System.out.println(a);// 11 because second condition is checked
        }
        {
            System.out.println("Ternary Operator Example");
            int a = 2;
            int b = 5;
            int min = (a < b) ? a : b;
            System.out.println(min);
        }
        {
            System.out.println("");
            int a = 10;
            int b = 5;
            int min = (a < b) ? a : b;
            System.out.println(min);
        }
        {
            System.out.println("Assignment Operator Example 1");
            int a = 10;
            int b = 20;
            a += 4;// a=a+4 (a=10+4)
            b -= 4;// b=b-4 (b=20-4)
            System.out.println(a);
            System.out.println(b);
        }
        {
            System.out.println("Assignment Operator Example 2");
            int a = 10;
            a += 3;// 10+3
            System.out.println(a);
            a -= 4;// 13-4
            System.out.println(a);
            a *= 2;// 9*2
            System.out.println(a);
            a /= 2;// 18/2
            System.out.println(a);
        }
        {
            System.out.println("Assignment Operator Example: Adding short");
            short a = 10;
            short b = 10;
            a+=b;//a=a+b internally so fine
            // a = a + b;// Compile time error because 10+10=20 now int
            System.out.println(a);
        }
        {
            System.out.println("Assignment Operator Example: Adding short  - correct");
            short a = 10;
            short b = 10;
            a+=b;
            a = (short) (a + b);// 20 which is int now converted to short
            System.out.println(a);
        }

        {
            System.out.println("Add Two Numbers");
            int a = 10;
            int b = 10;
            int c = a + b;
            System.out.println(c);
        }
        {
            System.out.println("Widening");
            int a = 10;
            float f = a;
            System.out.println(a);
            System.out.println(f);
        }
        {
            System.out.println("Narrowing (Typecasting)");
            float f = 10.5f;
            // int a = f; //Compile time error
            int a = (int) f;
            System.out.println(f);
            System.out.println(a);
        }
        {
            System.out.println("Overflow");
            int a = 130;
            byte b = (byte) a;
            System.out.println(a);
            System.out.println(b);
        }
        {
            System.out.println("Adding Lower Type");
            byte a = 10;
            byte b = 10;
            // byte c=a+b;//Compile Time Error: because a+b=20 will be int
            byte c = (byte) (a + b);
            System.out.println(c);
        }
        {
            System.out.println("Inicjalizacja zmiennych");
            {
                int vacationDays;
                // System.out.println(vacationDays);
            }
            //
            {
                int vacationDays;
                vacationDays = 12;
            }
            {
                int vacationDays = 12;
            }
            {
                double salary = 65000.0;
                System.out.println(salary);
                int vacationDays = 12;
            }
        }

        {
            System.out.println("IfExample");
            // defining an 'age' variable
            int age = 20;
            // checking the age
            if (age > 18) {
                System.out.print("Age is greater than 18");
            }
        }

        {
            System.out.println("IfElseExample");
            // defining a variable
            int number = 13;
            // Check if the number is divisible by 2 or not
            if (number % 2 == 0) {
                System.out.println("even number");
            } else {
                System.out.println("odd number");
            }
        }
        {
            System.out.println("IfElseIfExample");
            int marks = 65;

            if (marks < 50) {
                System.out.println("fail");
            } else if (marks >= 50 && marks < 60) {
                System.out.println("D grade");
            } else if (marks >= 60 && marks < 70) {
                System.out.println("C grade");
            } else if (marks >= 70 && marks < 80) {
                System.out.println("B grade");
            } else if (marks >= 80 && marks < 90) {
                System.out.println("A grade");
            } else if (marks >= 90 && marks < 100) {
                System.out.println("A+ grade");
            } else {
                System.out.println("Invalid!");
            }
        }
        {
            System.out.println("JavaNestedIfExample");
            // Creating two variables for age and weight
            int age = 20;
            int weight = 80;
            // applying condition on age and weight
            if (age >= 18) {
                if (weight > 50) {
                    System.out.println("You are eligible to donate blood");
                }
            }
        }
        {
            System.out.println("JavaNestedIfExample2");
            // Creating two variables for age and weight
            int age = 25;
            int weight = 48;
            // applying condition on age and weight
            if (age >= 18) {
                if (weight > 50) {
                    System.out.println("You are eligible to donate blood");
                } else {
                    System.out.println("You are not eligible to donate blood");
                }
            } else {
                System.out.println("Age must be greater than 18");
            }
        }
        {
            System.out.println("SwitchExample");
            // Declaring a variable for switch expression
            int number = 20;
            // Switch expression
            switch (number) {
            // Case statements
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            // Default case statement
            default:
                System.out.println("Not in 10, 20 or 30");
            }
        }
        {
            System.out.println("SwitchExample1");
            // Specifying month number
            int month = 7;
            String monthString = "";
            // Switch statement
            switch (month) {
            // case statements within the switch block
            case 1:
                monthString = "1 - January";
                break;
            case 2:
                monthString = "2 - February";
                break;
            case 3:
                monthString = "3 - March";
                break;
            case 4:
                monthString = "4 - April";
                break;
            case 5:
                monthString = "5 - May";
                break;
            case 6:
                monthString = "6 - June";
                break;
            case 7:
                monthString = "7 - July";
                break;
            case 8:
                monthString = "8 - August";
                break;
            case 9:
                monthString = "9 - September";
                break;
            case 10:
                monthString = "10 - October";
                break;
            case 11:
                monthString = "11 - November";
                break;
            case 12:
                monthString = "12 - December";
                break;
            default:
                System.out.println("Invalid Month!");
            }
            // Printing month of the given number
            System.out.println(monthString);
        }
        {
            System.out.println("SwitchExample2");
            int number = 20;
            // switch expression with int value
            switch (number) {
            // switch cases without break statements
            case 10:
                System.out.println("10");
            case 20:
                System.out.println("20");
            case 30:
                System.out.println("30");
            default:
                System.out.println("Not in 10, 20 or 30");
            }
        }
        {
            System.out.println("SwitchStringExample");
            // Declaring String variable
            String levelString = "Expert";
            int level = 0;
            // Using String in Switch expression
            switch (levelString) {
            // Using String Literal in Switch case
            case "Beginner":
                level = 1;
                break;
            case "Intermediate":
                level = 2;
                break;
            case "Expert":
                level = 3;
                break;
            default:
                level = 0;
                break;
            }
            System.out.println("Your Level is: " + level);
        }
        {
            System.out.println("NestedSwitchExample");
            // C - CSE, E - ECE, M - Mechanical
            char branch = 'C';
            int collegeYear = 4;
            switch (collegeYear) {
            case 1:
                System.out.println("English, Maths, Science");
                break;
            case 2:
                switch (branch) {
                case 'C':
                    System.out.println("Operating System, Java, Data Structure");
                    break;
                case 'E':
                    System.out.println("Micro processors, Logic switching theory");
                    break;
                case 'M':
                    System.out.println("Drawing, Manufacturing Machines");
                    break;
                }
                break;
            case 3:
                switch (branch) {
                case 'C':
                    System.out.println("Computer Organization, MultiMedia");
                    break;
                case 'E':
                    System.out.println("Fundamentals of Logic Design, Microelectronics");
                    break;
                case 'M':
                    System.out.println("Internal Combustion Engines, Mechanical Vibration");
                    break;
                }
                break;
            case 4:
                switch (branch) {
                case 'C':
                    System.out.println("Data Communication and Networks, MultiMedia");
                    break;
                case 'E':
                    System.out.println("Embedded System, Image Processing");
                    break;
                case 'M':
                    System.out.println("Production Technology, Thermal Engineering");
                    break;
                }
                break;
            }
        }
        {
            System.out.println("JavaSwitchEnumExample");
            Day[] DayNow = Day.values();
            for (Day Now : DayNow) {
                switch (Now) {
                case Sun:
                    System.out.println("Sunday");
                    break;
                case Mon:
                    System.out.println("Monday");
                    break;
                case Tue:
                    System.out.println("Tuesday");
                    break;
                case Wed:
                    System.out.println("Wednesday");
                    break;
                case Thu:
                    System.out.println("Thursday");
                    break;
                case Fri:
                    System.out.println("Friday");
                    break;
                case Sat:
                    System.out.println("Saturday");
                    break;
                }
            }


            Scanner in = new Scanner(System.in);
            // Pobranie pierwszej porcji danych.
            System.out.print("Jak się nazywasz? ");
            String name = in.nextLine();
            // Pobranie drugiej porcji danych.
            System.out.print("Ile masz lat? ");
            int age = in.nextInt();
            // Wydruk danych w konsoli.
            System.out.println("Witaj użytkowniku" + name + ". W przyszłym roku będziesz mieć " + (age + 1) + "lat.");
            in.close();
        }
    }    

    public enum Day {
        Sun, Mon, Tue, Wed, Thu, Fri, Sat
    }
}

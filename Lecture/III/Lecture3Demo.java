import java.util.ArrayList;

public class Lecture3Demo {
    public static void main(String args[]) {
        int a[] = new int[5];// declaration and instantiation
        a[0] = 10;// initialization
        a[1] = 20;
        a[2] = 70;
        a[3] = 40;
        a[4] = 50;
        // traversing array
        for (int i = 0; i < a.length; i++)// length is the property of array
            System.out.println(a[i]);

        TestArray1();

        int b[] = { 33, 3, 4, 5 };// declaring and initializing an array
        min(b);// passing array to method

        printArray(new int[] { 10, 22, 44, 66 });

        //
        int arr[] = get();
        // printing the values of an array
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

        //
        // int arr1[] = { 50, 60, 70, 80 };
        // for (int i = 0; i <= arr1.length; i++) {
        // System.out.println(arr1[i]);
        // }

        TestArray3();

        TestJaggedArray();
        
    }

    public static void TestArray1() {
        int a[] = { 33, 3, 4, 5 };// declaration, instantiation and initialization
        // printing array
        for (int i = 0; i < a.length; i++)// length is the property of array
            System.out.println(a[i]);
    }

    public static void TestArray3() {
        // declaring and initializing 2D array
        int arr[][] = { { 1, 2, 3 }, { 2, 4, 5 }, { 4, 4, 5 } };
        // printing 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    
    static void min(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (min > arr[i])
                min = arr[i];

        System.out.println(min);
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

    static int[] get() {
        return new int[] { 10, 30, 50, 90, 60 };
    }

    public static void TestJaggedArray() {
        // declaring a 2D array with odd columns
        int arr[][] = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[4];
        arr[2] = new int[2];
        // initializing a jagged array
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = count++;

        // printing the data of a jagged array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();// new line
        }
    }
}

class Lec3_Array_Matrices {
    public static void main(String args[]) {
        // creating two matrices
        int a[][] = { { 1, 3, 4 }, { 3, 4, 5 } };
        int b[][] = { { 1, 3, 4 }, { 3, 4, 5 } };

        // creating another matrix to store the sum of two matrices
        int c[][] = new int[2][3];

        // adding and printing addition of 2 matrices
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();// new line
        }

    }
}

// Java Program to multiply two matrices
class Lec3_Array_MatrixMultiplicationExample {
    public static void main(String args[]) {
        Lec3_Array_MatrixMultiplicationExample lec = new Lec3_Array_MatrixMultiplicationExample();
        
        // creating two matrices
        int a[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
        int b[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };

        // creating another matrix to store the multiplication of two matrices
        int c[][] = new int[3][3]; // 3 rows and 3 columns

        // multiplying and printing multiplication of 2 matrices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                } // end of k loop
                System.out.print(c[i][j] + " "); // printing matrix element
            } // end of j loop
            System.out.println();// new line
        }
    }
}
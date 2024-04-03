package Basics;

public class practice {
    public static void main(String[] args) {
        // From: https://www.geeksforgeeks.org/java-exercises/?ref=gcse#practice-problems-in-java-sorting-algorithms
        // 1. Write Hello World Program
        System.out.println("Hello World!");

        System.out.printf("My result: " + mySum(12, 25));
        System.out.println();
        int m = 9, n = 5;
        swapValuesUsingThirdVariable(m, n);

        // 4. decimal to binary
        int n4 = 17;
        System.out.println("Decimal: " + n4);
        System.out.print("Binary: ");
        decToBinary(n4);
    }

    // 2. Add two numbers.
    public static int mySum(int num1, int num2) {
        return num1 + num2;
    }

    //3. Swap two numbers.
    // Approach 1: Swapping the values using a third variable.
    public static void swapValuesUsingThirdVariable(int m, int n) {
        int temp = m;
        m = n;
        n = temp;
        System.out.println("You input m as: " + n + " but now it is " + m);
        System.out.println("You input n as: " + m + " but now it is " + n);
    }

    // Convert integer number to binary number.
    static void decToBinary(int n) {
        // array to store binary number
        int[] binaryNum = new int[1000];

        // counter for binary array
        int i = 0;
        while (n > 0) {
            // storing remainder in binary array
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }

        // printing binary array in reverse order
        for (int j = i - 1; j >=0; j--) {
            System.out.print(binaryNum[j]);
        }
    }

}

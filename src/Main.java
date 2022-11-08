import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        FizzBuzz();
//        Fibonacci(10);
//        System.out.println(Factorial(6));
//        int[] arr = {100, 5, 3, 7, 2, -5};
//        System.out.println(Arrays.toString(BubbleSort(arr)));
        Analysis("Hello");
    }

    private static void FizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                else {
                    System.out.println("Fizz");
                }
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }

    private static void Fibonacci(int n) {
        int pp = 0, p = 1;
        for (int i = 0; i < n; i++) {
            int temp = p + pp;
            pp = p;
            p = temp;
            System.out.println(pp);
        }
    }

    private static int Factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * Factorial(n - 1);
    }

    private static int[] BubbleSort(int[] arr) {
        boolean isSorted = false;
        int temp;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i + 1]){
                    isSorted = false;
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }

    private static void Analysis(String s) {
        s = s.toLowerCase();
        int v = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'y' ||
                    s.charAt(i) == 'u' || s.charAt(i) == 'i' || s.charAt(i) == 'o') {
                v++;
            }
            else {
                c++;
            }
        }
        System.out.println("Vowel: " + v + ", consonant: " + c);
    }
}
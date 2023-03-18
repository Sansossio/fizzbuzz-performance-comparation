// The program prints out all the numbers from 1 to 100000, but for multiples of 3, instead of the number, print "Fizz" and for multiples of 5 print "Buzz". For numbers which are multiples of both 3 and 5, print "FizzBuzz".

public class main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= 100000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Total time: " + (endTime - startTime) + "ms");
    }
}

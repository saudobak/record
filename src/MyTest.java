public class MyTest {
        public static void main(String[] args) {
            // Basic for loop to print numbers from 1 to 10
            System.out.println("Numbers from 1 to 10:");
            for (int i = 1; i <= 10; i++) {
                System.out.print(i + " ");
            }
            System.out.println();

            // For loop to iterate through an array
            int[] numbers = {2, 4, 6, 8, 10};
            System.out.println("Elements of the array:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();

            // Enhanced for loop (for-each loop)
            System.out.println("Elements of the array (using enhanced for loop):");
            for (int number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();

            // Nested for loop
            System.out.println("Nested for loop:");
            for (int i = 1; i <= 3; i++) {
                for (int j = 1; j <= 3; j++) {
                    System.out.println("i = " + i + ", j = " + j);
                }
            }
            System.out.println("test");
        }}


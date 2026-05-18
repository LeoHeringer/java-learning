public class Main {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);

        System.out.println("\nAll elements in the vector:");

        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("\nVector size: " + numbers.length);
    }
}

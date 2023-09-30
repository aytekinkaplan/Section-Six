public class ArrayLoopExamples {

    public static void main(String[] args) {
        System.out.println("Example 1: Print the elements of an integer array using a for loop");
        int[] numbers = {22, 24, 26, 29, 30};
        // TODO: Use a for loop to print each element of the intArray
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i+" "+numbers[i]);
        }

        for (int i : numbers) {
            System.out.print(i+" ");
        }

        System.out.println("Example 2: Print the elements of a string array using a for loop");
        String[] strArray = {"apple", "banana", "cherry"};
        // TODO: Use a for loop to print each element of the strArray
        for (String string : strArray) {
            System.out.print(string+" ");
        }

        // Example 3: Print every second element of an integer array
        int[] grades = {95, 80, 85, 70, 90, 60, 88, 78};
        // TODO: Use a for loop to print every second element of the grades array (step size of 2)
        System.out.println("Solution Type");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i]+" ");
        }

        for (int i = 0; i < grades.length; i+=2) {
            System.out.print(grades[i]+" ");
        }

        // Example 4: Double the elements of an integer array
        int[] values = {3, 5, 7, 9, 11};
        // TODO: Use a for loop to double each element in the values array

        for (int i = 0; i < values.length; i++) {
            values[i] = values[i]*2;
        }

        for (int i : values) {
            System.out.println(i);
        }


    

        // Example 5: Capitalize the elements of a string array
        String[] colors = {"red", "green", "blue"};
        // TODO: Use a for loop to capitalize each element in the colors array

        // Example 6: Find the index of a specific value in an integer array
        int[] data = {4, 7, 4, 1, 4, 9, 4};
        int targetValue = 4;
        // TODO: Use a for loop to find the index of targetValue in the data array
    }
}

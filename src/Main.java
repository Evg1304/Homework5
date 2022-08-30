public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//Задание 3
        int[] numbers = {1, 2, 3};
        for (int i = 2; i < numbers.length && i >= numbers[0] || i >= numbers[0] - 1; i--) {
            System.out.print(numbers[i]);
            if (1 <= i && i < numbers.length) {
                System.out.print(", ");
            }
        }
        //Задание 1
        int[] arrays = new int[3];
        arrays[0] = 1;
        arrays[1] = 2;
        arrays[2] = 3;

        double[] arrays1 = {1.57, 7.654,};
        boolean[] arrays2 = {true, false};

        //Задание 2
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]);
            if (i != arrays.length - 1) {
                System.out.print(",");
            }

        }
        for (int i = 0; i < arrays1.length; i++) {
            System.out.println(arrays1[i]);
            if (i != arrays.length - 1) {
                System.out.print(",");
            }
        }
        for (int i = 0; i < arrays2.length; i++) {
            System.out.println(arrays2[i]);
            if (i != arrays2.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        // Задание 4
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] % 2 == 1) {
                arrays[i]++;
            }
            System.out.print(arrays[i]);
        }


    }
}


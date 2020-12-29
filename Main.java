package re.geekbrains.lesson_2;

class Lesson_2 {


    public static void main(String[] args) {
        int[] array1 = {0, 1, 0, 1, 0, 0};
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 1) {
                array1[i] = 0;
            } else if (array1[i] == 0) {
                array1[i] = 1;
            }
            System.out.println(array1[i]);

        }
        System.out.println();

        int[] array2 = new int[8];
        for (int x = 0; x < array2.length; x++) {
            array2[x] = x * 3;
            System.out.println(array2[x]);

        }
        System.out.println();

        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6) {
                System.out.println(array3[i] * 2);
            } else {
                System.out.println(array3[i]);
            }
        }

        System.out.println();
        int[][] array4 = new int[4][4];
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4.length; j++) {
                if (i == j) {
                    array4[i][j] = 1;
                  }
            }

        }
        System.out.println();
        int[] array5 = {6,89,6,3,234,6,21};
        int maxIntOfArray5 = array5[0];
        int minIntOfArray5 = array5[0];
        for (int i = 0; i < array5.length; i++){
            if (array5[i] > maxIntOfArray5) maxIntOfArray5 = array5[i];
        }
        System.out.println("Максимальное значение массива " + maxIntOfArray5);

        for (int i = 0; i < array5.length; i++){
            if (array5[i] < minIntOfArray5) minIntOfArray5 = array5[i];
        }
        System.out.println("Минимальное значение массива " + minIntOfArray5);


    }
}
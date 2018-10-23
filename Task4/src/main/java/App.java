public class App {
    public static void main(String[] args) {
        int[] array = new int[20];
        int indexMaxNegative = 0;
        int indexMinPositive = 0;

        for (int i = 0; i < 20; i++) {
            int number = (int) (-10 + Math.random ()* 20);
            array[i] = number;
        }

        int maxNegative = -10;
        int minPositive = 10;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                if (minPositive > array[i]) {
                    minPositive = array[i];
                    indexMinPositive = i;
                }

            } else if (array[i] < 0) {
                if (maxNegative < array[i]) {
                    maxNegative = array[i];
                    indexMaxNegative = i;
                }
            }
        }
        System.out.println ("Индексы элементов, которые меняем местами: [" + indexMaxNegative + "], [" + indexMinPositive + "].");
        System.out.println ();

        System.out.println ("Массив до изменения:");
        for (int k : array)
            System.out.print (k + " | ");

        System.out.println ();
        switchElements (array, indexMaxNegative, indexMinPositive);
        System.out.println ();

        System.out.println ("Массив после изменения:");
        for (int k : array)
            System.out.print (k + " | ");
    }

    private static void switchElements(int[] array, int indexmaxNegative, int indexMinPositive) {
        int k = array[indexmaxNegative];
        array[indexmaxNegative] = array[indexMinPositive];
        array[indexMinPositive] = k;
    }
}

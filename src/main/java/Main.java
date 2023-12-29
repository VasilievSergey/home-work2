public class Main {
    public static void main(String[] args) {
        int[] array1 = {2, 1, 2, 3, 4};       // task 1
        int[] array2 = {2, 2, 0};
        int[] array3 = {1, 3, 5};
        System.out.println(countEvens(array1)); // 3
        System.out.println(countEvens(array2)); // 3
        System.out.println(countEvens(array3)); // 0

        int[] array6 = {4, 8, 2, 10, 5, 12};       // task 2
        int result = getDifference(array6);
        System.out.println(result); // 10

        int[] array4 = {1, 0, 0, 7, 2};        // task3
        boolean result1 = checkZeroNeighbors(array4);
        System.out.println(result1); // Выводит true

        int[] array5 = {1, 0, 2, 0, 5};
        boolean result2 = checkZeroNeighbors(array5);
        System.out.println(result2); // Выводит false
    }

    //  task1 countEvens метод, который принимает массив чисел в качестве аргумента
    //  и возвращает количество четных чисел в этом массиве.

    public static int countEvens(int[] array) {
        int count = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    // task2 getDifference принимает массив `arr`.
    // В цикле проходим по элементам массива, сохраняя
    // минимальное и максимальное значения в переменных
    // `minElem` и `maxElem` соответственно.
    // Затем находим разницу между ними и возвращаем в качестве результата.
    public static int getDifference(int[] arr) {
        int minElem = arr[0];
        int maxElem = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minElem) {
                minElem = arr[i];
            }
            if (arr[i] > maxElem) {
                maxElem = arr[i];
            }
        }
        int diff = maxElem - minElem;
        return diff;
    }
    // Task3 checkZeroNeighbors принимает массив `arr` и в цикле проверяет каждый элемент
    // и его соседа справа. Если найдено два соседних элемента
    // с нулевым значением, то функция возвращает true. Если такие
    // элементы не найдены, функция возвращает false.
    public static boolean checkZeroNeighbors(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }
}
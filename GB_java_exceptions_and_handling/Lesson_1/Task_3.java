// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
// каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.

public class ArrayDifference {
    
    public static int[] calculateDifference(int[] array1, int[] array2) throws IllegalArgumentException {
        if (array1.length != array2.length) {
            throw new IllegalArgumentException("Длины массивов не равны");
        }
        
        int[] difference = new int[array1.length];
        
        for (int i = 0; i < array1.length; i++) {
            difference[i] = array1[i] - array2[i];
        }
        
        return difference;
    }
    
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 6};
        
        try {
            int[] difference = calculateDifference(array1, array2);
            
            System.out.println("Разности элементов массивов:");
            for (int num : difference) {
                System.out.println(num);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
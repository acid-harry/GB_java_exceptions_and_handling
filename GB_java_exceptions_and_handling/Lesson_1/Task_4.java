// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
// каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. 
// Если длины массивов не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.

public class ArrayDivision {
    
    public static int[] calculateDivision(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new RuntimeException("Длины массивов не равны");
        }
        
        int[] division = new int[array1.length];
        
        for (int i = 0; i < array1.length; i++) {
            division[i] = array1[i] / array2[i];
        }
        
        return division;
    }
    
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30};
        int[] array2 = {2, 4, 0};
        
        try {
            int[] division = calculateDivision(array1, array2);
            
            System.out.println("Частное элементов массивов:");
            for (int num : division) {
                System.out.println(num);
            }
        } catch (RuntimeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
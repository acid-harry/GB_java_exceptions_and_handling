public class ExceptionMethods {
    
    public static void method1() {
        try {
            // Блок кода, в котором возможно возникновение исключения
            int result = 10 / 0; // Деление на ноль (ArithmeticException)
        } catch (ArithmeticException e) {
            // Обработка исключения
            System.out.println("Исключение: " + e.getMessage());
        }
    }
    
    public static void method2() {
        try {
            // Блок кода, в котором возможно возникновение исключения
            int[] array = new int[5];
            int value = array[10]; // Обращение к недопустимому индексу массива (ArrayIndexOutOfBoundsException)
        } catch (ArrayIndexOutOfBoundsException e) {
            // Обработка исключения
            System.out.println("Исключение: " + e.getMessage());
        }
    }
    
    public static void method3() throws FileNotFoundException {
        // Блок кода, в котором возможно возникновение исключения
        File file = new File("nonexistent_file.txt");
        Scanner scanner = new Scanner(file); // Попытка открытия несуществующего файла (FileNotFoundException)
    }
    
    public static void main(String[] args) {
        method1();
        method2();
        try {
            method3();
        } catch (FileNotFoundException e) {
            // Обработка исключения
            System.out.println("Исключение: " + e.getMessage());
        }
    }
}
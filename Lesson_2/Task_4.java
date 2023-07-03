// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.Scanner;

public class EmptyStringExceptionExample {

    public static void main(String[] args) {
        try {
            String input = getUserInput();
            processInput(input);
        } catch (EmptyStringException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static String getUserInput() throws EmptyStringException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        
        if (input.isEmpty()) {
            throw new EmptyStringException("Пустые строки вводить нельзя.");
        }
        
        return input;
    }

    public static void processInput(String input) {
        System.out.println("Вы ввели: " + input);
    }

    static class EmptyStringException extends Exception {
        public EmptyStringException(String message) {
            super(message);
        }
    }
}
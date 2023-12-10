package ChatBot;
import java.util.Scanner;
public class ChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! My name is Johny!");
        System.out.println(" I was created in 1803 year before our era");
        System.out.println("Please, remind your name.");
        String userInput = scanner.nextLine();
        System.out.println("What a great name you have," + userInput);
        System.out.println("Let me guess your age. ");
        System.out.println("Enter remainders of dividing your age by 3, 5, and 7.");

        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

        System.out.println("Your age is " + age + "; that's a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want!");
        System.out.println("Please enter a positive number:");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.println(i + "!");
        }
        System.out.println("Well, pass one test and you will be free");
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Всі змінні в Python являються:");
        System.out.println("1. Об'єктами");
        System.out.println("2. Базою");
        System.out.println("3. Цифрою");
        System.out.println("4. Строкою");
        boolean correctAnswer = false;
        int answer = scanner.nextInt();
        while (!correctAnswer) {
            if (answer == 1) {
                System.out.println("Congratulations, " + userInput + "! Your answer is correct.");
                correctAnswer = true;
            } else {
                System.out.println("Sorry, that's incorrect. Please try again.");
            }
            System.out.println("Goodbye, have a nice day!");

        }
    }
}


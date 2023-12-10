package ChatBot;
import java.util.Scanner;
public class ChatBot {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! My name is Johny!");
        System.out.println(" I was created in 1803 year before our era");
        System.out.println("Please, remind your name.");
        String userInput = scanner.nextLine();
        System.out.println("What a great name you have," + userInput);
    }
}

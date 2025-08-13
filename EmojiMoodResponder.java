
import java.util.*;

public class EmojiMoodResponder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        System.out.println("Welcome to Emoji Mood Responder!");
        System.out.println("Type your mood (happy, sad, angry, tired, excited) or 'exit' to quit.");

        while (true) {
            System.out.print("\nHow are you feeling? ");
            input = sc.nextLine().toLowerCase().trim();

            if (input.equals("exit")) {
                System.out.println("Goodbye! Stay happy! 😊");
                break;
            }

            switch (input) {
                case "happy":
                    System.out.println("You seem cheerful " + new String(Character.toChars(0x1F604)));
                    break;
                case "sad":
                    System.out.println("Cheer up! Here's a virtual hug " + new String(Character.toChars(0x1F917)));
                    break;
                case "angry":
                    System.out.println("Take a deep breath " + new String(Character.toChars(0x1F624)));
                    break;
                case "tired":
                    System.out.println("Rest well " + new String(Character.toChars(0x1F634)));
                    break;
                case "excited":
                    System.out.println("Let's celebrate " + new String(Character.toChars(0x1F389)));
                    break;
                default:
                    System.out.println("Hmm... I don't know that mood, but I hope you feel great! 😊");
            }
        }
        sc.close();
    }
} 




import java.util.Scanner;
import java.util.Random;

public class task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = { "привет", "мир", "кот", "собака" };
        Random random = new Random();
        int randomNumber = random.nextInt(words.length);
        String randomWord = words[randomNumber];
        int longWord = randomWord.length();

        char[] findWord = new char[longWord];
        for (int i = 0; i < longWord; i++) {
            findWord[i] = '_';
        }

        System.out.println("Загадано слово, попробуй угадать!");

        for (int i = 0; i < longWord; i++) {
            System.out.print(" " + findWord[i] + " ");

        }

        int helf = 5;
        do {
            char fainBbuk;
            System.out.println("Введите букву:");
            fainBbuk = scanner.next().charAt(0);

            boolean correctGuess = false;
            for (int i = 0; i < longWord; i++) {
                if (fainBbuk == words[randomNumber].charAt(i)) {
                    findWord[i] = fainBbuk;
                    correctGuess = true;
                }
            }
            for (int i = 0; i < longWord; i++) {
                System.out.print(" " + findWord[i] + " ");
            }
            System.out.println();
            if (!correctGuess) {
                helf--;
                System.out.println("Неправильная буква! Осталось " + helf + " попыток");
            } else {
                System.out.println("Ты угадал букву! Осталось " + helf + " попыток");
            }
        } while (helf > 0 && !randomWord.equals(new String(findWord)));

        if (helf == 0) {
            System.out.println("Все жизни закончились ИГРА ОКОНЧЕНА!");

        } else {
            System.out.println("Ты побели слово угадано верно !");

        }

        scanner.close();
    }
}
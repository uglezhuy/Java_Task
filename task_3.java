import java.util.Random;
import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String special = "!@#$%^&*()-_=+<>?";
        String allChars = upper + lower + digits + special;// all
        System.out.print("Введите длину пароля (от 8 до 12): ");
        int length = scanner.nextInt();

        if (length < 8 || length > 12) {
            System.out.println("Длина пароля должна быть от 8 до 12 символов!");
            return;
        }

        StringBuilder password = new StringBuilder();
        password.append(upper.charAt(random.nextInt(upper.length())));
        password.append(lower.charAt(random.nextInt(lower.length())));
        password.append(digits.charAt(random.nextInt(digits.length())));
        password.append(special.charAt(random.nextInt(special.length())));

        // Остальные символы — случайные из общего набора
        for (int i = 4; i < length; i++) {
            password.append(allChars.charAt(random.nextInt(allChars.length())));
        }

        char[] passwordArray = password.toString().toCharArray();
        for (int i = 0; i < passwordArray.length; i++) {
            int j = random.nextInt(passwordArray.length);
            char temp = passwordArray[i];
            passwordArray[i] = passwordArray[j];
            passwordArray[j] = temp;
        }

        System.out.println("Пароль: " + new String(passwordArray));
        scanner.close();
    }
}
import java.util.Random;

public class ToyGenerator {
    public static String GetToys() {
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1; // Генерация случайного числа от 1 до 10

        if (randomNumber <= 2) { // 20% шанс
            return "1";
        } else if (randomNumber <= 4) { // 20% шанс
            return "2";
        } else { // 60% шанс
            return "3";
        }
    }
}

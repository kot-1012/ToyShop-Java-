import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filePath = "toys.txt"; // Путь к файлу, в который будем записывать результаты

        try (FileWriter fileWriter = new FileWriter(filePath)) {
            for (int i = 0; i < 10; i++) {
                String toys = ToyGenerator.GetToys(); // Вызываем метод GetToys() из другого класса

                // Запись результата вызова GetToys() в файл
                fileWriter.write(toys);
                fileWriter.write(System.lineSeparator()); // Добавляем перенос строки между результатами
            }
            System.out.println("Результаты успешно записаны в файл " + filePath);
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}

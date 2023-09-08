import Controllers.AccountController;
import Domen.Teacher;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        /**
         * Выводим список учителей чтобы посчитать средний возраст
         */

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Дарья", 57, "Docent"));
        teachers.add(new Teacher("Алексей", 45, "Docent"));
        teachers.add(new Teacher("Алёна", 38, "Docent"));
        teachers.add(new Teacher("Сергей", 50, "Docent"));
        teachers.add(new Teacher("Иван", 65, "Docent"));
/**
 * Использования обобщенного метода averageAge
 */
        double teacherAverageAge = AccountController.averageAge(teachers);

        System.out.println("Средний возраст учителя: " + teacherAverageAge);

    }
}
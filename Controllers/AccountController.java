package Controllers;

import Domen.Teacher;

import java.util.List;


/**
 * Создание обобщенного метода averageAge в классе AccountController:
 */
public class AccountController {
    public static <T extends Teacher> double averageAge(List<T> people) {
        if (people.isEmpty()) {
            return 0;
        }

        double totalAge = 0;

        for (T person : people) {
            totalAge += person.getAge();
        }

        return totalAge / people.size();
    }
}
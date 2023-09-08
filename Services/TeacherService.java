package Services;

import Domen.PersonComparator;
import Domen.Teacher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Создание класса TeacherService и подключение интерфейса iPersonService:
 */
public abstract class TeacherService implements iPersonService<Teacher> {
    private List<Teacher> teachers = new ArrayList<>();

    public void addPerson(Teacher teacher) {
        teachers.add(teacher);
    }

    public void removePerson(int id) {
        teachers.removeIf(teacher -> teacher.getAge() == id);
    }

    public List<Teacher> getPeople() {
        return teachers;
    }

    public void sortPeople() {
        Collections.sort(teachers, new PersonComparator());
    }
}
package org.maks.newclass;

import java.time.LocalDate;
import java.util.List;
public class Teacher { //Создаем класс для учителя
    private String name = "Ольга"; //Имя учительницы
    private String surname = "Лужникова";//Фамилия учительницы

    private Gender gender = Gender.WOMEN;//Пол
    private LocalDate dateOfBirth = LocalDate.of(1980,5,10);//Дата рождения
    private String welcome = "Здравствуйте студенты!";//Приветствие
    private List subjects = List.of(new String[]{"Математика","Физика","Английский"});//Предметы которые введет учительница
    public String getName() {
        return name;
    } //Геттер для всех предыдущих полей

    public String getSurname() {
        return surname;
    }
    public Gender getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getWelcome() {
        return welcome;
    }

    public List getSubjects() {
        return subjects;
    }

}

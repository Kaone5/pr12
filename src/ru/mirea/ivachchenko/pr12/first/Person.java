package ru.mirea.ivachchenko.pr12.first;

public class Person {

    private String surname;
    private String name;
    private String patronymic;

    Person(String surname){
        this(surname, null, null);
    }

    Person(String surname, String name){
        this(surname, name, null);
    }

    Person(String surname, String name, String patronymic){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(surname);
        if (name != null)
            stringBuilder.append(" ").append(name);
        if (patronymic != null)
            stringBuilder.append(" ").append(patronymic);
        return stringBuilder.toString();
    }
}

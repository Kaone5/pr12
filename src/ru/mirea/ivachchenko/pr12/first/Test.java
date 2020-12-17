package ru.mirea.ivachchenko.pr12.first;

public class Test {
    public static void main(String[] args) {
        String surname = "Ivanov", name = "Ivan", patronymic = "Ivanovich";
        Person p1 = new Person(surname);
        System.out.println(p1.toString());


        Person p2 = new Person(surname, name);
        System.out.println(p2.toString());

        Person p3 = new Person(surname, name, patronymic);
        System.out.println(p3.toString());
    }
}

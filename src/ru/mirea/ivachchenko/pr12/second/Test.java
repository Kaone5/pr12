package ru.mirea.ivachchenko.pr12.second;

public class Test {
    public static void main(String[] args) {
        String str1 = new String("Россия,Московская область,Москва,Улица Красная");
        Address address1 = new Address(str1);
        address1.setAddress(str1);
        address1.setAddressTokenizer(str1);

        String str2 = new String("Россия,Воронежская область,Воронеж,Улица Белая");
        Address address2 = new Address(str2);
        address2.setAddress(str2);
        address2.setAddress(str2);

        String str3 = new String("Россия,Свердловская область,Екатеринбург,Улица Черная");
        Address address3 = new Address(str3);
        address3.setAddress(str3);
        address3.setAddressTokenizer(str3);

        String str4 = new String("Россия,Кемеровская область,Новокузнецк,Улица Зеленая");
        Address address4 = new Address(str4);
        address4.setAddress(str4);
        address4.setAddressTokenizer(str4);
    }
}

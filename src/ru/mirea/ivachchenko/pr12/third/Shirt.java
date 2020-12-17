package ru.mirea.ivachchenko.pr12.third;

public class Shirt {
    private String[] shirts = {
            "S001,Black Polo Shirt,Black,XL",
            "S002,Black Polo Shirt,Black,L",
            "S003,Blue Polo Shirt,Blue,XL",
            "S004,Blue Polo Shirt,Blue,M",
            "S005,Tan Polo Shirt,Tan,XL",
            "S006,Black T-Shirt,Black,XL",
            "S007,White T-Shirt,White,XL",
            "S008,White T-Shirt,White,L",
            "S009,Green T-Shirt,Green,S",
            "S010,Orange T-Shirt,Orange,S",
    };

    private String[] number = new String[10];
    private String[] name = new String[10];
    private String[] color = new String[10];
    private String[] size = new String[10];

    private int count = 0;
    public void splitShirts(){
        for (int i = 0; i < shirts.length;i++) {
            String[] splitShirts = shirts[i].split(",");
            for (int j = 0; j < 4;j++) {
                if (count < 4) {
                    switch (count){
                        case 0:
                            number[i] = splitShirts[count];
                            break;
                        case 1:
                            name[i] = splitShirts[count];
                            break;
                        case 2:
                            color[i] = splitShirts[count];
                            break;
                        case 3:
                            size[i] = splitShirts[count];
                            break;
                    }
                    count++;
                }
            }
            if (count == 4){
                count = 0;
            }
        }
    }

    private String[] arrString = new String[40];
    private int nummberc = 0;
    private int namec = 0;
    private int colorc = 0;
    private int sizec = 0;

    public void print(){
        for (int j = 0; j < 40;j++){
            switch (j%4) {
                case 0:
                    arrString[j] = number[nummberc];
                    nummberc++;
                    System.out.print(arrString[j] + ": ");
                    break;
                case 1:
                    arrString[j] = name[namec];
                    namec++;
                    System.out.print(arrString[j] + ", ");
                    break;
                case 2:
                    arrString[j] = color[colorc];
                    colorc++;
                    System.out.print(arrString[j] + ", ");
                    break;
                case 3:
                    arrString[j] = size[sizec];
                    sizec++;
                    System.out.println(arrString[j]);
            }
        }
    }
}
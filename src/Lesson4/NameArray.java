package Lesson4;

public class NameArray {
    public static void main(String[] args) {

        String[] name = new String[3];
        name[0] = "Pawel";
        name[1] = "Rafal";
        name[2] = "Maciek";
        int n = 2;

        while (n >= 0)
            System.out.println(name[n--]);
    }
}

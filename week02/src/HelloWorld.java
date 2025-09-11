import java.util.Scanner; //psvm //Scanner //Alt Shift F10
//설정-도구-터미널-bash

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("안녕 "+ name);
    }
}

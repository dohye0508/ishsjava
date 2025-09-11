import java.util.Scanner;

public class PokemonGame {
    public static void main(String[] args) {   // ← public 추가
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                counter++;
            }
        }

        if (counter == 2) {
            System.out.println(number + "은 소수입니다");
        } else {
            System.out.println(number + "은 소수가 아닙니다");
        }

        sc.close();
    }
}



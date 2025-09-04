import java.util.Scanner;

class Pokemon {
    // concrete class (can produce object)
    int hp;
}

public class PokemonGame {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon();
        Pokemon squirtle = new Pokemon();
        Scanner scanner = new Scanner(System.in);

        System.out.print("피카츄의 체력을 입력하세요: ");
        pikachu.hp = scanner.nextInt();
        System.out.print("꼬부기의 체력을 입력하세요: ");
        squirtle.hp = scanner.nextInt();

        System.out.println("피카츄 체력: " + pikachu.hp);
        if (pikachu.hp > 100) {
            System.out.println("피카츄의 체력(" + pikachu.hp + ")이 여유");
        } else {
            System.out.println("피카츄의 체력(" + pikachu.hp + ")이 부족");
        }

        scanner.close();
    }
}

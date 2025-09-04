import java.util.Scanner;

class Pokemon {
    int hp;
}

public class PokemonGame {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon();
        Pokemon squirtle = new Pokemon();

        Scanner scanner = new Scanner(System.in);

        // 피카츄는 입력
        System.out.print("피카츄의 체력을 입력하세요: ");
        pikachu.hp = scanner.nextInt();

        // 꼬부기는 고정
        squirtle.hp = 110;

        // 출력
        if (pikachu.hp > squirtle.hp) {
            System.out.println("피카츄의 체력(" + pikachu.hp + ")이 여유. " +
                    "꼬부기의 체력(" + squirtle.hp + ")보다 높아요.");
        } else if (pikachu.hp < squirtle.hp) {
            System.out.println("피카츄의 체력(" + pikachu.hp + ")이 부족. " +
                    "꼬부기의 체력(" + squirtle.hp + ")보다 낮아요.");
        } else {
            System.out.println("피카츄의 체력(" + pikachu.hp + ")이 꼬부기의 체력(" +
                    squirtle.hp + ")과 같아요.");
        }

        scanner.close();
    }
}

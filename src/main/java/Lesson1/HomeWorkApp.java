package Lesson1;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp {


    public static void main(String[] args) {

        ActionInterface action[] = {new Human("Вася", 20, 15),
                                    new Cat("Барсик", 20, 15),
                                    new Robot("011011", 20, 15)};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину полосы припятствий");
        int m = scanner.nextInt();
        Move moves[] = new Move[m];


        System.out.println("Полоса состоит из:");
        for (int i = 0; i < moves.length; i++) {
            Random random = new Random();
            int a = random.nextInt(10);
            if (a < 5) {
                moves[i] = new Track("Track " + i, random.nextInt(20));
                System.out.println("полоса");
            } else {
                moves[i] = new Wall("Wall " + i, random.nextInt(30));
               System.out.println("стена");
            }
        }
        System.out.println();

        for (int i = 0; i < action.length; i++) {
            boolean result = true;
            for (int j = 0; j < moves.length; j++) {
                result = moves[j].move(action[i]);

                if (!result) {
                    break;
                }
            }
            action[i].info();
            if (result) {
                System.out.println("Прошел!!");
            } else {
                System.out.println("Не прошел!!");
            }
        }

    }
}




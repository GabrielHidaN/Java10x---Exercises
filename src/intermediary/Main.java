package intermediary;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // Input of Data
        Scanner sc = new Scanner(System.in);
        int option = 0;


        // Ninja 1 Uzumaki
        Uzumaki uzumaki = new Uzumaki();
        uzumaki.name = "Naruto Uzumaki";
        uzumaki.age = 15;


        // Ninja 2 Uchiha
        Uchiha uchiha = new Uchiha();
        uchiha.name = "Sasuke Uchiha";
        uchiha.age = 17;

        // Ninja 3 Hyuuga
        Hyuuga hyuuga = new Hyuuga();
        hyuuga.name = "Neji Hyuuga";
        hyuuga.age = 18;




        // Menu Of Options
        String menu = """
               
               #######################################
               ========== Ninjas Manager =============
               #######################################
               
                1. Exibir Informações Dos Ninjas
               
                2. Gerenciar Ninja
               
                3. Sair
               
                ==>""";


        // Loop of Menu

        while (option != 3) {
            System.out.print(menu);
            try {

                option = sc.nextInt();
                switch (option){
                    case 1:
                        System.out.println("============================================================================");
                        System.out.printf("Nome: %s \n", uzumaki.name);
                        System.out.printf("Idade: %d \n", uzumaki.age);
                        System.out.printf("Level: %s \n", uzumaki.level);
                        System.out.printf("Missão: %s \n", uzumaki.mission(uzumaki.mission));
                        System.out.printf("Missões Completadas: %d \n", uzumaki.missionsCompleted);

                        System.out.println("============================================================================");
                        System.out.printf("Nome: %s \n", uchiha.name);
                        System.out.printf("Idade: %d \n", uchiha.age);
                        System.out.printf("Level: %s \n", uchiha.level);
                        System.out.printf("Missão: %s \n", uchiha.mission(uchiha.mission));
                        System.out.printf("Missões Completadas: %d \n", uchiha.missionsCompleted);

                        System.out.println("============================================================================");
                        System.out.printf("Nome: %s \n", hyuuga.name);
                        System.out.printf("Idade: %d \n", hyuuga.age);
                        System.out.printf("Level: %s \n", hyuuga.level);
                        System.out.printf("Missão: %s \n", hyuuga.mission(hyuuga.mission));
                        System.out.printf("Missões Completadas: %d \n", hyuuga.missionsCompleted);

                }

            }catch (InputMismatchException e){
                sc.nextLine();
            }
        }
        sc.close();
    }
}

package intermediary;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static int manageNinja() {
        int optionManage = 0;
        System.out.println("====== Escolha uma das opções Abaixo: ");
        System.out.println("""
                
                1. Atribuir Missão Ao Ninja
                2. Concluir Missão
                3. Ativar Habilidade Especial
                ==>""");
        Scanner sc = new Scanner(System.in);
        try {
            optionManage = sc.nextInt();

            return optionManage;
        } catch (InputMismatchException e) {
            sc.nextLine();
        }
        sc.close();
        return optionManage;
    }

    public static void main(String[] args) {


        // Input of Data
        Scanner sc = new Scanner(System.in);
        int optionMenu = 0;


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
        while (optionMenu != 3) {
            System.out.print(menu);
            try {

                optionMenu = sc.nextInt();
                switch (optionMenu) {
                    case 1:
                        //Naruto
                        System.out.println("============================================================================");
                        System.out.printf("Nome: %s \n", uzumaki.name);
                        System.out.printf("Idade: %d \n", uzumaki.age);
                        System.out.printf("Level: %s \n", uzumaki.getLevel(uzumaki.missionsCompleted, uzumaki.levelNinja));
                        System.out.printf("Missão: %s \n", uzumaki.getMission(uzumaki.mission));
                        System.out.printf("Level da Missão: %s \n", uzumaki.levelDifficulty);
                        System.out.printf("Missões Completadas: %d \n", uzumaki.missionsCompleted);
                        System.out.printf("%s ativado ? %s \n", uzumaki.habilidade, uzumaki.skillAtivated);


                        //Sasuke
                        System.out.println("============================================================================");
                        System.out.printf("Nome: %s \n", uchiha.name);
                        System.out.printf("Idade: %d \n", uchiha.age);
                        System.out.printf("Level: %s \n", uchiha.getLevel(uchiha.missionsCompleted, uchiha.levelNinja));
                        System.out.printf("Missão: %s \n", uchiha.getMission(uchiha.mission));
                        System.out.printf("Level da Missão: %s \n", uchiha.levelDifficulty);
                        System.out.printf("Missões Completadas: %d \n", uchiha.missionsCompleted);
                        System.out.printf("%s ativado ? %s \n",uchiha.habilidade, uchiha.skillAtivated);


                        //Neji
                        System.out.println("============================================================================");
                        System.out.printf("Nome: %s \n", hyuuga.name);
                        System.out.printf("Idade: %d \n", hyuuga.age);
                        System.out.printf("Level: %s \n", hyuuga.getLevel(hyuuga.missionsCompleted, hyuuga.levelNinja));
                        System.out.printf("Missão: %s \n", hyuuga.getMission(hyuuga.mission));
                        System.out.printf("Level da Missão: %s \n", hyuuga.levelDifficulty);
                        System.out.printf("Missões Completadas: %d \n", hyuuga.missionsCompleted);
                        System.out.printf("%s ativado ? %s \n", hyuuga.habilidade, hyuuga.skillAtivated);


                        break;

                    case 2:
                        int manageNinja = manageNinja();

                        switch (manageNinja) {
                            case 1:
                                System.out.println("Qual Ninja Deseja Atribuir: ");
                                System.out.printf("1. %s \n", uzumaki.name);
                                System.out.printf("2. %s \n", uchiha.name);
                                System.out.printf("3. %s \n", hyuuga.name);

                                int ninjaSelected = sc.nextInt();
                                switch (ninjaSelected) {
                                    case 1:
                                        uzumaki.setNewMission(uzumaki.mission, uzumaki.missionsCompleted);
                                        break;
                                    case 2:
                                        uchiha.setNewMission(uchiha.mission, uchiha.missionsCompleted);
                                        break;
                                    case 3:
                                        hyuuga.setNewMission(hyuuga.mission, hyuuga.missionsCompleted);
                                        break;
                                    default:
                                        System.out.println("Falha ao Atribuir Missão");
                                        break;
                                }
                                break;
                            case 2:
                                System.out.println("Qual Ninja Deseja Atribuir: ");
                                System.out.printf("1. %s \n", uzumaki.name);
                                System.out.printf("2. %s \n", uchiha.name);
                                System.out.printf("3. %s \n", hyuuga.name);

                                ninjaSelected = sc.nextInt();

                                switch (ninjaSelected) {
                                    case 1:
                                        uzumaki.concludeMission();

                                        break;
                                    case 2:
                                        uchiha.concludeMission();
                                        break;
                                    case 3:
                                        hyuuga.concludeMission();
                                        break;
                                    default:
                                        System.out.println("Falha ao Concluir Missão");
                                        break;
                                }
                                break;
                            case 3:
                                System.out.println("Qual Ninja Deseja Atribuir: ");
                                System.out.printf("1. %s \n", uzumaki.name);
                                System.out.printf("2. %s \n", uchiha.name);
                                System.out.printf("3. %s \n", hyuuga.name);

                                ninjaSelected = sc.nextInt();

                                switch (ninjaSelected) {
                                    case 1:
                                        uzumaki.ativateSkill(uzumaki.skillAtivated);

                                        break;
                                    case 2:
                                        uchiha.ativateSkill(uchiha.skillAtivated);
                                        break;
                                    case 3:
                                        hyuuga.ativateSkill(hyuuga.skillAtivated);
                                        break;
                                    default:
                                        System.out.println("Falha ao Ativar Habilidade Especial");
                                        break;
                                }
                                break;
                        }
                }
            }catch (InputMismatchException e){
                System.out.println("Opção Ivalida");
                sc.nextLine();
            }

        }
        sc.close();
    }
}

package intermediary;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void manageNinja(int ninjaSelected){
        System.out.println("====== Escolha uma das opções Abaixo: ");
        System.out.println("""
                
                1. Atribuir Missão Ao Ninja
                2. Concluir Missão
                3. Ativar Habilidade Especial
                ==>""");
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
                switch (optionMenu){
                    case 1:
                        //Naruto
                        System.out.println("============================================================================");
                        System.out.printf("Nome: %s \n", uzumaki.name);
                        System.out.printf("Idade: %d \n", uzumaki.age);
                        System.out.printf("Level: %s \n", uzumaki.getLevel(uzumaki.missionsCompleted , uzumaki.levelNinja));
                        System.out.printf("Missão: %s \n", uzumaki.getMission(uzumaki.mission));
                        System.out.printf("Missões Completadas: %d \n", uzumaki.missionsCompleted);



                        //Sasuke
                        System.out.println("============================================================================");
                        System.out.printf("Nome: %s \n", uchiha.name);
                        System.out.printf("Idade: %d \n", uchiha.age);
                        System.out.printf("Level: %s \n", uchiha.getLevel(uchiha.missionsCompleted , uchiha.levelNinja));
                        System.out.printf("Missão: %s \n", uchiha.getMission(uchiha.mission));
                        System.out.printf("Missões Completadas: %d \n", uchiha.missionsCompleted);


                        //Neji
                        System.out.println("============================================================================");
                        System.out.printf("Nome: %s \n", hyuuga.name);
                        System.out.printf("Idade: %d \n", hyuuga.age);
                        System.out.printf("Level: %s \n", hyuuga.getLevel(hyuuga.missionsCompleted , hyuuga.levelNinja));
                        System.out.printf("Missão: %s \n", hyuuga.getMission(hyuuga.mission));
                        System.out.printf("Missões Completadas: %d \n", hyuuga.missionsCompleted);


                        System.out.println("""
                                
                                1. Gerenciar Ninja
                                2. Voltar
                                ==>""");
                        int controlOfMenu = sc.nextInt();


                        switch (controlOfMenu){



                            case 1:
                                System.out.println("Qual Ninja Você Deseja Gerenciar ?");
                                System.out.printf("1. %s \n", uzumaki.name);
                                System.out.printf("2. %s \n", uchiha.name);
                                System.out.printf("3. %s \n", hyuuga.name);
                                int ninjaSelected = sc.nextInt();


                            case 2:
                                continue;
                            default:
                                System.out.println("Opção Inválida!");
                                break;
                        }



                        break;


                    case 3:
                        continue;

                    default:
                        System.out.println("@@@ Opção Inválida! @@@");
                        break;

                }

            }catch (InputMismatchException e){
                sc.nextLine();
            }
        }
        sc.close();
    }
}


// Terminar o Painel de Controler de qual ninja ira fazer tal ação
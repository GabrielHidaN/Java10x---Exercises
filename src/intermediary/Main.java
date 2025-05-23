package intermediary;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Ninjas of Array
        int maxNinjas = 3;
        int quantityOfNinjas = 0;

        // Quantidade de ninja por clã (Só podera armazenar um ninja por clã)
        int ninjaUchiha = 0;
        int ninjaUzumaki = 0;
        int ninjaHyuuga = 0;

        // Input of Data
        Scanner sc = new Scanner(System.in);
        int option = 0;




        // Menu Of Options
        String menu = """
                
               #######################################
               ++++++++++                +++++++++++++
               ========== Ninjas Manager =============
               ++++++++++                +++++++++++++
               #######################################
                
                1. Exibir Informações Dos Ninjas
                
                2. Adicionar Ninja
                
                3. Sair
                
                ==>""";

        // Loop of Menu

        while (option != 3) {
            System.out.print(menu);
            try {
                option = sc.nextInt();
                switch (option){
                    case 1:
                        if (quantityOfNinjas == 0){
                            System.out.println("@@@ Nenhum Ninja Registrado @@@");
                        }
                        else {
                            System.out.println("...");
                        }
                        break;
                    case 2:
                        if (quantityOfNinjas < maxNinjas){
                            int optionClan;
                            System.out.print("""
                                ===== Qual o Clã do Ninja que Você deseja Registrar ? =====
                                1. Uchiha
                                2. Uzumaki
                                3. Hyuuga
                                =>""");
                                optionClan = sc.nextInt();
                                switch (optionClan){
                                    case 1:
                                        if (ninjaUchiha == 0){
                                            Uchiha uchiha = new Uchiha();
                                            System.out.println("Digite o Nome do Ninja: ");
                                            uchiha.name = sc.next();
                                            System.out.println("Digite a Idade do Ninja: ");
                                            uchiha.age = sc.nextInt();
                                            ninjaUchiha ++;
                                            quantityOfNinjas ++;
                                        }
                                        else {
                                            System.out.println("@@@ Não é Possível Registrar Mais Ninja desse Clã @@@");
                                        }
                                        break;
                                    case 2:
                                        if (ninjaUzumaki == 0){
                                            Uzumaki uzumaki = new Uzumaki();
                                            System.out.println("Digite o Nome do Ninja: ");
                                            uzumaki.name = sc.next();
                                            System.out.println("Digite a Idade do Ninja: ");
                                            uzumaki.age = sc.nextInt();
                                            ninjaUzumaki ++;
                                            quantityOfNinjas ++;
                                        }
                                        else {
                                            System.out.println("@@@ Não é Possível Registrar Mais Ninja desse Clã @@@");
                                        }
                                        break;

                                    case 3:
                                        if (ninjaHyuuga == 0){
                                            Hyuuga hyuuga = new Hyuuga();
                                            System.out.println("Digite o Nome do Ninja: ");
                                            hyuuga.name = sc.next();
                                            System.out.println("Digite a Idade do Ninja: ");
                                            hyuuga.age = sc.nextInt();
                                            ninjaHyuuga ++;
                                            quantityOfNinjas ++;
                                        }
                                        else {
                                            System.out.println("@@@ Não é Possível Registrar Mais Ninja desse Clã @@@");
                                        }
                                        break;
                                    default:
                                        System.out.println("Opção Inválida!");
                                        break;
                                }
                        }
                        else {
                            System.out.println("@@@ Número Máximo de Ninjas Alcançado @@@");
                        }
                    default:
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Opção Inválida");
                sc.nextLine();
            }
        }
    }
}

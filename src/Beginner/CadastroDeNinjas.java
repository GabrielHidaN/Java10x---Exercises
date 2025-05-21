package Beginner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CadastroDeNinjas {
    public static void main(String[] args) {

        // input
        Scanner sc = new Scanner(System.in);

        // array
        int maxNinjas = 3;
        String [] ninjas = new String[maxNinjas];

        // contadores
        int quantityOfNinja = 0;
        int option = 0 ;

        // menu
        String menu = """
                ===== Cadastro de Ninjas =====
                1. Cadastrar Ninja
                2. Listar Ninjas
                3. Sair
                =>""";


        while (option != 3){
            System.out.print(menu);


            // Try para garantir que o valor enviado não retorne um erro
            try {
                option = sc.nextInt();
            } //InputMismatchException Ocorre  quando o Scanner tenta ler um tipo de dado que não corresponde ao esperado
            catch (InputMismatchException e){
                sc.nextLine(); // Limpa o buffer do scanner
                option = 0;
            }

            switch (option){
                case 1:
                    if (quantityOfNinja == maxNinjas){
                        System.out.println("@@@ Número Máximo de Ninjas Alcançado! @@@");
                    }
                    else {
                        System.out.print("Digite o Nome do Ninja Que deseja Adicionar\n=>");
                        String ninja = sc.next();
                        ninjas[quantityOfNinja] = ninja;
                        quantityOfNinja ++;
                    }
                    break;
                case 2:
                    if (quantityOfNinja == 0){
                        System.out.println("@@@ Nenhum Ninja Encontrado! @@@");
                    }
                    else {
                        for (int i = 0; i < quantityOfNinja; i++) {
                            System.out.println(ninjas[i]);
                        }
                    }
                    break;
                default:
                    System.out.println("@@@ Opção Inválida! @@@");
                    break;
            }
        }
        sc.close();
    }
}

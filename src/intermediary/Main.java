package intermediary;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Ninjas of Array
        int maxNinjas = 3;
        String[] ninjas = new String[maxNinjas];
        int quantityOfNinjas = 0;


        // Input of Data
        Scanner sc = new Scanner(System.in);
        int option = 0;

        // Menu Of Options
        String menu = """
                ========== Ninjas ==========

                1. Exibir Informações Dos Ninjas
                
                2. Adicionar Ninja
                
                3. Sair
                
                ==>""";

        // Loop of Menu

        while (option != 3){
            System.out.print(menu);
            try {
                option = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("erro");
                sc.nextLine();
            }

            switch (option){
                case 1:
                    if(quantityOfNinjas == 0){
                        System.out.println(" @@@ Nenhum Ninja Registrado @@@");
                    }
                    else {
                        for (int i = 0; i < quantityOfNinjas; i++) {
                            System.out.println(ninjas[i]);
                        }
                    }
                    break;
                case 2:

            }
        }
        sc.close();
    }
}

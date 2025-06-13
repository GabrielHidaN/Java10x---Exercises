package avanced;

public class Main {
    public static void main(String[] args) {

        String nome = "Naruto Uzumaki";
        int idade = 16;

        Uzumaki Naruto = new Uzumaki(nome , idade);

        Uchiha Sasuke = new Uchiha("Sasuke Uchiha" , 18);

        Naruto.ataqueComum();
        Naruto.ataqueEspecial();

        System.out.println("==================");

        Sasuke.ataqueComum();
        Sasuke.ataqueEspecial();

    }
}

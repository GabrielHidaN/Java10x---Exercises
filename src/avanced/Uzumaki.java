package avanced;

public class Uzumaki extends Ninja{

    public Uzumaki(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void ataqueComum() {
        super.ataqueComum();
    }

    @Override
    public void ataqueEspecial() {
        System.out.printf("Eu sou o %s e meu ataque especial eh de Ar \n" , nome);
    }
}

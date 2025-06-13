package avanced;

public class Uchiha extends Ninja{
    public Uchiha(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void ataqueComum() {
        super.ataqueComum();
    }

    @Override
    public void ataqueEspecial() {
        System.out.printf("Eu sou o %s e meu ataque especial eh de Fogo \n" , nome);
    }
}

package avanced;

public abstract  class Ninja  implements NinjasInterface{
    String nome;
    int idade;



    public Ninja(String nome , int idade){
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public void ataqueComum() {
        System.out.printf("Eu sou o %s e meu ataque comum eh tacar uma shuriken \n" , nome);
    }

    @Override
    public void ataqueEspecial() {
        System.out.printf("Eu sou o %s e  esse eh meu ataque especial \n" , nome);
    }
}
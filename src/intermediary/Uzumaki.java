package intermediary;

public class Uzumaki extends  Ninja{

    public String habilidade = "Chakra";

    boolean skillAtivated = false;

    public void ativateSkill(boolean skillAtivated){
        this.skillAtivated = skillAtivated;

        if (!skillAtivated){
            System.out.println("Chakra Ativado com Sucesso");
            this.skillAtivated = true;
        }else {
            System.out.println("O Chakra Já Está Ativado");
        }
    }

    public void desativateSkill(boolean skillAtivated){
        this.skillAtivated = skillAtivated;

        if (skillAtivated){
            System.out.println("Chakra Desativado com Sucesso");
            this.skillAtivated = false;
        }else {
            System.out.println("O Chakra Já Está Desativado");
        }
    }

}

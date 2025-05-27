package intermediary;

public class Uchiha extends Ninja{
    public String habilidade = "Sharigan";

    boolean skillAtivated = false;

    public void ativateSkill(boolean skillAtivated){
        this.skillAtivated = skillAtivated;

        if (!skillAtivated){
            System.out.println("Sharigan Ativado com Sucesso");
            this.skillAtivated = true;
        }else {
            System.out.println("O Sharigan Já Está Ativado");
        }
    }

    public void desativateSkill(boolean skillAtivated){
        this.skillAtivated = skillAtivated;

        if (skillAtivated){
            System.out.println("Sharigan Desativado com Sucesso");
            this.skillAtivated = false;
        }else {
            System.out.println("O Sharigan Já Está Desativado");
        }
    }


}

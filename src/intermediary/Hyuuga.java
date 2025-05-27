package intermediary;

public class Hyuuga extends Ninja{

    String habilidade = "Byakugan";
    boolean skillAtivated = false;

    public void ativateSkill(boolean skillAtivated){
        this.skillAtivated = skillAtivated;

        if (!skillAtivated){
            System.out.println("Byakugan Ativado com Sucesso");
            skillAtivated = true;
        }else {
            System.out.println("O Byakugan Já Está Ativado");
        }
    }

    public void desativateSkill(boolean skillAtivated){
        this.skillAtivated = skillAtivated;

        if (skillAtivated){
            System.out.println("Byakugan Desativado com Sucesso");
            skillAtivated = false;
        }else {
            System.out.println("O Byakugan Já Está Desativado");
        }
    }

}

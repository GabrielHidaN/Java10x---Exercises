package intermediary;

public class Uchiha extends Ninja{
    public String habilidade = "Sharigan";
    public boolean shariganActivated = false;

    public void showInformation(){
        System.out.println(".....");
    }
    public void ativateSharigan(boolean shariganActivated){
        if(shariganActivated == true){
            System.out.println("O Sharingan Já está Ativado");
        }else {
            System.out.println("Sharigan Ativado!");
            shariganActivated = true;
        }
    }
}

package intermediary;

public class Hyuuga extends Ninja{

    String habilidade = "Byakugan";
    public void showInformation(){
        System.out.println(".....");
    }

    public String mission(String mission){
        this.mission = mission;
        if (mission == null){
            return "Esse Ninja Ainda Não tem uma Missão";
        }
        else {
            return mission;
        }
    }

}

package intermediary;

public class Uzumaki extends  Ninja{


    public String habilidade = "Shakara";


    public String mission(String mission){
        this.mission = mission;
        if (mission == null){
            return "Esse Ninja Ainda Não tem uma Missão";
        }
        else {
            return mission;
        }
    }

    public void showInformation(){
        System.out.println(".....");
    }
}

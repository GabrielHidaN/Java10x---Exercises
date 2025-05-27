package intermediary;

public class Ninja {
    String name;
    int age;
    String levelNinja = "Genin";
    String mission = null;
    int missionsCompleted = 0;
    String  levelDifficulty = "Sem Missão";
    boolean missionConcluded = false;



    public String getLevel(int missionsCompleted , String levelNinja){
        this.levelNinja = levelNinja;
        this.missionsCompleted = missionsCompleted;

        if (missionsCompleted == 0){
           this.levelNinja = "Genin";
        }
        else if (missionsCompleted > 0 && missionsCompleted <3){
            this.levelNinja = "Chuunin";
        } else{
            this.levelNinja = "Jounin";
        }
        return this.levelNinja;

    }

    public void concludeMission(){
        if(this.mission == null){
            System.out.println("Você Não Tem Missão Ativa No momento");
        }else {
            missionsCompleted ++;
            missionConcluded = true;
            System.out.println("Missão Concluída Com Sucesso!");
            levelDifficulty = "Sem Missão";
            mission = null;
        }
    }


    public String getMission(String mission){
        this.mission = mission;
        if (mission == null){
            return "Este Ninja Ainda Não tem uma Missão";
        }
        else {
            return mission;
        }
    }

    public void setNewMission(String levelNinja , int missionsCompleted) {

        if (mission == null) {
            if (this.levelNinja != null && this.levelNinja.equals("Genin")) {
                levelDifficulty = "D";
                mission = "Ajudar na colheita ou agricultura.";
            } else if (this.levelNinja != null && this.levelNinja.equals("Chuunin")){
                if (missionsCompleted == 1) {
                    levelDifficulty = "C";
                    mission = "Liderar uma escolta para uma caravana.";
                } else {
                    levelDifficulty = "B";
                    mission = "Liderar uma missão de reconhecimento em território desconhecido.";
                }
            } else if (this.levelNinja != null && this.levelNinja.equals("Jounin")) {
                if (missionsCompleted < 4) {
                    levelDifficulty = "A";
                    mission = "Infiltração em vilas inimigas.";
                } else {
                    levelDifficulty = "S";
                    mission = "Captura de membros da Akatsuki.";
                }
            }
        } else {
            System.out.println("O Ninja Tem Uma Missão em Andamento");
        }
    }
}

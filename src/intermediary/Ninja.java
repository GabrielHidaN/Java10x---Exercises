package intermediary;

public class Ninja {
    String name;
    int age;
    String levelNinja;
    String mission = null;
    int missionsCompleted = 0;
    String  levelDifficulty = "Sem Missão";
    boolean missionConcluded = false;



    public String getLevel(int missionsCompleted , String levelNinja){
        this.levelNinja = levelNinja;
        this.missionsCompleted = missionsCompleted;

        if (missionsCompleted == 0){
           levelNinja = "Genin";
        }
        else if (missionsCompleted >= 1 && missionsCompleted <4){
            levelNinja = "Chuunin";
        } else{
            levelNinja = "Jounin";
        }
        return levelNinja;

    }

    public void concludeMission(){
        missionsCompleted ++;
        missionConcluded = true;
        System.out.println("Missão Concluída Com Sucesso!");
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

    public void setNewMission(String levelNinja , int missionsCompleted){
        this.levelNinja = levelNinja;
        this.missionsCompleted = missionsCompleted;

        if(levelNinja.equals("Genin")){
            levelDifficulty = "D";
            mission = "Ajudar na colheita ou agricultura.";
        } else if (levelNinja.equals("Chuunin")){
            if (missionsCompleted <3){
                levelDifficulty = "C";
                mission = "Liderar uma escolta para uma caravana.";
            }else {
                levelDifficulty = "B";
                mission = "Liderar uma missão de reconhecimento em território desconhecido.";
            }
        } else if (levelNinja.equals("Jounin")){
            if (missionsCompleted < 5){
                levelDifficulty = "A";
                mission = "Infiltração em vilas inimigas.";
            }
            else {
                levelDifficulty = "S";
                mission = "Captura de membros da Akatsuki.";
            }
        }
    }
}

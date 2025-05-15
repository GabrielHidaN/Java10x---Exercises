package Beginner;
public class Ninja1 {
    public static void main(String[] args) {


        String ninja1 , ninja2 , ninja3;
        int age_ninja1 , age_ninja2 , age_ninja3;
        String task_ninja1 , task_ninja2 , task_ninja3;
        String status1 , status2 , status3;
        char levelTask1 , levelTask2 , levelTask3;

        // Ninja 1
        ninja1 = "Naruto Uzumaki";
        age_ninja1 = 14;
        task_ninja1 = "Capturar Bandidos";
        levelTask1 = 'S';

        if (age_ninja1 < 15){
            if (levelTask1 == 'D'|| levelTask1 == 'C') {
                status1 = "Task completed";
            }
            else {
                status1 = "Task not completed because the ninja is not old enough";
            }
        }
        else {
            status1 = "Task completed";
        }
        System.out.println("---------------------------------------");
        System.out.println("Name : " + ninja1);
        System.out.println("Age : " + age_ninja1);
        System.out.println("Task : " + task_ninja1);
        System.out.println("Status : " + status1);
        System.out.println("---------------------------------------");

        // Ninja 2
        ninja2 = "Sasuke Uchiha";
        age_ninja2 = 16;
        task_ninja2 = "Reconhecimento da Aldeia";
        levelTask2 = 'S';

        if (age_ninja2 < 15){
            if (levelTask2 == 'D'|| levelTask2 == 'C') {
                status2 = "Task completed";
            }
            else {
                status2 = "Task not completed because the ninja is not old enough";
            }
        }
        else {
            status2 = "Task completed";
        }
        System.out.println("Name : " + ninja2);
        System.out.println("Age : " + age_ninja2);
        System.out.println("Task : " + task_ninja2);
        System.out.println("Status : " + status2);
        System.out.println("---------------------------------------");

        // Ninja 3
        ninja3 = "Sakura Haruno";
        age_ninja3 = 19;
        task_ninja3 ="Curar Feridos";
        levelTask3 = 'D';

        if (age_ninja3 < 15){
            if (levelTask3 == 'D'|| levelTask3 == 'C') {
                status3 = "Task completed";
            }
            else {
                status3 = "Task not completed because the ninja is not old enough";
            }
        }
        else {
            status3 = "Task completed";
        }
        System.out.println("Name : " + ninja3);
        System.out.println("Age : " + age_ninja3);
        System.out.println("Task : " + task_ninja3);
        System.out.println("Status : " + status3);
        System.out.println("---------------------------------------");
    }
}

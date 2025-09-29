//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int age = 17;
        System.out.println("Тебе " + age + " лет.");
        if (age >= 18) {
            System.out.println("ты совершеннолетний");
        } else {
            System.out.println(" Ты не достиг совершеннолетия, нужно подождать.");
        }

        System.out.println();
        System.out.println("Задача №2");
        int temp = 6;
        if (temp <= 5) {
            System.out.println(" На улице " + temp + " градусов." + " На улице холодно, надень шапку.");
        } else {
            System.out.println(" На улице " + temp + " градусов." + " На улице тепло, можно идти без шапки.");
        }

        System.out.println();
        System.out.println("Задача №3");
        int speed = 59;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", можно ездить спокойно.");
        }

        System.out.println();
        System.out.println("Задача №4");
        int age1 = 30;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека " + age1 + ", то ему нужно ходить в детский сад" );
        } else if (age1 >=7 && age1 <=17){
            System.out.println("Если возраст человека " + age1 + ", то ему нужно ходить в школу");
        } else if (age1 >=18 && age1 <=24){
            System.out.println("Если возраст человека " + age1 + ", то его место в университете.");
        } else {
            System.out.println("Если возраст человека " + age1 + ", то ему пора ходить на работу");
        }

        System.out.println();
        System.out.println(" Задача №5");
        int age2 = 1;
        if (age2 <= 5) {
            System.out.println("Если возраст ребенка " + age2 + ", то он не может кататься на аттракционе.");
        } else if (age2 > 5 && age2 <= 14) {
            System.out.println("Если возраст ребенка " + age2 + ", то он может кататься только в сопровождении взрослого.Если взрослого нет кататься нельзя.");
        } else {
            System.out.println("Если возраст ребенка " + age2 + ", то он может кататься на аттракционе без сопровождения взрослого.");
        }

        System.out.println();
        System.out.println("Задача №6");
        int places = 108;
        if (places <=60) {
            System.out.println("В вагоне есть свободные сидячие места");
        } else if (places > 60 && places <= 102) {
            System.out.println("в вагоне есть только стоячие места");
        } else {
            System.out.println("в вагоне нет свободных мест, вагон полон.");
        }

        System.out.println();
        System.out.println("Задача №7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three){
            System.out.println(one + " большее число.");
        } else if (one < two && two > three) {
            System.out.println(two + " большее число");
        } else {
            System.out.println(three + " большее число");}
    }
}

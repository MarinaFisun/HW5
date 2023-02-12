import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1() {
        System.out.println("Task 1");
        int age = 21;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " ,то  он совершеннолетний ");
        } else
        {
            System.out.println("Если возраст человека равен " + age + " , то он не достиг совершеннолетия, нужно немного подождать" );
        }
    }
    public static void task2() {
        System.out.println("Task 2");
        int airTemperature = 5;
        if (airTemperature < 5) {
            System.out.println("На улице " + airTemperature+ " градусов, нужно надеть шапку");
        }
        if (airTemperature >= 5) {
            System.out.println("На улице " + airTemperature + " градусов, можно идти без шапки");
        }
    }
    public static void task3() {
        System.out.println("Task 3");
        int speed=70;
        if (speed <= 60) {
            System.out.println("Если скорость " +speed+ " ,то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + " , то придется заплатить штраф");
        }
        }
    public static void task4() {
        System.out.println("Task 4");
        int age = 19;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в детский сад");
        }
        if (age > 6 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в школу");
        }
        if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в университет");
        }
        if (age > 24) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить на работу");
        }
    }
    public static void task5() {
        System.out.println("Task 5");
        int age = 3;
        if (age <= 5) {
            System.out.println("Если возраст ребенка равен " + age + " , то ему нельзя кататься на аттракционе");
        }
        else if (age > 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + " , то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        else {
            System.out.println("Если возраст ребенка равен " + age + " , то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }
    }

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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
    }

public class Main {
    public static void main(String[] args) {
        task1();
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
}
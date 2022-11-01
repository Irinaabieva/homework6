public class Main {
    public static void main(String[] args) {
        // Задача 1
        int age = 25;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        else if ( age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно в университет");
        }
        else {
            System.out.println("Если возраст человека равен " + age + ", то ему пора на работу");
        }
    }
}
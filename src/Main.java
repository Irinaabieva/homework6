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

        // Задача 2

        int secondAge = 15;
        if (secondAge < 5) {
            System.out.println("Ребенок не может кататься на аттракционе");
        } else if (secondAge >=5 && secondAge <= 14) {
            System.out.println("Ребенок может кататься на аттракицоне в сопровождении взрослого");
        } else {
            System.out.println("Можно кататься без сопровождения взрослого");
        }
    }
}
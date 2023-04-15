public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека" + age + "то, он совершеннолетний");
        }

        int ageMan = 17;
        if (ageMan <= 17) {
            System.out.println("Если возраст человека" + ageMan + "он не достиг совершенолетия, нужно немного подождать");
        }

        int heat = 5;
        if (heat <= 5) {
            System.out.println("На улице" + heat + "градусов, нужно надеть шапку");
        }

        int fever = 6;
        if (fever >= 6) {
            System.out.println("На улице" + fever + "градусов, можно идти без шапки");
        }

        int speed = 65;
        if (speed >= 65) {
            System.out.println("Если скорость" + speed + "то, придется заплатить штраф");
        }

        int speedLimit = 60;
        if (speedLimit <= 60) {
            System.out.println("Если скорость" + speed + "можно ездить спокойно");
        }

        int ageChild = 5;
        boolean childGoesToKindergarten = ageChild > 2 || ageChild < 6;
        if (childGoesToKindergarten) {
            System.out.println("Если возраст человека равен" + ageChild + ",то ему нужно ходить в детский сад");
        }

        int ageSchoolboy = 12;
        boolean childGoesToSchool = ageSchoolboy > 7 || ageSchoolboy < 18;
        if (childGoesToSchool) {
            System.out.println("Если возраст человека равен" + ageSchoolboy + ",то ему нужно ходить в школу");
        }

        int yongMan = 22;
        boolean manGoesToUniversity = yongMan > 18 || yongMan < 24;
        if (manGoesToUniversity) {
            System.out.println("Если возраст человека равен" + yongMan + ",то ему нужно ходить в университет");
        }

        int manAge = 26;
        if (manAge >= 24) {
            System.out.println("Если возраст человека равен" + manAge + ",то ему нужно ходить на работу");
        }

        int baby = 4;
        if (baby <= 5) {
            System.out.println("Если возраст ребенка равен" + baby + ",то ему нельзя кататься на аттракционе");
        }

        int kid = 7;
        boolean kidOnTheRide = kid > 5 || kid < 14;
        if (kidOnTheRide) {
            System.out.println("Если возраст ребенка равен" + kid + ", то ему можно кататься в сопровождении взрослого");
        }

        int infant = 12;
        if (infant >= 14) {
            System.out.println("Если возраст ребенка равен" + infant + ", то ему можно кататься без сопровождения взрослого");
        }

        int count = 65;
        if (count <= 60) {
            System.out.println("Есть сидячие");
        } else if (count <= 42) {
            System.out.println("Есть стоячие");
        } else {System.out.println("Мест нет");}

        int a = 1;
        int b = 2;
        int c = 3;
        if ((a > b) || (a > c)) {
            System.out.println(1);
        } else if ((c > b) || (c > a)) {
            System.out.println(3);
        }
    }
}

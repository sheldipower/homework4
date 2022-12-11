public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 15;
        if (age >= 18) {
            System.out.println("Ты совершеннолетний");
        } else {
            System.out.println("Ты не совершеннолетний");
        }

    }

    public static void task2() {
        int airTemperature = 6;
        if (airTemperature < 5)
            System.out.println("На улице холодно, нужно надеть шапку");
        else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }

    public static void task3() {
        int speed = 8;
        if (speed > 60)
            System.out.println("Скорость превышена? Придется заплатить штраф");
        else {
            System.out.println("Превышения скорости нет, можно ездить спокойно");

        }
    }

    public static void task4() {
        int age = 25;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен" + age + "то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + "то ему нужно ходить в школу");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен" + age + "то ему нужно ходить в университет");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен" + age + "то ему пора ходить на работу");

        }

    }

    public static void task5() {
        int age = 8;
        if (age < 5) {
            System.out.println("Если возраст человека равен" + age + "то ему запрещено кататься на аттракционах");
        } else if (age >= 5 && age < 14) {
            System.out.println("Если возраст человека равен " + age + "ему можно кататься на аттракционах только в сопровождении взрослых");
        } else if (age > 14) {
            System.out.println("Если возраст человека равен" + age + "то ему можно кататься на аттракционах без сопровождения взрослых");

        }
    }

    public static void task6(){
    int place = 82;
    if (place > 102) {
        System.out.println("Мест нет");
    }
    else if (place <102 && place > 60) {
        System.out.println("Есть только стоячие места");
    }
    else if (place <102 && place <= 60) {
        System.out.println("Есть сидячие места");
    }
    }
    public static void task7() {
        int one = 100;
        int two = 12;
        int three = 1500;
        if (one > two && one > three)
        {
            System.out.println("Переменная one имеет большее значение");
            //
        }
        else if (two > one && two > three) {
            System.out.println("Переменная three имеет большее значение");
            ///
        }

        else if (three > one && three > two) {
            System.out.println("Переменная three имеет большее значение");
            ///
        }



        }
    }



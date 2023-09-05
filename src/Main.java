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
        System.out.print("Если возраст человека равен " + age + ", то ");
        if (age >= 18) {
            System.out.println("он совершеннолетний.");
        } else {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 4;
        System.out.print("На улице " + temperature + " градусов, ");
        if (temperature < 5) {
            System.out.println("холодно, нужно надеть шапку.");
        } else {
            System.out.println("сегодня тепло, можно идти без шапки.");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 59;
        System.out.print("Если скорость " + speed + " км/ч, то ");
        if (speed > 60) {
            System.out.println("придется заплатить штраф.");
        } else {
            System.out.println("можно ездить спокойно.");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int agePeople = 25;
        boolean goToKindergarten = agePeople >= 2 && agePeople <= 6;
        boolean goToSchool = agePeople >= 7 && agePeople <= 18;
        boolean goToUniversity = agePeople > 18 && agePeople <= 24;
        System.out.print("Если возраст человека равен " + agePeople + " лет, то ");
        if (goToKindergarten || goToSchool || goToUniversity) {
            if (goToKindergarten) {
                System.out.println("ему нужно ходить в детский сад.");
            }
            if (goToSchool) {
                System.out.println("ему нужно ходить в школу.");
            }
            if (goToUniversity) {
                System.out.println("его место в университете.");
            }
        } else {
            System.out.println("ему пора ходить на работу.");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int ageChild = 14;
        System.out.print("Если возраст ребенка равен " + ageChild + ", то ему ");
        if (ageChild < 14) {
            if (ageChild < 5) {
                System.out.println("нельзя кататься на аттракционе.");
            }
            if (ageChild >= 5) {
                System.out.println("можно кататься на аттракционе в сопровождении взрослого.");
            }
        } else {
            System.out.println("можно кататься на аттракционе без сопровождения взрослого.");
        }

    }

    public static void task6() {
        System.out.println("Задача 6");
        int numberTicketsSold = 10;
        int capacityOneWagon = 102;
        int seatPlaces = 60;
        int standPlaces = capacityOneWagon - seatPlaces;
        int freeSeatPlaces;
        int freeStandPlaces;
        if (numberTicketsSold >= capacityOneWagon) {
            System.out.println("В вагоне не осталось мест.");
        } else {
            if (numberTicketsSold < seatPlaces) {
                freeSeatPlaces = seatPlaces - numberTicketsSold;
                System.out.println("В вагоне осталось " + freeSeatPlaces + " сидячих мест и " + standPlaces + " стоячих мест.");
            } else {
                freeStandPlaces = standPlaces - (numberTicketsSold - seatPlaces);
                System.out.println("В вагоне осталось только " + freeStandPlaces + " стоячих мест.");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 2;
        int two = 5;
        int three = -9;
        if (one >= two && one >= three) {
            System.out.println("Большее число из трех - " + one);
        } else  {
            if (two >= one && two >= three) {
                System.out.println("Большее число из трех - " + two);
            } else {
                System.out.println("Большее число из трех - " + three);
            }
        }

    }
}
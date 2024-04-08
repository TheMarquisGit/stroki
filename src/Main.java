public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String secondName = "Ivanov";
        String lastName = "Ivanovich";
        String fullName = secondName + " " + firstName + " " + lastName;
        System.out.println(fullName);

        //Задача 2
        System.out.println("\nЗадача 2");
        String fio = "Данные Ф.И.О. сотрудника для заполнения отчета - ";
        System.out.println(fio + fullName.toUpperCase());

        //Задача 3
        System.out.println("\nЗадача 3");
        fullName = "Иванов Семён Семёнович";
        System.out.println(fio + fullName.replace("ё", "е"));
    }
}
public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder().setName("Анна").setSurname("Сенькова").setAge(31).setAddress("Grove Street").build();

        Person son = mom.newChildBuilder().setName("Миша").build();

        System.out.println("У " + mom + " есть сын, " + son);

        try {
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            new PersonBuilder().setName("Иван").setSurname("Иванов").setAge(-100).build();
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

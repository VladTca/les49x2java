public class Main {
    public static void main(String[] args) {
        Programmer p1 = new Programmer("Ivan", "Доступен");
        Programmer p2 = new Programmer("Petya", "занят");
        Programmer p3 = new Programmer("Vasya", "Не Доступен");
        Programmer p4 = new Programmer("Xman", "Достен");

        try {
            System.out.println(p1.doWork("task1"));
        } catch (ProgrammerBusyExeption | ProgrammerUnavailableNowException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("---------------------------------------");
        try {
            System.out.println(p2.doWork("task2"));
        } catch (ProgrammerBusyExeption | ProgrammerUnavailableNowException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("---------------------------------------");
        try {
            System.out.println(p3.doWork("task3"));
        } catch (ProgrammerBusyExeption | ProgrammerUnavailableNowException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("---------------------------------------");
        try {
            System.out.println(p4.doWork("task4"));
        } catch (ProgrammerBusyExeption | ProgrammerUnavailableNowException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
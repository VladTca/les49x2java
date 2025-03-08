public class Programmer {
    String name;
    String status;

    public Programmer(String name, String status) {
        this.name = name;
        this.status = status.toLowerCase();
    }

    public String doWork(String taskMsg) {
        switch (status) {
            case "доступен":
                return taskMsg.toUpperCase();
            case "занят":
                throw new ProgrammerBusyExeption("Программист занят другой задачей");
            case "не доступен":
                throw new ProgrammerUnavailableNowException("Программист не доступен");
            default:
                throw new IllegalStateException("Некорректный статус: " + status);
        }

    }
}

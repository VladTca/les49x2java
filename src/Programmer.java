public record Programmer(String name, String status) {
    public String doWork(String taskMsg) {
        switch (status.trim().toLowerCase()) {
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

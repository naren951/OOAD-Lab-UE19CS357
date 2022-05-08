import myInterface.Employee;
class Developer implements Employee {
    private String name;
    private long empId;
    private String position;

    public Developer(long empId, String name, String position) {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(empId + " " + name + " " + position);
    }

    public void createTask(Task task) {
        System.out.println("Developer created the task");
    }
    public void openTask(Task task) {
        System.out.println("Developer opened the task");
    }
    public void executeTask(Task task) {
        System.out.println("Developer executed the task");
    }
}

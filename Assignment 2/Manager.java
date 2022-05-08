import myInterface.Employee;
class Manager implements Employee {

    private String name;
    private long empId;
    private String position;

    public Manager(long empId, String name, String position) {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(empId + " " + name + " " + position);
    }

    public void createTask(Task task) {
        System.out.println("Manager created the task");
    }
    public void openTask(Task task) {
        System.out.println("Manager opened the task");
    }
    public void executeTask(Task task) {
        System.out.println("Manager executed the task");
    }
}

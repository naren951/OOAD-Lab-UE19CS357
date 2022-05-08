import myInterface.Employee;
class TechLead implements Employee {

    private String name;
    private long empId;
    private String position;

    public TechLead(long empId, String name, String position) {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(empId + " " + name + " " + position);
    }

    public void createTask(Task task) {
        System.out.println("TechLead created the task");
    }
    public void openTask(Task task) {
        System.out.println("TechLead opened the task");
    }
    public void executeTask(Task task) {
        System.out.println("TechLead executed the task");
    }
}

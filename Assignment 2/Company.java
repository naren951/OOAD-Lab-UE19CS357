import java.util.*;
class Company {
    private Manager manager;
    private TechLead techLead;
    private Developer developer;

    public Company(Manager manager, TechLead techLead, Developer developer) {
        this.manager = manager;
        this.techLead = techLead;
        this.developer = developer;
    }

    public void executeTask(Task task) {
        System.out.println();
        if(task.getTaskLevel()==1)
        {
            
            techLead.openTask(task);
            developer.executeTask(task);
        }
        else if(task.getTaskLevel()==2)
        {
            manager.openTask(task);
            techLead.executeTask(task);
        }
        else{
            manager.openTask(task);
            manager.executeTask(task);
        }
        System.out.println();
        task.showTaskDetails();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        String taskName,taskType,taskStatus;
        int taskLevel,taskSize,effortRequired;
        System.out.print("Enter Task Name - ");
        taskName = sc.nextLine();
        System.out.print("Enter Task Type - ");
        taskType = sc.nextLine();
        System.out.print("Enter Task Status - ");
        taskStatus = sc.nextLine();
        System.out.print("Enter Task Level - ");
        taskLevel = sc.nextInt();
        System.out.print("Enter Task Size - ");
        taskSize = sc.nextInt();
        System.out.print("Enter Effort Required - ");
        effortRequired = sc.nextInt();
        System.out.println();
        Manager manager = new Manager(1, "Abhishek", "Manager");
        TechLead techLead = new TechLead(2, "Naren", "TechLead");
        Developer developer = new Developer(3, "Shighi", "Developer");
        Company company = new Company(manager, techLead, developer);
        //Task task = new Task("Finish OOad assignemnt", "Project", "Pending", 1, 8, 10);
        Task task = new Task(taskName, taskType, taskStatus, taskLevel, taskSize, effortRequired);
        task.showTaskDetails();
        company.executeTask(task);
    }
}

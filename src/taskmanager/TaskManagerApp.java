package taskmanager;

import java.util.Date;
import java.util.Scanner;

public class TaskManagerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UtilClass util = new UtilClass(sc);
        TaskManager manager = new TaskManager(util);
        boolean running = true;
        while (running) {
            System.out.println("\n1: Add task\n2: View tasks\n3: Mark complete\n4: Remove task\n5: Quit");
            int choice = util.getInputInt(1, 5);
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Title: ");
                    String title = util.getInputString(".+");
                    System.out.println("Description: ");
                    String description = util.getInputString(".+");
                    System.out.println("Priority (1-5): ");
                    int priority = util.getInputInt(1, 5);
                    sc.nextLine();
                    manager.addTask(new Task(title, description, new Date(), priority));
                    break;
                case 2:
                    manager.viewTasks();
                    break;
                case 3:
                    manager.markComplete();
                    break;
                case 4:
                    manager.removeTask();
                    break;
                case 5:
                    running = false;
                    break;
            }
        }
    }
}

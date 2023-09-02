import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TaskManager taskManager = new TaskManager();
		
		while (true) {
			System.out.println("To-Do List Application");
			System.out.println("1. Add Task");
			System.out.println("2. Remove Task");
			System.out.println("3. Mark Task as Completed");
			System.out.println("4. View Tasks");
			System.out.println("5. Exit");
			System.out.print("Choose an option: ");
			
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline
			
			switch (choice) {
				case 1:
					System.out.print("Enter task title: ");
					String title = scanner.nextLine();
					taskManager.addTask(title);
					break;
				case 2:
					System.out.print("Enter task index to remove: ");
					int indexToRemove = scanner.nextInt();
					taskManager.removeTask(indexToRemove);
					break;
				case 3:
					System.out.print("Enter task index to mark as completed: ");
					int indexToMark = scanner.nextInt();
					taskManager.markAsCompleted(indexToMark);
					break;
				case 4:
					System.out.println("Tasks:");
					for (int i = 0; i < taskManager.getTasks().size(); i++) {
						System.out.println(i + ". " + taskManager.getTasks().get(i));
					}
					break;
				case 5:
					System.out.println("Exiting...");
					return;
				default:
					System.out.println("Invalid choice. Please try again.");
			}
		}
	}
}

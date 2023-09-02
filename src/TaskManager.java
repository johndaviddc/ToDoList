import java.util.ArrayList;
import java.util.List;

public class TaskManager {
	private List<Task> tasks;
	
	public TaskManager() {
		this.tasks = new ArrayList<>();
	}
	
	public void addTask(String title) {
		tasks.add(new Task(title));
	}
	
	public void removeTask(int index) {
		tasks.remove(index);
	}
	
	public void markAsCompleted(int index) {
		tasks.get(index).setCompleted(true);
	}
	
	public List<Task> getTasks() {
		return tasks;
	}
}

public class TaskClient  {
    public static void main (String [] args)  {
	Task [] tasks = new Task [4];
	tasks [0] = new Task ();
	tasks [1] = new Task (1);
	tasks [2] = new Task (2);
	tasks [3] = new Task ();

	tasks [3].setPriority(3);

	for (int i = 0; i < 255; i++)  {
	    for (Task task : tasks)  {
		if (task.getPriority() == i)  {
		    task.doSomething();
		}
	    }
	}
    }
}

public class Task implements Priority  {
    private int priority;

    public Task ()  {
	this.priority = 0;
    }

    public Task (int priority)  {
	this.priority = priority;
    }

    public void doSomething ()  {
	System.out.println("oihehrh9ahr");
    }

    @Override
    public int getPriority ()  {
	return this.priority;
    }

    @Override
    public void setPriority (int priority)  {
	this.priority = priority;
    }
}

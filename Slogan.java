public class Slogan  {
    private String slogan;

    private static int instances;

    public Slogan (String slogan)  {
	this.slogan = slogan;
	instances++;
    }

    public static int getInstances ()  {
	return instances;
    }
    
    public String toString ()  {
	return this.slogan;
    }

}

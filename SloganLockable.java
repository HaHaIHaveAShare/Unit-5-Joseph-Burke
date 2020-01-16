public class SloganLockable implements Lockable  {
    private String slogan;
    boolean locked = false;
    int key;
    
    private static int instances;

    public SloganLockable (String slogan)  {
	this.slogan = slogan;
	instances++;
    }

    public static int getInstances ()  {
	return instances;
    }
    
    public String toString ()  {
	if (this.locked) return null;
	return this.slogan;
    }

    @Override
    public void setKey (int key)  {
	this.key = key;
    }

    @Override
    public void lock (int key)  {
	if (this.key == key)  this.locked = true;
    }

    @Override
    public void unlock (int key)  {
	if (this.key == key)  this.locked = false;
    }

    @Override
    public boolean locked ()  {
	return this.locked;
    }
}

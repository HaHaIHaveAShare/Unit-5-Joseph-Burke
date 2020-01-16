public class Num implements Comparable <Num>  {
    private int val;
       
    public Num (int val)  {
	this.val = val;
    }

    public int getValue ()  {
	return val;
    }

    public void setValue (int val)  {
	this.val = val;
    }

    public String toString ()  {
	return "" + this.val;
    }

    public boolean Equals (Num num)  {
	return this.val == num.val;
    }

    @Override
    public int compareTo (Num o)  {
	return (this.val - o.val);
    }
    
}

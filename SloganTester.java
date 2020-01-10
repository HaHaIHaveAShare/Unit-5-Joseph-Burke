public class SloganTester  {
    public static void main (String [] args)  {
	Slogan geico = new Slogan ("Save 15% or more on car insurance");
	System.out.println(geico + "\n" + Slogan.getInstances());
	Slogan progressive = new Slogan ("Think easier. Think progressive.");
	System.out.println(progressive + "\n" + Slogan.getInstances());
	Slogan farmers = new Slogan ("We are farmers. Bum badda bum bum bum ba bum.");
	System.out.println(farmers + "\n" + Slogan.getInstances());
	Slogan foxNews = new Slogan ("Most watched, most trusted.");
	System.out.println(foxNews + "\n" + Slogan.getInstances());
    }
}

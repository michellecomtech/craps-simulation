
public class CrookedDie2 extends Die // subclassing
{
	public CrookedDie2()
	{
		CrapsGame.println("  CrookedDie2's constructor called.");
	}

	public void roll() // can you see what this computes?
	{
		// call the inherited method to get lastRoll from parent Die parts

		int testRoll = this.getLastRoll(); // in Die.java 

		if (testRoll == 6)
			this.setLastRoll(1);
		else
			this.setLastRoll(testRoll + 1);
	}

	public String toString()
	{
		return "A CrookedDie2 rolling 1,2,3,4,5,6 in sequence, and... ";
	}

}

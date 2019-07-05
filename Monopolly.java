public class Hiaf {
	
	public static void main (String[] args)
	{
		
		System.out.println(monopolyRoll());
		

		
	}
	public static int diceRoll (int sides) {
		Random lo = new Random();
		int a = lo.nextInt(sides)+1;
		return a;
		
		
	}
	public static int monopolyRoll() {
		int roll1 = diceRoll(6);
		int roll2 = diceRoll(6); 
		int total = roll1 + roll2; 
		if (roll1 == roll2) {
			int roll3 = diceRoll(6);
			int roll4 = diceRoll(6);
			total = total + roll3 + roll4;
			} 
		return total;

		
	}
	
}

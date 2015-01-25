/*
 * Designed by: James Ruiz
 * Solved by: Chavez Ruiz
 * @Date: January 24, 2015
 */


class CallingMethods
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//TODO: Print List of Brothers to screen
		//TODO: Print List of Sisters to screen
		//TODO: Print List of Parents to screen
		//TODO: Print List of Family to screen
		
		//hint: The methods already do the work for you, all you need to do is call them.
		//hint: If you forgot how to "call" methods, you can see how the giveMeListOfFamily() method calls methods.
		//hint: Notice that while none of the List methods use System.out.println(), they do return a String
		//hint: If you had a type String variable, how would you use it to print to the screen?
		//hint: When you call a method, you can already pretend it has given you the type of variable you intend to use.
		//hint: For example, if a method returns an integer, you can assign it to another integer or print it to the screen.
		
		
		//TODO: Call the "IncreaseByFifty" method. You can only call it when you give it an integer.
		
		//hint: Notice the return type for IncreaseByFifty method is "void". This means it doesn't give us back anything.
		//hint: In this sceanrio, we don't require anything back, because System.out.println() is being called within the method.
	}
	
	public static String giveMeListOfBrothers(){
		return ("Andrew, Mikey, and Chavez");
	}
	
	public static String giveMeListOfSisters(){
		return("Marie and Adrianna");
	}
	
	public static String giveMeListOfParents(){
		return("Toni and Mike");
	}
	
	public static String giveMeListOfFamily(){
		String brothers = "My brothers are "+CallingMethods.giveMeListOfBrothers();
		String sisters = "My sisters are "+CallingMethods.giveMeListOfSisters();
		String parents = "My parents are "+CallingMethods.giveMeListOfParents();
		
		String family = brothers+"\n"+sisters+"\n"+parents;
		
		return family;
		
		
	}
	/*
	 * This method takes in an integer, prints it to the console. 
	 * Then it increments it by one for fifty times while printing to the screen.
	 * 
	 * @param startingNumber An integer that you intend to be where the loop starts counting.
	 * @return Doesn't return anything. Instead we just print to the console for every iteration.
	 */
	public static void increaseByFifty(int startingNumber){
		System.out.println("Starting at "+startingNumber+" let's increase it by 50\n");
		for(int i=0; i<50;i++)
			System.out.println(++startingNumber);
	}
	
}
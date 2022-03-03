import java.util.InputMismatchException;
import java.util.Scanner;



public class CoinFlip {
	
	public static void main(String[] args) {
		//User guesses heads or tails
		System.out.print("Guess which will have more: heads or tails? ");
		
		Scanner scnr = new Scanner(System.in);
		String headsOrTailsGuess = scnr.next();
	    
		while (true) {
			
			if (headsOrTailsGuess.equalsIgnoreCase("heads")) {
	    	break;
	      } else if (headsOrTailsGuess.equalsIgnoreCase("tails")) {
	    	break;
	      } else {
	        System.out.println("Please guess heads or tails only ");
	        main(args);
	      }
	    }
	    
	   //User enters number of times to flip coin 
	   System.out.print("How many times shall we flip a coin? (integers only) ");
	   
	   Scanner input = new Scanner(System.in);

	   while (true) {
		   try 
		   {
			   int numberOfFlips = input.nextInt();
			    if (numberOfFlips >= 1) {
			    	System.out.println();
			    	int tailCounter = 0;
			    	int headCounter = 0;
			    	for (int i = 1; i <= numberOfFlips; i++ ) {
			 		   if (Math.random() < 0.5) {
			 			   System.out.println("Heads");
			 			  headCounter++;
			 		   }else {                   
			 			   System.out.println("Tails");
			 			  tailCounter++;
			 		   }
			 	   };
			 	  System.out.println();
			 	  if (headsOrTailsGuess.equalsIgnoreCase("heads")) {
		 		   		System.out.println("Your guess, heads, came up " + headCounter + " time(s)");
		 		   		
		 		   		int headPercentage = (headCounter * 100 + (numberOfFlips >> 1)) / numberOfFlips;
		 		   		System.out.println("That's " + headPercentage + "%.");
		 		   		}
		 		   		else if (headsOrTailsGuess.equalsIgnoreCase("tails")) {
		 		   		System.out.println("Your guess, tails, came up " + tailCounter + " time(s)");	
		 		   		
		 		   		int tailPercentage = (tailCounter * 100 + (numberOfFlips >> 1)) / numberOfFlips;
		 		   		System.out.println("That's " + tailPercentage + "%.");
		 		   	
		 		   		}
			 	  System.out.println();
			      } else {
			    	  System.out.print("Please enter a positive integer ");
				        continue;
			      }
		   }
		   catch (InputMismatchException e)
		    {
		        input.next();
		        System.out.print("That’s not an integer! Try again. ");
		    } 
	    }
	}
}


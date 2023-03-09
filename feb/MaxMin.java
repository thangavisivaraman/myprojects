package feb;

public class MaxMin {
	

		  public static void main(String[] args) {
		    int[] numbers = {5, 2, 9};

		    int min = numbers[0];
		    int max = numbers[0];

		    for (int i = 0; i < numbers.length; i++) {
		      if (numbers[i] < min) {
		        min = numbers[i];
		      }

		      if (numbers[i] > max) {
		        max = numbers[i];
		      }
		    }

		    System.out.println("Minimum number: " + min);
		    System.out.println("Maximum number: " + max);
		  }

		}


		        
		        
		        
		    







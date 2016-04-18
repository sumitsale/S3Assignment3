import java.util.Scanner;

class S3Assignment3
{
   public static void main(String args[])
   {
	   S3Assignment3 obj = new S3Assignment3();
	   obj.generateRandomno(obj.takeInput());
   }
	
	 public int takeInput() {
		
		int number;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a number");
		number = in.nextInt();
		
		return number;
	   }
		
	 public void generateRandomno(int number) {
			int min = 0;

			System.out.println("Random no is  - " + (min + (int)(Math.random() * ((number - min)))));
						
		}
}


import java.util.Scanner;

public class TestMain {
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		StringManipulator m = new StringManipulator();
		boolean contPlay = true;
				
		while (contPlay)
		{
			System.out.println("Which method? (reverse or noVowels): ");
			if (s.nextLine().equals("reverse"))
			{
				
			}
			else if (s.nextLine().equals("noVowels"))
			{
				
			}
			else
			{
				System.out.println("Not a valid method");
			}
			
		}
	}

}

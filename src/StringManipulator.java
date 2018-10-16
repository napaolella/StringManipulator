
public class StringManipulator {
	
	public String noVowels(String str)
	{
		String temp = "";
		char c;
		
		for (int i = 0; i < str.length(); i++)
		{
			c = str.charAt(i);
			if (c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'O' || c == 'o' || c == 'I' || c == 'i' || c == 'U' || c == 'u')
				temp += '*';
			else
				temp += c;
		}
		
		return temp;
	}
	
	public String reverse(String str)
	{
		String temp = "";
		
		for (int i = str.length(); i > 0; i--)
		{
			temp += str.charAt(i-1);
		}
		
		return temp;
	}

}

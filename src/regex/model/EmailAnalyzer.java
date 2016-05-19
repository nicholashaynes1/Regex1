package regex.model;

public class EmailAnalyzer
{
	public boolean checkEmail(String email)
	{
		if(email.contains("@")&& email.contains(".com"))
		{
			if(email.length() > 2)
			{
				
				System.out.println("good");
			}
			else
			{
				System.out.println("wrong");
			}
			
		}
		else
		{
			System.out.println("wrong");
		}
		
		
		return false;
		
	}
}

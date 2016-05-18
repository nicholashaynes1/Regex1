package regex.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RegexAnalyzer
{
	public RegexAnalyzer()
	{
		
	}
	
	public boolean stringAnalyzer(String wordSplit)
	{
		String [] splitArray;
		Scanner wordFile;
		int wordCount = 0;
		try
		{
			wordFile = new Scanner(new File("specialCharecters.txt"));
			while (wordFile.hasNext())
			{
				wordCount++;
				wordFile.next();
			}
			wordFile.close();
			wordFile = new Scanner(new File("specialCharecters.txt"));
			splitArray = new String[wordCount];
			wordCount = 0;
			while (wordFile.hasNext())
			{
				splitArray[wordCount] = wordFile.next();
				wordCount++;
			}
			
			for(int index = 0; index < splitArray.length; index++)
			{
				if(wordSplit.split(splitArray[wordCount]).length > 1)
				{
					return false;
					
				}
			}
			
		}
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return true;
	}

}

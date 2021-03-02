//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Kim

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.System.*;

public class Words
{
	private ArrayList<String> allWords;
  private static String vowels = "AEIOUaeiou";

	public Words(String[] wordList)
	{
    allWords = new ArrayList<String>();
    Collections.addAll(allWords,wordList);
	}

	public int countWordsWithXChars(int size)
	{
		int count=0;
    for(int i = 0; i<allWords.size(); i++)
    {
      String currentWord=allWords.get(i);
      if(currentWord.length()==size)
      {
        count++;
      }
    }
		return count;
	}
	
	//this method will remove all words with a specified size / length
  public int removeWordsWithXChars(int size)
  {
    int countRemoved=0;
    for(int i = 0; i<allWords.size(); i++)
    {
      String currentWord = allWords.get(i);
      if(currentWord.length() == size)
      {
        allWords.remove(i);
        countRemoved++;
      }
    }
    return countRemoved;
  }

	//this method will also return the sum of the vowels in all words removed
	public int countWordsWithXVowels(int numVowels)
	{
		int count=0;

    for(int o = 0; o<allWords.size(); o++)
    {
      String currentWord = allWords.get(o);
      ArrayList<String> letterList = new ArrayList<String>();
      ArrayList<String> vowelList = new ArrayList<String>();
      int vowelCount=0;

      for(int i=0; i<vowels.length()-1; i++)
      {
        vowelList.add( vowels.substring(i,(i+1))   );
      }

      for(int n=0; n<currentWord.length(); n++)
      {
        String currentLetter = currentWord.substring(n,(n+1));
        for(int a=0; a<vowelList.size()-1; a++)
        {
          if(currentLetter.equals(vowelList.get(a)))
            vowelCount++;
          else
            vowelCount +=0;
        }
      }

      int currentNumVowels = vowelCount;
      if(currentNumVowels == numVowels)
      {
        count++;
      }
    }
		return count;
	}
	
	//add in a toString
  public String toString()
  {
    return allWords.toString();
  }
  
}
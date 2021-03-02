//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Kim

import static java.lang.System.*;
import java.util.ArrayList;

public class Word
{
   private static String vowels = "AEIOUaeiou";   	//why is this here?
   																//why is it static?
   
   //add an instance variable
  private String beginString;
	//create a 2 constructors
  public Word()
  {
    beginString="";
  }

  public Word(String initString)
  {
    beginString = initString;
  }
	
  //setter method
  public void setWord(String s)
    {
      beginString = s;
    }
    
  //getter method
  public String getWord()
  {
    return beginString;
  }

  //getNumVowels
  public int getNumVowels()
  {
    ArrayList<String> letterList = new ArrayList<String>();
    ArrayList<String> vowelList = new ArrayList<String>();
    int vowelCount=0;

    for(int i=0; i<vowels.length()-1; i++)
    {
      vowelList.add( vowels.substring(i,(i+1))   );
    }

    for(int n=0; n<beginString.length(); n++)
    {
      String currentLetter = beginString.substring(n,(n+1));
      for(int a=0; a<vowelList.size()-1; a++)
      {
        if(currentLetter.equals(vowelList.get(a)))
          vowelCount++;
        else
          vowelCount +=0;
      }
    }

    return vowelCount;
  }

  //getLength

  public int getLength()
  {
    int lengthOfBeginString = 0;
    lengthOfBeginString = beginString.length();
    return lengthOfBeginString;
  }
	//create a toString method (Private Instance Variables)
  public String toString()
  {
    return beginString;
  }
  
}
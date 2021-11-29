package package1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseWords {

	private String reverseWords(String s) {
		String s1 = "";
		String sarr[] = s.split(" ");
		for(int i=sarr.length-1;i>=0;i--)
		{
			s1 = s1 + sarr[i] + " ";
		}
		s1 = s1.trim();
		return s1;
	}
	
	@Test
	public void testCase1()
	{
		Assert.assertEquals(reverseWords("I am a confident woman"), "woman confident a am I");
	}

}

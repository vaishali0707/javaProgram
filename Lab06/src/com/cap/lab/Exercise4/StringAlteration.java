package com.cap.lab.Exercise4;
import java.util.*;
public class StringAlteration
{
		static boolean isVowel(char s)
		{
			if(s!='a'&& s!='e'&&s!='i'&&s!='o'&&s!='u'&&s!='A'&& s!='E'&&s!='I'&&s!='O'&&s!='U')
			{
				return false;
			}
			return true;
		}
		static String replaceConsonants(char[] ch)
		{
			for(int i=0;i<ch.length;i++)
			{
				if(!isVowel(ch[i]))
				{
					if(ch[i]=='z')
					{
						ch[i]='b';
					}
					if(ch[i]=='Z')
					{
						ch[i]='B';
					}
					else
					{
						ch[i]=(char)(ch[i]+1);
						if(isVowel(ch[i]))
						{
							ch[i]=(char)(ch[i]+1);
						}
					}
				}
			}
			return String.copyValueOf(ch);
		}
		public static void main(String args[])
		{
			String v="Demon";
			System.out.println(replaceConsonants(v.toCharArray()));
		}

	

}

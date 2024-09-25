package github;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Stringwordcount {
	public static void main(String[]args) {
		String s="Welcome to Java Session Java Session";
		String uniqueChar="";
		char[] cs=s.toCharArray();
		Map<Character,Integer>mp=new LinkedHashMap<>();
		for(char c:cs) {
			if(mp.containsKey(c)) {
				Integer x=mp.get(c);
				mp.put(c, x+1);
			}
			else {
				mp.put(c, 1);
			}
		}
		Set<Character>keySet=mp.keySet();
		for(Character x:keySet) {
		uniqueChar=uniqueChar+x;
		}
	
	System.out.println(uniqueChar);
}}

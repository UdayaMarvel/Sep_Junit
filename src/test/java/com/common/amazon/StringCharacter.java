package com.common.amazon;

import java.util.HashMap;
import java.util.Map;

public class StringCharacter {
	
	public static void main(String[] args) {
		String s= "Welcome to Java Program Java Program";
				Map<String, Integer> mp = new HashMap<>();
				String[] cs = s.split(" ");
				for(String c :cs ) {
					if (mp.containsKey(c)) {
						Integer x = mp.get(c);
						mp.put(c, x+1);
					}else {
						mp.put(c, 1);
					}
				 }
			System.out.println(mp);
	}

}

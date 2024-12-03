package com.basic;

import java.util.Map;
import java.util.TreeMap;

public class WordCount {
	public static void main(String[] args) {
		String s="muthura Vinoth Vinoth";
		String[]s1=s.split(" ");
	Map<String,Integer> m=new TreeMap<>();
	for(String s2:s1) {
		if(m.containsKey(s2)) {
			Integer x=m.get(s2);
			m.put(s2, x+1);
		}
		else {
			m.put(s2, 1);
		}
		
	}
	}

}

package org.zaolian.dict;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This is the class that implements searching methods.
 * @author Tian
 * July 2012
 */

public class Searcher {
	
	private String word;
	private String line;
	
	/**
	 * Constructor for Searcher
	 * @param aWord the word need to be search
	 */
	public Searcher(String aWord) {
		word = aWord;
	}

	/**
	 * Search the result of inputed word
	 * @return the line contains result
	 * @throws IOException
	 */
	public String search() throws IOException {
		Pattern pattern = Pattern.compile(word);
		Matcher matcher = pattern.matcher("");
		
		File origin = new File("origin.txt");
		FileReader fr = null;
		fr = new FileReader(origin);
		BufferedReader br = new BufferedReader(fr);
		while ((line = br.readLine()) != null) {
			matcher.reset(line);
			if (matcher.find()) return line;
		}
		br.close();
		fr.close();
		return "对不起没找到任何结果";
	}
	
}

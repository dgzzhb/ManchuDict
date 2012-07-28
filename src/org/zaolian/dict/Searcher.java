package org.zaolian.dict;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Searcher {
	
	private String word;
	private String line;

	public Searcher(String aWord) {
		word = aWord;
	}

	public String search() throws IOException {
		File origin = new File("origin.txt");
		FileReader fr = null;
		fr = new FileReader(origin);
		BufferedReader br = new BufferedReader(fr);
		line = br.readLine();
		while (line != null) {
			line = br.readLine();
			int result = line.indexOf(word);
			if (result >= 0) return line;
			else return "Not Found!";
		}
		br.close();
		fr.close();
		return line;
	}
	
}

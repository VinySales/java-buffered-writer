package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		String[] list = new String[] {"Vinicius", "Sales", "Rebouças"};
		String path = "c:\\temp\\in.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for (String string : list) {
				bw.write(string);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

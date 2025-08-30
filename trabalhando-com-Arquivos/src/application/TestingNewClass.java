package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestingNewClass {

	public static void main(String[] args) {

		String path = "C:\\Users\\User\\Documents\\file.txt";
		FileReader fr = null;
		BufferedReader br = null;

		try {
			File file = new File(path);
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				System.out.println("Error closing resources: " + e.getMessage());
			}
			System.out.println("File reading completed.");
		}
	}

}

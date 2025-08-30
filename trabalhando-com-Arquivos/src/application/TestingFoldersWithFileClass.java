package application;

import java.io.File;
import java.util.Scanner;

public class TestingFoldersWithFileClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a file path:");
		String strPath = sc.nextLine();

		File path = new File(strPath);

		File[] folders = path.listFiles(File::isDirectory);
		if (folders != null) {
			System.out.println("FOLDERS:");
			for (File folder : folders) {
				System.out.println(folder);
			}
		} else {
			System.out.println("No folders found or the path is not a directory.");
		}

		System.out.println();
		File[] files = path.listFiles(File::isFile);
		if (files != null) {
			System.out.println("FILES:");
			for (File file : files) {
				System.out.println(file);
			}
		} else {
			System.out.println("No files found or the path is not a directory.");
		}

		sc.close();
	}

}

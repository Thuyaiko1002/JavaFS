package com.vn.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
	private static final String FILE_PATH = "D:\\eclipse-workspace\\Data\\IN.txt";
	private static final String FOLDER_PATH = "D:\\eclipse-workspace\\Data";
	private static final String CREAT_FODER = "D:\\eclipse-workspace\\Data\\MAKEDIR";

	public static void main(String args[]) throws IOException {
		FindTxt(FOLDER_PATH);
		ReadFile(FILE_PATH);
		MakeDir(CREAT_FODER);
	}

	private static void FindTxt(String folderPath) {
		File dir = new File(folderPath);
		File[] txtFiles = dir.listFiles(new TxtFileFilter());

		for (File txtFile : txtFiles) {
			System.out.println(txtFile.getAbsolutePath());
		}
	}

	private static void ReadFile(String inputFile) throws IOException {
		FileInputStream fin = null;
		try {
			fin = new FileInputStream(inputFile);
			int i = 0;
			while ((i = fin.read()) != -1) {
				System.out.print((char) i);
			}
			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			fin.close();
		}
	}

	private static void MakeDir(String creatFoder) {
		File dir1 = new File(creatFoder);
		boolean created = dir1.mkdirs();
		System.out.println("\nDirectory created? " + created);
	}
}
package archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Archivo1 {

	public static List<Integer> l = new ArrayList<Integer>();

	public static void main(String[] args) {
		l = getList();
		for (Integer i : l) {
			System.out.println(i);
		}
		clearFile();
		writeContentToFile();
	}

	public static List<Integer> getList() {
		List<Integer> list = new ArrayList<Integer>();
		File file = new File("res/file.txt");
		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new FileReader(file));
			String text = null;

			while ((text = reader.readLine()) != null) {
				list.add(Integer.parseInt(text));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
			}
		}
		return list;
	}

	public static void writeContentToFile() {
		FileWriter f = null;
		try {
			f = new FileWriter("res/file.txt");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		BufferedWriter writer = null;
		writer = new BufferedWriter(f);
		
		for (Integer i : Archivo1.l) {
			try {
				writer.write(i.toString() + "\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void clearFile() {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter("res/file.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pw.close();
	}
}

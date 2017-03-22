package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Archivo1 {

	public static void main(String[] args) {
		List<Integer> l = getList();
		for (Integer i : l) {
			System.out.println(i);
		}
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
}

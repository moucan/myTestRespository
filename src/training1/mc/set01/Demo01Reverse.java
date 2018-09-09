package training1.mc.set01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Demo01Reverse {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("order.txt"));
		ArrayList<String> list = new ArrayList<>();
		String line;
		while ((line = br.readLine()) != null) {
			list.add(line);
		}
		br.close();
		BufferedWriter bw = new BufferedWriter(new FileWriter("reverse.txt"));
		for (int i = list.size() - 1; i >= 0; i--) {
			bw.write(list.get(i));
			bw.newLine();
		}
		bw.close();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}

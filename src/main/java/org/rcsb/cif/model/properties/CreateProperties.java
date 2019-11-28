package org.rcsb.cif.model.properties;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateProperties {
	
	public static void main(String[] args) {
        try {
    		InputStream inputStream = new CreateProperties().getClass().getResourceAsStream("all.txt");
            Objects.requireNonNull(inputStream, "could not load all.txt");
            BufferedReader lookupReader = new BufferedReader(new InputStreamReader(inputStream));
            List<String[]> lines = lookupReader.lines().map(line -> line.split("\t")).collect(Collectors.toList());	
			lookupReader.close();
			String lastPrimary = null;
			File f = null;
			FileOutputStream out = null;
			StringBuffer sb = null;
			for (int i = 1, n = lines.size(); i < n; i++) {
				String[] prop = (i == n ? new String[] {"",""} : lines.get(i));
				if (prop.length == 0)
					break;
				String primary = prop[0];
				String property = prop[1];
				if (!primary.equals(lastPrimary)) {
					lastPrimary = primary;
					if (f != null) {
						out = new FileOutputStream(f);
						out.write(sb.toString().getBytes());
						out.close();
						System.out.println("created " + f);
					}
					if (primary.length() == 0)
						break;
					f = new File("c:/temp/properties/" + primary + ".properties");
					sb = new StringBuffer();						
				}
				sb.append(property).append("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

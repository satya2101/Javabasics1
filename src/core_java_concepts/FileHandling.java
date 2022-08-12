package core_java_concepts;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws Exception {
		FileReader f =new FileReader(System.getProperty("user.dir")+"\\temp.txt");
	//	String lc= System.getProperty(""\\temp.txt"));
		BufferedReader oBfr= new BufferedReader(f);
		//String line=oBfr.readLine();
		String line;
		while((line=oBfr.readLine())!=null){
			System.out.print(line);
		}
		//System.out.println(f);
	}

}

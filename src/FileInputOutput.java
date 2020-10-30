import java.io.*;
import java.util.Scanner;

public class FileInputOutput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//write();
		//read();
		String str1 = "ABC";
		String str2 = "Canada";
		
		str1 = "China";
		
		if(str1 == str2) {
			System.out.println("both are equal");
		}
		else
			System.out.println("not equal");
		
		Character ch1 = new Character('a');
		Character ch2 = 'z';
		System.out.println(Character.toUpperCase(ch2));
	}
	
	/**
	 * read a file
	 * @throws IOException 
	 * @throws IOException
	 */
	public static void read() throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter file name");
		String fileName = input.nextLine();
		
		File file = new File(fileName);
		Scanner rFile = new Scanner(file);
		String name; 
		while(rFile.hasNext()) { 
			name = rFile.nextLine();
			System.out.println(name);
			//Student student1 = new Student(name);
		}
		
		rFile.close();
		
	}
	
	/**
	 * Writing to a file
	 * @throws IOException
	 */
	public static void write() throws IOException {
		FileWriter fw = new FileWriter("StudentList.txt",true); //to write to the existing file
		PrintWriter pw = new PrintWriter(fw);
		pw.println("ABC 1");
		pw.println("Tom 1");
		pw.println("Jerry 1");
		pw.println("Thomas 1");
		pw.println("Sarah J. 1");
		
		pw.close();
		System.out.println("Writing is done");
	}
	
	public static void write2() throws IOException  {
		FileWriter fw = new FileWriter("Testing.txt",true);
		PrintWriter pw = new PrintWriter(fw);
		pw.println("This");
		pw.println("is");
		pw.println("a");
		pw.println("Test");
		pw.println("File");
		
		pw.close();
		System.out.println("Writing is done!!");
	}

}

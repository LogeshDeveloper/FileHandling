package New;

import java.io.*;

public class Implentation {

	public static void main(String[] args) {
	File file = new File("E:\1.txt");
	try{
		boolean createnewfile= file.createNewFile();
		System.out.println("File Created at "+file);
	}catch(IOException e){
		System.out.println("ERROR!!!");
		e.printStackTrace();
		                                                                                                                                                                                                                                                
	}
	}

}

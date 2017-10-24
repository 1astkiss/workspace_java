package com.fileex;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

public class FileEx01 {

	public static void main(String[] args) throws Exception {

		File f1 = new File("c:\\windows\\system.ini");
		File f2 = new File("C:\\CodeLab\\workspace_java");
		File f3 = new File("c:\\CodeLab");
		File f4 = new File(new URI("file:///c://CodeLab//FirstJava.java"));
		
		String res;
		
		if(f1.isFile()) {
			res = "file";
		}else {
			res = "directory";
		}
		
		System.out.println(f1.getPath() + "는" + res + "입니다.");
		
		if(!f2.exists()) {
			if(!f2.mkdir()) {
				System.out.println("directory creation failed...");
			}
		}else {
			System.out.println("directory alrady exists...");
			
		}
		
		if(f2.isFile()) {
			res = "file";
		}else {
			res = "directory";
		}
		
		System.out.println(f2.getPath() + "는" + res + "입니다.");
		
//		dir(f2);
		
		System.out.println(f4.getPath());
	}
	
	public static void dir(File fd) {
		
		String[] filenames = fd.list();
		
		for(String s : filenames) {
			File f = new File(fd, s);
			long t = f.lastModified();
			System.out.print(s);
			System.out.print("\t\t file size : " + f.length());
			System.out.printf("\t modified at : %tb %td %ta %tT\n", t,t,t,t);
			
		}
	}

}

package org.lti.junitApp;

import java.io.FileInputStream;
import java.io.IOException;

public class MyProj {

	public String solution(FileInputStream fst) {
		String text="";
		int ch;
		try {
			while((ch=fst.read())!=-1) {
				text=text+(char)ch;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(text);
		return text;
	
	}

	public int solution(String string) {
		// TODO Auto-generated method stub
		return 0;
	}
	



}

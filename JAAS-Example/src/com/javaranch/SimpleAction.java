package com.javaranch;

import java.io.File;
import java.security.PrivilegedAction;

public class SimpleAction implements PrivilegedAction{

	@Override
	public Object run() {
		// TODO Auto-generated method stub
		File f = new File("foo.txt");
		System.out.print("\nfoo.txt does ");
		if (!f.exists())
		    System.out.print("not ");
		System.out.println("exist in the current working directory.");
		return null;
	}

}

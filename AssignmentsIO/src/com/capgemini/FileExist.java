package com.capgemini;

import java.io.File;

public class FileExist {
	private String path;

	public FileExist(String path) {
		super();
		this.path = path;
	}

	public boolean isFileExists(FileExist object) {
		if (object.path == path)
			return true;
		else
			return false;
	}

}

package com.study;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

//获取一个目录下的所有文件，包含子目录下面的所有文件
//返回dir目录下的子文件名，rec是否递归获取

public class Getfiles {
	private String dir;
	
	public Getfiles() {
		
	}

	private List<String> list = new ArrayList<String>();
	
	public List<String> listFiles(String dir, boolean rec){
		File path = new File(dir);
		File[] names = path.listFiles();
		for(File f : names) {
			if(f.isDirectory() && rec == true) {
				listFiles(f.getAbsolutePath(),true);
			}else {
				list.add(f.getAbsolutePath());
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		Getfiles file = new Getfiles();
		System.out.println(file.listFiles("D:\\eclipse\\workspace\\Dkz\\src\\main\\java", true));
	}
}


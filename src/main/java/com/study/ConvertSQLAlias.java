package com.study;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author 1
 *
 */
public class ConvertSQLAlias {

	private String sql = null;
	private String names = null;

	/**
	 * @param sql
	 * @param names
	 * @return
	 */
	public static String convertSql(String sql, Map<String, String> names) {
		return null;
	}

	/**
	 * @param sql    正则表达式 ：rpt1_[A-Z]{1,2}2
	 * @param names "rpt1_B2:企业名称;rpt1_C2:统一社会信用代码"
	 * @return
	 */
	public static String convertSql(String sql, String names) {
		ConvertSQLAlias conSql = new ConvertSQLAlias(sql, names);
		return conSql.convert();
	}

	private Map<String, String> namesMap = new HashMap<String, String>();
	
	public ConvertSQLAlias(String sql, String names) {
		this.sql = sql;
		this.names = names;
	}
		
	private String init() {
		names = names.replaceAll("\r|\n", "");
		String[] text = names.split(";");         //以分号来分割原始字符串，得到每一对数据
		String[] name1 = new String[text.length];   //存放字母元素的数组
		String[] name2 = new String[text.length];   //存放汉字元素的数组
		for(int i = 0;i<text.length;i++) {
			String[] str = text[i].split(":");
			name1[i] = str[0];
			name2[i] = str[1];                      //遍历text数组并分割每一组元素，分割后的字母元素赋给name1
			namesMap.put(name1[i], name2[i]);
		}
		//正则表达式
		Pattern p = Pattern.compile("rpt1_([A-Z]{1,2})2");
		Matcher m = p.matcher(sql);
		StringBuffer sb = new StringBuffer();
		while(m.find()) {
			String replace = getCaption(m.group());
			if(replace != null) {
				m.appendReplacement(sb, replace);
			}
			else {
				//输出异常信息
				System.out.println("异常");
			}
				
		}
		m.appendTail(sb);
		return sb.toString();
	}
	
	public String convert() {
		return init();
	}

	private String getCaption(String name) {
		return namesMap.get(name);
	}

	
	public static String getTestFileText(File srcFile) throws Exception{
		InputStreamReader isr = new InputStreamReader(new FileInputStream(srcFile));
		char[] c = new char[1024];
		int len = 0;
		String str = new String();
		try{
			while((len = isr.read(c)) != -1) {
				str = new String(c,0,len);
			}
			return str;
		}finally {
			isr.close();
		}
	}
	
	public static String getTestFileText(InputStream in) {
		return null;
	}

	public static String getTestFileText(String fileName) throws Exception {
		File f = new File(fileName);
		return getTestFileText(f);
	}
	public static void writeTestFileText(String newFile,String filePath) throws Exception {
		File f = new File(filePath);
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(f));
		try {
			osw.write(newFile);
		}finally {
			osw.close();
		}
	}
	
	public static void main(String[] args) throws Exception {
		String sql1 = getTestFileText("D:\\eclipse\\workspace\\Dkz\\src\\main\\java\\com\\study\\Change name.txt");
		String names = getTestFileText("D:\\eclipse\\workspace\\Dkz\\src\\main\\java\\com\\study\\names.txt");
		String resultSql = convertSql(sql1, names);
		writeTestFileText(resultSql,"D:\\eclipse\\workspace\\Dkz\\src\\main\\java\\com\\study\\newFile.txt");
	}
	
}		


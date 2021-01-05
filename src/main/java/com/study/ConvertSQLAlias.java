package com.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author 1
 *
 */
public class ConvertSQLAlias {
	
	private String sql;
	private String names;
	
	/**
	 * @param sql
	 * @param names
	 * @return
	 */
	public static String convertSql(String sql, Map<String, String> names) {
		return null;
	}
	
	/**
	 * @param sql
	 * @param names  "b2:企业名称;b3:统一社会信用代码"
	 * @return
	 */
	public static String convertSql(String sql, String names) {
		ConvertSQLAlias conSql = new ConvertSQLAlias(sql,names);
		return conSql.convert();
	}
	
	
	
	
	public ConvertSQLAlias(String sql, String names) {
		this.sql = sql;
		this.names = names;
	}
	
	public String convert() {
		
		return null;
	}
	
	private String getCaption(String name) {
		return null;
	}
	
	public static String getCaption1(String aliasName) {
		Pattern p = Pattern.compile("rpt1_(B|C|D|E|F|G|H|I|J|K|L)2");
		Matcher m = p.matcher(aliasName);
		StringBuffer sb = new StringBuffer();
		while(m.find()) {
			if(m.group().equals("rpt1_B2")) {
				m.appendReplacement(sb, "企业名称");
			}else if(m.group().equals("rpt1_C2")) {
				m.appendReplacement(sb, "企业地址");
			}else if(m.group().equals("rpt1_D2")) {
				m.appendReplacement(sb, "企业规模");
			}else if(m.group().equals("rpt1_E2")) {
				m.appendReplacement(sb, "企业成立时间");
			}else if(m.group().equals("rpt1_F2")) {
				m.appendReplacement(sb, "企业人数");
			}else if(m.group().equals("rpt1_G2")) {
				m.appendReplacement(sb, "上班时间");
			}else if(m.group().equals("rpt1_H2")) {
				m.appendReplacement(sb, "薪资水平");
			}else if(m.group().equals("rpt1_I2")) {
				m.appendReplacement(sb, "周围环境");
			}else if(m.group().equals("rpt1_J2")) {
				m.appendReplacement(sb, "企业类型");
			}else if(m.group().equals("rpt1_K2")) {
				m.appendReplacement(sb, "发展情况");
			}else if(m.group().equals("rpt1_L2")) {
				m.appendReplacement(sb, "方便与否");
			}
		}
		m.appendTail(sb);
		return sb.toString();
	}

	public static void main(String[] args) {
		File file1 = new File("D:\\eclipse\\workspace\\Dkz\\src\\main\\java\\com\\study\\Change name.txt");
		File file2 = new File("D:\\eclipse\\workspace\\Dkz\\src\\main\\java\\com\\study\\Change name2.txt");
			try {
				BufferedReader br = new BufferedReader(new FileReader(file1));
				BufferedWriter bw = new BufferedWriter(new FileWriter(file2));
				String data = null;
				String dataafter = null;
				while((data = br.readLine())!= null) {
					dataafter = getCaption(data);
					bw.write(dataafter);
					bw.newLine();
				}
				br.close();
				bw.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}

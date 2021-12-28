package com.jpetstore.dao.mysql;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBHelper {

	static String url;
	static Properties info = new Properties();
	
	static {
		InputStream input = DBHelper.class.getClassLoader()
				.getResourceAsStream("com/jpetstore/dao/mysql/config.properties");
		try {
			info.load(input);
			url = info.getProperty("url");
			String driverClassName = info.getProperty("driver");
			Class.forName(driverClassName);
			System.out.println("驱动加载成功.......");
		} catch (ClassNotFoundException e) {
			System.out.println("加载属性文件失败.....");
		} catch (IOException e) {
			System.out.println("加载属性文件失败...");
		}
	}
	public static Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(url,info);
		return conn;
	}
}

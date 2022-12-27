package kh.s8.protein.common.jdbc;

import java.io.*;
import java.sql.*;
import java.util.Properties;

public class JdbcTemplate {

	public JdbcTemplate() {
	}

	public static Connection getConnection() {
		Connection con = null;
		Properties prop = new Properties();
		try {
			String currentPath = JdbcTemplate.class.getResource("./").getPath();
			prop.load(new BufferedReader(new FileReader(currentPath + "driver.properties")));
			Class.forName(prop.getProperty("db.driver"));
			con = DriverManager.getConnection(prop.getProperty("db.url"), prop.getProperty("db.user"),
					prop.getProperty("db.pwd"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	public static void close(Connection con) {
		try {
			if (con != null && !con.isClosed()) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close(Statement stmt) {
		try {
			if (stmt != null && !stmt.isClosed()) {
				stmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close(ResultSet rset) {
		try {
			if (rset != null && !rset.isClosed()) {
				rset.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void commit(Connection con) {
		try {
			if (con != null && !con.isClosed()) {
				con.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void rollback(Connection con) {
		try {
			if (con != null && !con.isClosed()) {
				con.rollback();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

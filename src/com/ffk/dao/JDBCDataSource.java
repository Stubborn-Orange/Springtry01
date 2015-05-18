/**   
* @Title: JDBCDataSource.java 
* @Package com.ffk.dao 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2015年5月18日 下午7:37:52 
* @version V1.0   
*/
package com.ffk.dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.sun.org.apache.regexp.internal.recompile;

/** 
 * @ClassName: JDBCDataSource 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author A18ccms a18ccms_gmail_com 
 * @date 2015年5月18日 下午7:37:52 
 *  
 */
public class JDBCDataSource implements Serializable{
	
	private String driver;
	private String url;
	private String user;
	private String pwd;
	/** 
	 * @return driver 
	 */
	public String getDriver() {
		return driver;
	}
	/**
	 * @param driver the driver to set
	 */
	public void setDriver(String driver) {
		try {
			Class.forName(driver);
			this.driver = driver;
		} catch (Exception e) {		
			// TODO: handle exception
			throw new RuntimeException(e);
		}
	}
	/** 
	 * @return url 
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/** 
	 * @return user 
	 */
	public String getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}
	/** 
	 * @return pwd 
	 */
	public String getPwd() {
		return pwd;
	}
	/**
	 * @param pwd the pwd to set
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public Connection getConnection() throws SQLException{
		Connection conn = DriverManager.getConnection(url,user,pwd);
		return conn;
	}
	
	public void close(Connection conn){
		if (conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		}
	}
	

}

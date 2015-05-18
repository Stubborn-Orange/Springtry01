package com.ffk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ffk.entity.User;


import com.sun.org.apache.regexp.internal.recompile;

public class MyUserDao implements UserDao {
	
	private JDBCDataSource dataSource;
	
	/** ���� OracleUserDAO �������������JDBCDataSourceʵ�� */
	public MyUserDao(JDBCDataSource dataSource) {
		// TODO Auto-generated constructor stub
		this.dataSource = dataSource;
	}
	
	/** ����Ψһ�û�����ѯϵͳ�û�, ���û���ҵ��û���Ϣ����null */
	@Override
	public User findByName(String name) {
		// TODO Auto-generated method stub
		System.out.println("����User��Ϣ");
		String sql = "select id, name, pwd, phone  from USERS where name=?";
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			User user = null;
			while (rs.next()) {
				user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setPwd(rs.getString("pwd"));
				user.setPhone(rs.getString("phone"));
			}
			rs.close();
			ps.close();
			return user;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally{
			dataSource.close(conn);
		}
	}

}

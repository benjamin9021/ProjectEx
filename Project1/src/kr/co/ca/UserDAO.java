package kr.co.ca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UserDAO {

	public static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String USER = "ca";
	public static final String PASSWORD = "ca";

	public UserDAO() {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void insert(UserDTO dto) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "insert into cuser values (?, ?, ?)";

		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("connection 생성");

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, dto.getDid());

			pstmt.setString(2, dto.getName());
			pstmt.setInt(3, dto.getAge());

			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public void update(UserDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "update user set name = ?, age = ? where did = ?";

		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("connection 생성");
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setInt(2, dto.getAge());
			pstmt.setString(3, dto.getDid());
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public UserDTO selectByDid(String did) {
		UserDTO dto = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = " select did, name 이름, age 나이 * from cuser where did = ?";
		ResultSet rs = null;

		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, did);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				String name = rs.getString("이름");
				int age = rs.getInt("나이");

				dto = new UserDTO(did, name, age);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dto;
	}

	public ArrayList<UserDTO> select() {

		ArrayList<UserDTO> list = new ArrayList<UserDTO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "select * from cuser";
		ResultSet rs = null;

		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {

				String did = rs.getString("did");
				String name = rs.getString("name");
				int age = rs.getInt("age");

				UserDTO dto = new UserDTO(did, name, age);
				list.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
	}

	public void delete(String did) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "delete from cuser where did = ?";
		ResultSet rs = null;

		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}

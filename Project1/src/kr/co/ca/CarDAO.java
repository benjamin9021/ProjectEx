package kr.co.ca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CarDAO {
	public static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String USER = "ca";
	public static final String PASSWORD = "ca";

	public CarDAO() {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void insert(CarDTO dto) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "insert into cinfo values (?,?,?)";

		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("connection 생성");

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, dto.getDid());
			pstmt.setInt(2, dto.getCnum());
			pstmt.setString(3, dto.getCclr());

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

	public void update(CarDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "update user set name = ?, age = ? where did = ?";

		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("connection 생성");
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getCclr());
			pstmt.setInt(2, dto.getCnum());
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

	public CarDTO selectByDid(String did) {
		CarDTO dto = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = " select did, cclr 색상, cnum 번호 * from cinfo where did = ?";
		ResultSet rs = null;

		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, did);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				String cclr = rs.getString("색상");
				int cnum = rs.getInt("차번호");

				dto = new CarDTO(did, cclr, cnum);
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

	public ArrayList<CarDTO> select() {

		ArrayList<CarDTO> list = new ArrayList<CarDTO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "select * from cinfo";
		ResultSet rs = null;

		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {

				String did = rs.getString("did");
				String cclr = rs.getString("cclr");
				int cnum = rs.getInt("cnum");

				CarDTO dto = new CarDTO(did, cclr, cnum);
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

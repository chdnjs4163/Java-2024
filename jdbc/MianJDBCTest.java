package jdbc;
import java.sql.*;

public class MianJDBCTest {

    public static void main(String[] args) {
        Connection con = JDBCconnector.getConnection();
        String sql = "select 주문고객, 제품명, 수량 from 주문 o, 제품 p " +
                                     "       where o.주문제품= p.제품번호";
        PreparedStatement pstmt = null;
        try {
            pstmt = con.prepareStatement(sql);
            ResultSet result = pstmt.executeQuery();
            while (result.next()) {
                String customerId = result.getString("주문고객");
                String productId = result.getString("제품명");
                int count = result.getInt("수량");
                System.out.printf("- 주문고객명: %s \t- 주문제품ID: %s\t- 수량: %d \n", customerId, productId, count);
            }

        } catch (SQLException e) {
            System.out.println("문장객체 생성에 문제가 발생했습니다.");
        }
        try {
            pstmt.close();
            con.close();
        }catch (SQLException e) {
            System.out.println("연결종료에 문제가 발생했습니다.");
            System.out.println(e);
        }

    }
}
//1.연결성공 - 2.(연결객체)-문장객체(prepareStatement) 가 필요함
//3.문장객체로 SQL문을 실행(문장객체가 필요)
//4. SQL문에 공백이 없다면 SQL 구문이 올바르게 해석되지 않아 오류가 발생
// 공백은 필수적이며, 별칭을 정의할 떄는 항상 테이블 이름과 별칭 사이에 공백을 포함시켜야 한다.
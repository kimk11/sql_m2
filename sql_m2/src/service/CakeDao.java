package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.Close;
import util.DriverConnection;

public class CakeDao {
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	
	//가격이 평균이상인 케이크의 데이터를 조회
	public List<Cake> selectCakeListOverAvg(){
		List<Cake> list = new ArrayList<Cake>();
		
		//cake table의 price컬럼이 평균값 이상인 레코드들을 조회하는 쿼리
		String sql="SELECT name, price FROM cake WHERE price >= (SELECT AVG(price) FROM cake)";
		try {
			//connection정보를 가져오기만 하면 되기 때문에 객체 생성 후 변수에 담지 않고, 바로 메서드를 호출하여 사용
			preparedStatement = new DriverConnection().connectionInfo().prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Cake cake = new Cake();
				cake.setName(resultSet.getString(1));
				cake.setPirce(resultSet.getInt(2));
				list.add(cake);
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			//Close클래스의 메서드를 호출하여 사용한 객체를 종료함.
			//connection은 static변수로 사용되었었음
			new Close().close(DriverConnection.connection, preparedStatement, resultSet);
		}

		return list;
	}
}
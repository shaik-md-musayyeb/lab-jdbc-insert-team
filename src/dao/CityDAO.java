package dao;

//import java.sql.Connection;
//import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.City;
import utility.ConnectionManager;

public class CityDAO{
	final String insert_city = "insert into city values (?,?)";
	public void createCity(City city) throws SQLException, Exception {
		PreparedStatement ps = ConnectionManager.getConnection().prepareStatement(insert_city);
		ps.setLong(1, city.getCityId());
		ps.setString(2, city.getCityName());
		ps.executeUpdate();
	}
	public void getCityByName(String name) throws Exception {

		String cityDetails = "select * from city";
		PreparedStatement ps = ConnectionManager.getConnection().prepareStatement(cityDetails);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			if(name.equals(rs.getString("name")))
				System.out.println("id is "+rs.getInt(1)+" city name is : "+rs.getString(2));
		}
		
//		return null;
		
	}
}

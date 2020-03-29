package dao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Team;
import utility.ConnectionManager;

public class TeamDAO {
	final String insert_team = "insert into team values (?,?,?,?,?)";
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public void createTeam(Team team) throws SQLException, Exception {
		PreparedStatement ps = ConnectionManager.getConnection().prepareStatement(insert_team);
		System.out.println("enter team id");
		int id = Integer.parseInt(br.readLine());
		ps.setInt(1, id);
		ps.setString(2, team.getName());
		ps.setString(3, team.getCoach());
		ps.setLong(4, team.getCityId());
		ps.setInt(5, team.getCaptain());
		int x = ps.executeUpdate();
		System.out.println(x);
	}
}

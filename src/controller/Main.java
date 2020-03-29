package controller;

import java.io.BufferedReader;
//import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import dao.CityDAO;
import dao.TeamDAO;
import model.City;
import model.Team;

public class Main {

	public static void main(String[] args) throws SQLException, Exception {
		// TODO Auto-generated method stub
		CityDAO cityDAO = new CityDAO();
		TeamDAO teamDAO = new TeamDAO();

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		Team team1 = new Team();
		
		
		System.out.println("Enter city id");
		long cityId=Integer.parseInt(br.readLine());
		System.out.println("Enter city name");
		String cityName = br.readLine();
		City city = new City(cityId,cityName);
		city.setCityId(cityId);
		city.setCityName(cityName);
		cityDAO.createCity(city);
//		
		System.out.println("Enter team name");
		String name = br.readLine();
		System.out.println("Enter coach name");
		String coach = br.readLine();
		System.out.println("Enter captain name");
		int captain = Integer.parseInt(br.readLine());

		Team team =  new Team(name,coach,city.getCityId(),captain);
		team.setName(name);
		team.setCoach(coach);
		team.setCityId(city.getCityId());
		team.setCaptain(captain);
		teamDAO.createTeam(team);
		
		
		System.out.println("Enter city name to fetch details from database: ");
		String cityInput = br.readLine();
		cityDAO.getCityByName(cityInput);
		
		

	}

}

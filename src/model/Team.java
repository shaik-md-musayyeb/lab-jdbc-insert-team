package model;


public class Team{
	private String name;
	private String coach;
	private long cityId ;
	private int captain;
	public Team(String name, String coach, long cityId, int captain) {
		super();
		this.name = name;
		this.coach = coach;
		this.cityId = cityId;
		this.captain = captain;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCoach() {
		return coach;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	public long getCityId() {
		return cityId;
	}
	public void setCityId(long cityId) {
		this.cityId = cityId;
	}
	public int getCaptain() {
		return captain;
	}
	public void setCaptain(int captain) {
		this.captain = captain;
	}
	
	
	
}

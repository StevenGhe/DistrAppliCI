package model;

public class Destination {
	private Integer id;
	private String name;
	private String zone;
	private Integer inhabitants;

	public Destination() {
	}
	
	public Destination(int id, String name, String zone, int inhabitants) {
		setId(id);
		setName(name);
		setZone(zone);
		setInhabitants(inhabitants);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public Integer getInhabitants() {
		return inhabitants;
	}

	public void setInhabitants(Integer inhabitants) {
		this.inhabitants = inhabitants;
	}

}

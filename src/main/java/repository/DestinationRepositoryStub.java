package repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import model.Destination;

@Component("repoStub")
public class DestinationRepositoryStub implements DestinationRepository {
	private ArrayList<Destination> list;

	public DestinationRepositoryStub() {
		list = new ArrayList<Destination>();

		list.add(new Destination(1, "Leuven", "Vl-Brabant", 25865132));
		list.add(new Destination(2, "Mechelen", "Antwerpen", 1585452));
		list.add(new Destination(3, "Antwerpen", "Antwerpen", 6857453));
		list.add(new Destination(4, "Brussel", "Brussel Hoofdstedelijk gewest", 5132));
		list.add(new Destination(5, "Gent", "Oost-Vlaanderen", 25832));
		list.add(new Destination(6, "Oostende", "West-Vlaanderen", 13299));

	}

	public Destination findById(Integer id) {
		for (Destination d : list) {
			if (d.getId().equals(id))
				return d;
		}
		return null;
	}

	public Destination findByName(String name) {
		for (Destination d : list) {
			if (d.getName().equals(name))
				return d;
		}
		return null;
	}

	public List<Destination> findAll() {
		return list;
	}

	public void add(Destination destination) {
		list.add(destination);
	}

	public void deleteById(int id) {
		list.remove(findById(id));
	}

	public void update(Destination d) {
		Destination old = findById(d.getId());

		old.setInhabitants(d.getInhabitants());
		old.setName(d.getName());
		old.setZone(d.getZone());
	}

}

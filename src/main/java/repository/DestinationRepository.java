package repository;

import java.util.List;

import model.Destination;

public interface DestinationRepository{

	Destination findById(Integer id);
	
	Destination findByName(String name);

	List<Destination> findAll();

	void add(Destination destination);

	void deleteById(int id);

	void update(Destination d);

}

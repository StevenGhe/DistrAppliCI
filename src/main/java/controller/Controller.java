package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Destination;
import repository.DestinationRepository;

@RestController
@RequestMapping("/destination")
public class Controller {

	private DestinationRepository destRepo;

	public Controller(@Autowired DestinationRepository repoStub) {
		this.destRepo = repoStub;
	}

	@RequestMapping("/all")
	public List<Destination> getAllDestinations() {
		return destRepo.findAll();
	}

	@GetMapping("/{name}")
	public Destination getSingleDestinationByName(@PathVariable("name") String name) {
		return destRepo.findByName(name);
	}

	@GetMapping("/{id}")
	public Destination getSingleDestinationById(@PathVariable("id") String id) {
		return destRepo.findById(Integer.parseInt(id));
	}

	@PostMapping("/add")
	public List<Destination> add(@RequestBody Destination newDest) {
		destRepo.add(newDest);
		return getAllDestinations();
	}

	@PostMapping("/delete/{id}")
	public List<Destination> deleteById(@PathVariable("id") String id) {
		destRepo.deleteById(Integer.parseInt(id));
		return getAllDestinations();
	}

	@PostMapping("/update/{id}")
	public Destination updateById(@RequestBody Destination newDest) {
		destRepo.update(newDest);
		return getSingleDestinationById(newDest.getId() + "");
	}

}

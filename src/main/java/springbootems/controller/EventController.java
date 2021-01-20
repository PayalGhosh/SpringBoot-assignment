package springbootems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import springbootems.db.EventRepository;
import springbootems.model.Event;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "events")
public class EventController {
	
		@Autowired
		private EventRepository eventRepository;
		
		@GetMapping("/get")
		public List<Event> getUsers() {
			return eventRepository.findAll();
		}

		@PostMapping("/add")
			public void addEvent(@RequestBody Event event){
			eventRepository.save(event);
			}
		}

	


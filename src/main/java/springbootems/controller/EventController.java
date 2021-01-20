package springbootems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import springbootems.db.EventRepository;
import springbootems.model.Event;
import springbootems.service.EventService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "events")
public class EventController {
	
		@Autowired
		private EventService eventService;
		
		@GetMapping("/get")
		public List<Event> getAllEvents() {
			return eventService.getAllEvents();
		}

		@PostMapping("/add")
			public void addEvent(@RequestBody Event event){
			eventService.addEvent(event);
			}
		}

	


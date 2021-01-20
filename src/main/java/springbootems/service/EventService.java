package springbootems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springbootems.db.EventRepository;
import springbootems.model.Event;

import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public List<Event> getAllEvents(){
        return eventRepository.findAll();
    }

    public void addEvent(Event event){
        eventRepository.save(event);
    }
}

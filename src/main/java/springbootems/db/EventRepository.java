package springbootems.db;

import org.springframework.data.jpa.repository.JpaRepository;

import springbootems.model.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
}
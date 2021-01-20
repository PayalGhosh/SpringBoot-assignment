package springbootems.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "event")
public class Event {

	    @Id
	    @Column(name = "eventId")
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(name = "eventName")
	    private String name;

        @Temporal(value=TemporalType.DATE)
        @Column(name="startDate")
        @JsonFormat(pattern="yyyy-MM-dd")
        private Date startDate;

        @Temporal(value=TemporalType.DATE)
        @Column(name="endDate")
        @JsonFormat(pattern="yyyy-MM-dd")
        private Date endDate;

        @Column(name = "eventRevenue")
        private Long revenue;

	public Event() {
		// TODO Auto-generated constructor stub
	}
	
	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setRevenue(Long revenue) {
        this.revenue = revenue;
    }


    public Long getRevenue() {
        return revenue;
    }

}

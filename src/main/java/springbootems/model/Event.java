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
	    @Column(name = "id")
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

        @Temporal(value=TemporalType.DATE)
        @Column(name="end_date")
        @JsonFormat(pattern="yyyy-MM-dd")
        private Date end_date;

	    @Column(name = "event_name")
	    private String name;

        @Column(name = "event_revenue")
        private Long revenue;

        @Temporal(value=TemporalType.DATE)
        @Column(name="start_date")
        @JsonFormat(pattern="yyyy-MM-dd")
        private Date st_date;

	    

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

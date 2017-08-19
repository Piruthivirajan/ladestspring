package com.example.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Event;

import com.example.repository.EventRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/events")
public class EventController {

	@Autowired
	private EventRepository eventrepository;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Event> findall() {
		return eventrepository.findAll();
	}

	@RequestMapping(method = RequestMethod.POST)
	public String create(@RequestBody Event event) {
		String result="";
		try{
		event.setId(null);
		 eventrepository.saveAndFlush(event);
		 result="success"; 
		}
		
		catch(Exception e)
		{
			result="fail";
		}
		System.out.println("----->"+result);
		return result;
	}
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Event findone(@PathVariable Integer id) {
		return eventrepository.findOne(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public String delete(@PathVariable Integer id) {
		String result="";
		try{
			result="success";
			eventrepository.delete(id);
		}
		catch(Exception e){
			result="fail";
		}
		
		return result;

	}
}

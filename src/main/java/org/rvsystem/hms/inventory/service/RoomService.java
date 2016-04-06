package org.rvsystem.hms.inventory.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.rvsystem.hms.inventory.dao.RoomDAO;
import org.rvsystem.hms.inventory.entity.Inventory;
import org.rvsystem.hms.inventory.entity.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping("hms/room")
public class RoomService {


	@Autowired
	RoomDAO roomDAO;
	

	@ResponseBody
	@RequestMapping(value="/findAll",method=RequestMethod.GET)
	public List<Room> findAll(){
		return roomDAO.findAll();
	}

	@ResponseBody
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Room findOne(@PathVariable int id){
		return roomDAO.findOne(id);
	}
	
	@ResponseBody
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public void save(@RequestBody Room room,HttpServletResponse response){
		roomDAO.save(room);
	}
	
	@ResponseBody
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	public Room update(@PathVariable int id,@RequestBody Room room){
		return roomDAO.save(room);
		
	}
	


}

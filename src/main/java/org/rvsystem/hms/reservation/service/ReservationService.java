package org.rvsystem.hms.reservation.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.rvsystem.hms.reservation.dao.ReservationDAO;
import org.rvsystem.hms.reservation.entity.Reservation;
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
@RequestMapping("hms/reservation")
public class ReservationService {

	@Autowired
	ReservationDAO reservationDAO;
	

	@ResponseBody
	@RequestMapping(value="/findAll",method=RequestMethod.GET)
	public List<Reservation> findAll(){
		return reservationDAO.findAll();
	}

	@ResponseBody
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Reservation findOne(@PathVariable int id){
		return reservationDAO.findOne(id);
	}
	
	@ResponseBody
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public void save(@RequestBody Reservation reservation,HttpServletResponse response){
		reservationDAO.save(reservation);
	}
	
	@ResponseBody
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	public Reservation update(@PathVariable int id,@RequestBody Reservation reservation){
		return reservationDAO.save(reservation);
	}


}

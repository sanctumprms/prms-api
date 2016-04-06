package org.rvsystem.hms.reservation.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.rvsystem.hms.reservation.dao.ReservationTransactionDAO;
import org.rvsystem.hms.reservation.entity.ReservationTransaction;
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
@RequestMapping("hms/reservationtransaction")
public class ReservationTransactionService {

	@Autowired
	ReservationTransactionDAO reservationTransactionDAO;
	

	@ResponseBody
	@RequestMapping(value="/findAll",method=RequestMethod.GET)
	public List<ReservationTransaction> findAll(){
		return reservationTransactionDAO.findAll();
	}

	@ResponseBody
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ReservationTransaction findOne(@PathVariable int id){
		return reservationTransactionDAO.findOne(id);
	}
	
	@ResponseBody
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public void save(@RequestBody ReservationTransaction reservationTransaction,HttpServletResponse response){
		reservationTransactionDAO.save(reservationTransaction);
	}
	
	@ResponseBody
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	public ReservationTransaction update(@PathVariable int id,@RequestBody ReservationTransaction reservationTransaction){
		return reservationTransactionDAO.save(reservationTransaction);
	}


}

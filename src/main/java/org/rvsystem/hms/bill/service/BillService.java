package org.rvsystem.hms.bill.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.rvsystem.hms.bill.dao.BillDAO;
import org.rvsystem.hms.bill.entity.Bill;
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
@RequestMapping("hms/bill")
public class BillService {


	@Autowired
	BillDAO billDAO;
	

	@ResponseBody
	@RequestMapping(value="/findAll",method=RequestMethod.GET)
	public List<Bill> findAll(){
		return billDAO.findAll();
	}

	@ResponseBody
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Bill findOne(@PathVariable int id){
		return billDAO.findOne(id);
	}
	
	@ResponseBody
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public void save(@RequestBody Bill bill,HttpServletResponse response){
		billDAO.save(bill);
	}
	
	@ResponseBody
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	public Bill update(@PathVariable int id,@RequestBody Bill bill){
		return billDAO.save(bill);
		
	}
	

}

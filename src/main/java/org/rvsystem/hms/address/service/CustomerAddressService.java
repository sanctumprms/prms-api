package org.rvsystem.hms.address.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.rvsystem.hms.address.dao.CustomerAddressDAO;
import org.rvsystem.hms.address.entity.CustomerAddress;
import org.rvsystem.hms.employe.entity.Education;
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
@RequestMapping("hms/customeraddress")
public class CustomerAddressService {

	@Autowired
	CustomerAddressDAO customerAddressDAO;
	

	@ResponseBody
	@RequestMapping(value="/findAll",method=RequestMethod.GET)
	public List<CustomerAddress> findAll(){
		return customerAddressDAO.findAll();
	}

	@ResponseBody
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public CustomerAddress findOne(@PathVariable int id){
		return customerAddressDAO.findOne(id);
	}
	
	@ResponseBody
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public void save(@RequestBody CustomerAddress customerAddress,HttpServletResponse response){
		customerAddressDAO.save(customerAddress);
	}
	
	@ResponseBody
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	public CustomerAddress update(@PathVariable int id,@RequestBody CustomerAddress customerAddress){
		return customerAddressDAO.save(customerAddress);
		
	}
	


	
}

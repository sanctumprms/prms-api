package org.rvsystem.hms.address.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.rvsystem.hms.address.dao.EmployeAddressDAO;
import org.rvsystem.hms.address.entity.EmployeAddress;
import org.rvsystem.hms.employe.dao.EmployeDAO;
import org.rvsystem.hms.employe.entity.Employe;
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
@RequestMapping("hms/employeaddress")
public class EmployeAddressService {

	public static final Logger log = Logger.getLogger(EmployeAddressService.class);
	
	@Autowired
	EmployeAddressDAO employeAddressDAO;
	

	@Autowired
	EmployeDAO employeDAO;
	
	@ResponseBody
	@RequestMapping(value="/findAll",method=RequestMethod.GET)
	public List<EmployeAddress> findAll(){
		return employeAddressDAO.findAll();
	}

	@ResponseBody
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public EmployeAddress findOne(@PathVariable int id){
		
		return employeAddressDAO.findOne(id);
	}
	
	@ResponseBody
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public void save(@RequestBody EmployeAddress employeAddress,HttpServletResponse response){
		//createEmployeAddress(employeAddress);
		employeAddressDAO.save(employeAddress);
	}
	
	@ResponseBody
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	public EmployeAddress update(@RequestBody EmployeAddress employeAddress){
		return employeAddressDAO.save(employeAddress);
		
	}
	

	public void createEmployeAddress(EmployeAddress employeAddress){
		
		log.info(employeAddress.toString());
		log.info("employeAddress.getEmploye().getEmployeid() <"+employeAddress.getEmploye().getEmployeid()+">");
		Employe employe=employeDAO.getOne((employeAddress.getEmploye().getEmployeid()));
	
		log.info(employe.toString());
		employeAddress.setEmploye(employe);
		
	}

	

}

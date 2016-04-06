package org.rvsystem.hms.employe.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.rvsystem.hms.customer.entity.Customer;
import org.rvsystem.hms.employe.dao.EmployeDAO;
import org.rvsystem.hms.employe.dao.EmployeIdentificationDAO;
import org.rvsystem.hms.employe.entity.EmployeIdentification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@Controller
@RequestMapping("hms/employeidentification")
public class EmployeIdentificationService {

	@Autowired
	EmployeIdentificationDAO employeIdentificationDAO;
	
	
	@ResponseBody
	@RequestMapping(value="/findAll",method=RequestMethod.GET)
	public List<EmployeIdentification> findAll(){
		return employeIdentificationDAO.findAll();
	}

	@ResponseBody
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public EmployeIdentification findOne(@PathVariable int id){
		
		return employeIdentificationDAO.findOne(id);
	}
	
	@ResponseBody
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public void save(@RequestBody EmployeIdentification employeIdentification,HttpServletResponse response){
		

		employeIdentificationDAO.save(employeIdentification);
		 String location = ServletUriComponentsBuilder.fromCurrentRequest()
			      .pathSegment("{id}").buildAndExpand(employeIdentification.getEmployeidentificationid())
			      .toUriString();
			 
		 response.setHeader("Location",location);		
	}
	
	@ResponseBody
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	public EmployeIdentification update(@PathVariable int id,@RequestBody EmployeIdentification employeIdentification){
		return employeIdentificationDAO.save(employeIdentification);
		
	}
}

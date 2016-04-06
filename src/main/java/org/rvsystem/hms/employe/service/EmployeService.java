package org.rvsystem.hms.employe.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

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
@RequestMapping("hms/employe")
public class EmployeService {

	
	@Autowired
	EmployeDAO employeDAO;
	
	
	@ResponseBody
	@RequestMapping(value="/findAll",method=RequestMethod.GET)
	public List<Employe> findAll(){
		return employeDAO.findAll();
	}
	
	@ResponseBody
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Employe findOne(@PathVariable int id){
		
		return employeDAO.findOne(id);
	}
	
	@ResponseBody
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public void save(@RequestBody Employe employe,HttpServletResponse response){
		

		employeDAO.save(employe);
			
	}
	
	@ResponseBody
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	public Employe update(@PathVariable int id,@RequestBody Employe employe){
		employeDAO.save(employe);
		return employe;
	}
	
	
	@ResponseBody
	@RequestMapping(value="/getemployebyname/{firstname}/{lastname}",method=RequestMethod.GET)
	public List<Employe> getemployebyname(@PathVariable("firstname") String firstname,@PathVariable("lastname") String lastname){
		return employeDAO.getEmployeByFirstandLastName(firstname, lastname);
	}
	
}

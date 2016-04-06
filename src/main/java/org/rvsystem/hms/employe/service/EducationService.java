package org.rvsystem.hms.employe.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.rvsystem.hms.employe.dao.EducationDAO;
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
@RequestMapping("hms/education")
public class EducationService {

	@Autowired
	EducationDAO educationDAO;
	

	@ResponseBody
	@RequestMapping(value="/findAll",method=RequestMethod.GET)
	public List<Education> findAll(){
		return educationDAO.findAll();
	}

	@ResponseBody
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Education findOne(@PathVariable int id){
		return educationDAO.findOne(id);
	}
	
	@ResponseBody
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public void save(@RequestBody Education education,HttpServletResponse response){
			educationDAO.save(education);
	}
	
	@ResponseBody
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	public Education update(@PathVariable int id,@RequestBody Education education){
		return educationDAO.save(education);
		
	}
	
}

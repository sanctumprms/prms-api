package org.rvsystem.hms.rateplan.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.rvsystem.hms.rateplan.dao.RatePlanDAO;
import org.rvsystem.hms.rateplan.entity.RatePlan;
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
@RequestMapping("hms/rateplan")
public class RatePlanService {

	@Autowired
	RatePlanDAO ratePlanDAO;
	

	@ResponseBody
	@RequestMapping(value="/findAll",method=RequestMethod.GET)
	public List<RatePlan> findAll(){
		return ratePlanDAO.findAll();
	}

	@ResponseBody
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public RatePlan findOne(@PathVariable int id){
		return ratePlanDAO.findOne(id);
	}
	
	@ResponseBody
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public void save(@RequestBody RatePlan ratePlan,HttpServletResponse response){
		ratePlanDAO.save(ratePlan);
	}
	
	@ResponseBody
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	public RatePlan update(@PathVariable int id,@RequestBody RatePlan ratePlan){
		return ratePlanDAO.save(ratePlan);
	}



}

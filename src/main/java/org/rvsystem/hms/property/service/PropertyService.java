package org.rvsystem.hms.property.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.rvsystem.hms.property.dao.PropertyDAO;
import org.rvsystem.hms.property.entity.Property;
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
@RequestMapping("hms/property")
public class PropertyService {

	@Autowired
	PropertyDAO propertyDAO;

	@ResponseBody
	@RequestMapping(value="/findAll",method=RequestMethod.GET)
	public List<Property> findAll(){
		return propertyDAO.findAll();
	}

	@ResponseBody
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Property findOne(@PathVariable int id){
		return propertyDAO.findOne(id);
	}
	
	@ResponseBody
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public void save(@RequestBody Property property,HttpServletResponse response){
		propertyDAO.save(property);
	}
	
	@ResponseBody
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	public Property update(@PathVariable int id,@RequestBody Property property){
		return propertyDAO.save(property);
	}
	

}

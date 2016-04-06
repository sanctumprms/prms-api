package org.rvsystem.hms.organization.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.rvsystem.hms.organization.dao.OrganizationDAO;
import org.rvsystem.hms.organization.entity.Organization;
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
@RequestMapping("hms/org")
public class OrganizationService {
	@Autowired
	OrganizationDAO orgDAO;

	@ResponseBody
	@RequestMapping(value="/findAll",method=RequestMethod.GET)
	public List<Organization> findAll(){
		return orgDAO.findAll();
	}

	@ResponseBody
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Organization findOne(@PathVariable int id){
		return orgDAO.findOne(id);
	}
	
	@ResponseBody
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public void save(@RequestBody Organization org,HttpServletResponse response){
		orgDAO.save(org);
	}
	
	@ResponseBody
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	public Organization update(@PathVariable int id,@RequestBody Organization org){
		return orgDAO.save(org);
	}
	

}

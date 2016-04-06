package org.rvsystem.hms.site.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.rvsystem.hms.site.dao.SiteDAO;
import org.rvsystem.hms.site.entity.Site;
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
@RequestMapping("hms/site")
public class SiteService {
	
	@Autowired
	SiteDAO siteDAO;

	@ResponseBody
	@RequestMapping(value="/findAll",method=RequestMethod.GET)
	public List<Site> findAll(){
		return siteDAO.findAll();
	}

	@ResponseBody
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Site findOne(@PathVariable int id){
		return siteDAO.findOne(id);
	}
	
	@ResponseBody
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public void save(@RequestBody Site site,HttpServletResponse response){
		siteDAO.save(site);
	}
	
	@ResponseBody
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	public Site update(@PathVariable int id,@RequestBody Site site){
		return siteDAO.save(site);
	}
	
}

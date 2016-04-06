package org.rvsystem.hms.item.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.rvsystem.hms.item.dao.ItemImageDAO;
import org.rvsystem.hms.item.entity.ItemImage;
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
@RequestMapping("hms/itemimage")
public class ItemImageService {

	@Autowired
	ItemImageDAO itemImageDAO;
	

	@ResponseBody
	@RequestMapping(value="/findAll",method=RequestMethod.GET)
	public List<ItemImage> findAll(){
		return itemImageDAO.findAll();
	}

	@ResponseBody
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ItemImage findOne(@PathVariable int id){
		return itemImageDAO.findOne(id);
	}
	
	@ResponseBody
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public void save(@RequestBody ItemImage itemImage,HttpServletResponse response){
		itemImageDAO.save(itemImage);
	}
	
	@ResponseBody
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	public ItemImage update(@PathVariable int id,@RequestBody ItemImage itemImage){
		return itemImageDAO.save(itemImage);
	}




}

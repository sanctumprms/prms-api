package org.rvsystem.hms.item.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.rvsystem.hms.item.dao.ItemDAO;
import org.rvsystem.hms.item.entity.Item;
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
@RequestMapping("hms/item")
public class ItemService {


	@Autowired
	ItemDAO itemDAO;
	

	@ResponseBody
	@RequestMapping(value="/findAll",method=RequestMethod.GET)
	public List<Item> findAll(){
		return itemDAO.findAll();
	}

	@ResponseBody
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Item findOne(@PathVariable int id){
		return itemDAO.findOne(id);
	}
	
	@ResponseBody
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public void save(@RequestBody Item item,HttpServletResponse response){
		itemDAO.save(item);
	}
	
	@ResponseBody
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	public Item update(@PathVariable int id,@RequestBody Item item){
		return itemDAO.save(item);
	}



}

package org.rvsystem.hms.inventory.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.rvsystem.hms.address.entity.CustomerAddress;
import org.rvsystem.hms.inventory.dao.InventoryDAO;
import org.rvsystem.hms.inventory.entity.Inventory;
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
@RequestMapping("hms/inventory")
public class InventoryService {

	@Autowired
	InventoryDAO inventoryDAO;
	

	@ResponseBody
	@RequestMapping(value="/findAll",method=RequestMethod.GET)
	public List<Inventory> findAll(){
		return inventoryDAO.findAll();
	}

	@ResponseBody
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Inventory findOne(@PathVariable int id){
		return inventoryDAO.findOne(id);
	}
	
	@ResponseBody
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public void save(@RequestBody Inventory inventory,HttpServletResponse response){
		inventoryDAO.save(inventory);
	}
	
	@ResponseBody
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	public Inventory update(@PathVariable int id,@RequestBody Inventory inventory){
		return inventoryDAO.save(inventory);
		
	}
	
}

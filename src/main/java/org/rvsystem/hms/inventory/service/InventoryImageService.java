package org.rvsystem.hms.inventory.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import org.rvsystem.hms.inventory.dao.InventoryImageDAO;
import org.rvsystem.hms.inventory.entity.InventoryImage;
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
@RequestMapping("hms/inventoryimage")
public class InventoryImageService {

	@Autowired
	InventoryImageDAO inventoryImageDAO;
	

	@ResponseBody
	@RequestMapping(value="/findAll",method=RequestMethod.GET)
	public List<InventoryImage> findAll(){
		return inventoryImageDAO.findAll();
	}

	@ResponseBody
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public InventoryImage findOne(@PathVariable int id){
		return inventoryImageDAO.findOne(id);
	}
	
	@ResponseBody
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public void save(@RequestBody InventoryImage inventoryImage,HttpServletResponse response){
		inventoryImageDAO.save(inventoryImage);
	}
	
	@ResponseBody
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	public InventoryImage update(@PathVariable int id,@RequestBody InventoryImage inventoryImage){
		return inventoryImageDAO.save(inventoryImage);
	}

}

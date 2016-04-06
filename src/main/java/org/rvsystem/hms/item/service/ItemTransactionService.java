package org.rvsystem.hms.item.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.rvsystem.hms.item.dao.ItemTransactionDAO;
import org.rvsystem.hms.item.entity.ItemTransaction;
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
@RequestMapping("hms/itemtransaction")
public class ItemTransactionService {


	@Autowired
	ItemTransactionDAO itemTransactionDAO;
	

	@ResponseBody
	@RequestMapping(value="/findAll",method=RequestMethod.GET)
	public List<ItemTransaction> findAll(){
		return itemTransactionDAO.findAll();
	}

	@ResponseBody
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ItemTransaction findOne(@PathVariable int id){
		return itemTransactionDAO.findOne(id);
	}
	
	@ResponseBody
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public void save(@RequestBody ItemTransaction itemTransaction,HttpServletResponse response){
		itemTransactionDAO.save(itemTransaction);
	}
	
	@ResponseBody
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	public ItemTransaction update(@PathVariable int id,@RequestBody ItemTransaction itemTransaction){
		return itemTransactionDAO.save(itemTransaction);
	}

}

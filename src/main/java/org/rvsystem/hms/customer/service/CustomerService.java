package org.rvsystem.hms.customer.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.rvsystem.hms.customer.dao.CustomerDAO;
import org.rvsystem.hms.customer.entity.Customer;
import org.rvsystem.hms.customer.request.CustomerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@Controller
@RequestMapping("hms/customer")
public class CustomerService {

	@Autowired
	CustomerDAO customerDAO;
	
	
	@ResponseBody
	@RequestMapping(value="/findAll",method=RequestMethod.GET)
	public List<Customer> getAllCustsomer(){
		return customerDAO.findAll();
	}

	@ResponseBody
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Customer getAllCustsomer(@PathVariable int id){
		
		return customerDAO.findOne(id);
	}
	
	@ResponseBody
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public void save(@RequestBody Customer customer,HttpServletResponse response){
		

		customerDAO.save(customer);
		 String location = ServletUriComponentsBuilder.fromCurrentRequest()
			      .pathSegment("{id}").buildAndExpand(customer.getCustomerid())
			      .toUriString();
			 
		 response.setHeader("Location",location);		
	}
	
	@ResponseBody
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	public Customer update(@PathVariable int id,@RequestBody Customer customer){
		customerDAO.save(customer);
		return customer;
	}
	
	

	public void createCustomerEntity(CustomerRequest customerRequest,Customer customer){
		customer.setCustomerid(customerRequest.getCustomerid());
		customer.setActive(customerRequest.isActive());
		customer.setContactnumber(customerRequest.getContactnumber());
		customer.setFirstname(customerRequest.getFirstname());
		customer.setLastname(customerRequest.getLastname());
		customer.setEmailid(customerRequest.getEmailid());
		customer.setUsername(customerRequest.getUsername());
		customer.setPassword(customerRequest.getPassword());
	}
	
	public void createCustomerRequest(Customer customer,CustomerRequest customerRequest){
		customerRequest.setCustomerid(customer.getCustomerid());
		customerRequest.setActive(customer.isActive());
		customerRequest.setContactnumber(customer.getContactnumber());
		customerRequest.setFirstname(customer.getContactnumber());
		customerRequest.setLastname(customer.getFirstname());
		customerRequest.setUsername(customer.getUsername());
	}

	public boolean checkNullorEmpty(Object obj){
		if(obj!=null){
			if (obj instanceof String && ((String) obj).trim().length()>0) {
				return true;
			}else if(obj instanceof Integer && 0!=((Integer)obj)){
				return true;
			}else if(obj instanceof Byte &&  ((Byte[])obj).length>0){
				return true;
			}else if(obj instanceof Double && 0!=((Double)obj)){
				return true;
			}
		}return false;
	}
}

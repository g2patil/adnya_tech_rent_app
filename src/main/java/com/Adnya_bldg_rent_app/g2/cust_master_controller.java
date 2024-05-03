package com.Adnya_bldg_rent_app.g2;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adnya.Valid;



@Controller
@RestController
@RequestMapping("/adnya")

public class cust_master_controller {
	 
	@Autowired
    cust_master_repository cmr;
	
	//private final cust_master_repository Cust_master_repository;
	  @Autowired
	  public cust_master_controller(cust_master_repository Cust_master_repository) {
	    this.cmr = Cust_master_repository;
	  }
	 
	  @GetMapping("/cust")
		public List<cust_master> getAllEmployees() {
			return (List<cust_master>) cmr.findAll();
		}
	  
	  @PostMapping("/add_cust")
	  public cust_master createUser(@RequestBody cust_master customer) {
	      return cmr.save(customer);				
	  }
	  
	/*  @PostMapping("/login")
	  public ResponseEntity<String> getlogin(@RequestBody cust_master customer) {
		
          
		  return new ResponseEntity<>("User signed-in successfully!.", HttpStatus.OK);
         
          	
	  }*/
	  @SuppressWarnings("unlikely-arg-type")
	@PostMapping("/login")
	    public Status loginUser(@Valid @RequestBody cust_master Cust_master) {
	        List<cust_master> cust_master = cmr.findAll();

	        for (cust_master other : cust_master) {
	            if (other.equals(Cust_master)) {
	            	Cust_master.setLoggedIn(true);
	            	//cmr.(Cust_master);
	            	//cust_master.saveAll(Cust_master);
	            	//adnya
	                return Status.SUCCESS;
	            }		
	        }

	        return Status.FAILURE;
	    }
	  
	  
	    
	 	}

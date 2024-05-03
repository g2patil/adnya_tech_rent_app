package com.Adnya_bldg_rent_app.g2;

import java.util.Objects;

import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.security.crypto.bcrypt.BCrypt;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@SuppressWarnings("deprecation")
@Entity
public class cust_master {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cust_id;
        
   // @NotBlank(message = "Name is required")
    private String cust_f_name;
    private String cust_m_name;
    private String cust_l_name;
  //  @NotBlank(message = "Surname is required")
    private String cust_address;
    private int cust_pincode;
    @Column(nullable = false, length = 64)
    private String password;

 //   @NotBlank(message = "Email is required")
    @Column(unique=true)
    @NotNull
    private String cust_email;
    
    @Column(unique=true)
    @NotNull
    private String cust_mob;
   
    @NotNull
    private  boolean loggedIn=false;
    
    
    
	public boolean isLoggedIn() {
		return loggedIn;
	}
	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}
	public long getCust_id() {
		return cust_id;
	}
	public void setCust_id(long cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_f_name() {
		return cust_f_name;
	}
	public void setCust_f_name(String cust_f_name) {
		this.cust_f_name = cust_f_name;
	}
	public String getCust_m_name() {
		return cust_m_name;
	}
	public void setCust_m_name(String cust_m_name) {
		this.cust_m_name = cust_m_name;
	}
	public String getCust_l_name() {
		return cust_l_name;
	}
	public void setCust_l_name(String cust_l_name) {
		this.cust_l_name = cust_l_name;
	}
	public String getCust_address() {
		return cust_address;
	}
	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}
	public int getCust_pincode() {
		return cust_pincode;
	}
	public void setCust_pincode(int cust_pincode) {
		this.cust_pincode = cust_pincode;
	}
	public String getCust_email() {
		return cust_email;
	}
	public void setCust_email(String cust_email) {
		this.cust_email = cust_email;
	}
	public String getCust_mob() {
		return cust_mob;
	}
	public void setCust_mob(String cust_mob) {
		this.cust_mob = cust_mob;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		
		this.password =password ;
		//BCrypt.hashpw(password, BCrypt.gensalt());
	}
	
	
	 @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (!(o instanceof cust_master)) return false;
	        cust_master cust_master = (cust_master) o;
	        return Objects.equals(cust_mob, cust_master.cust_mob) &&
	                Objects.equals(password, cust_master.password);
	    }
    


}

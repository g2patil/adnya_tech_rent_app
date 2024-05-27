package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Adnya_bldg_rent_app.g2.cust_master;

@Repository
public interface cust_master_repository extends JpaRepository<cust_master, Long> {
    
 //   List<cust_master> findAll(String cust_f_name);
    
}
package com.hexaware.customerapi.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hexaware.customerapi.entity.CustomerEntity;
@Repository
public interface CustomerRepository  extends JpaRepository<CustomerEntity,Integer>{

}

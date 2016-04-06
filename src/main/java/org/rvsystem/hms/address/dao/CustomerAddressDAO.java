package org.rvsystem.hms.address.dao;

import org.rvsystem.hms.address.entity.CustomerAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly=true)
public interface CustomerAddressDAO extends JpaRepository<CustomerAddress,Integer>{

}

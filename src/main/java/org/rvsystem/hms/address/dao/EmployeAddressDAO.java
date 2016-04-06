package org.rvsystem.hms.address.dao;

import org.rvsystem.hms.address.entity.EmployeAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly=true)
public interface EmployeAddressDAO extends JpaRepository<EmployeAddress, Integer>{

}

package org.rvsystem.hms.customer.dao;

import org.rvsystem.hms.customer.entity.CustomerIdentification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly=true)
public interface CustomerIdentificationDAO extends JpaRepository<CustomerIdentification, Integer> {

}

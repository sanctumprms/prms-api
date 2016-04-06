package org.rvsystem.hms.employe.dao;

import org.rvsystem.hms.employe.entity.EmployeIdentification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly=true)
public interface EmployeIdentificationDAO extends JpaRepository<EmployeIdentification, Integer>{

}

package org.rvsystem.hms.employe.dao;

import java.util.List;

import org.rvsystem.hms.employe.entity.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly=true)
public interface EmployeDAO extends JpaRepository<Employe, Integer>{

	@Query("SELECT p FROM Employe p WHERE p.firstname=:firstname and p.lastname=:lastname")
	List<Employe> getEmployeByFirstandLastName(@Param("firstname") String firstname,@Param("lastname") String lastname);
	
}

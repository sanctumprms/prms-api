package org.rvsystem.hms.employe.dao;

import org.rvsystem.hms.employe.entity.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly=true)
public interface EducationDAO extends JpaRepository<Education, Integer>{

}

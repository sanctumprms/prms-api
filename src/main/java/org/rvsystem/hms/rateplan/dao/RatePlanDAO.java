package org.rvsystem.hms.rateplan.dao;

import org.rvsystem.hms.rateplan.entity.RatePlan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatePlanDAO extends JpaRepository<RatePlan, Integer>{

}

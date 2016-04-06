package org.rvsystem.hms.property.dao;

import org.rvsystem.hms.property.entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyDAO extends JpaRepository<Property, Integer> {

}

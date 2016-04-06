package org.rvsystem.hms.inventory.dao;

import org.rvsystem.hms.inventory.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly=true)
public interface InventoryDAO extends JpaRepository<Inventory, Integer>{

}

package org.rvsystem.hms.bill.dao;

import org.rvsystem.hms.bill.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly=true)
public interface BillDAO extends JpaRepository<Bill, Integer>{

}

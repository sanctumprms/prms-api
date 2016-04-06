package org.rvsystem.hms.item.dao;

import org.rvsystem.hms.item.entity.ItemTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly=true)
public interface ItemTransactionDAO extends JpaRepository<ItemTransaction, Integer>{

}

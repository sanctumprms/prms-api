package org.rvsystem.hms.reservation.dao;

import org.rvsystem.hms.reservation.entity.ReservationTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
@Transactional(readOnly=true)
public interface ReservationTransactionDAO extends JpaRepository<ReservationTransaction, Integer>{

}

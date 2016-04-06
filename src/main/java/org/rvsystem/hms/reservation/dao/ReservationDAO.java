package org.rvsystem.hms.reservation.dao;

import org.rvsystem.hms.reservation.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
@Transactional(readOnly=true)
public interface ReservationDAO extends JpaRepository<Reservation, Integer>{

}

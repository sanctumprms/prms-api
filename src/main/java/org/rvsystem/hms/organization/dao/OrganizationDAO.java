package org.rvsystem.hms.organization.dao;

import org.rvsystem.hms.organization.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly=true)
public interface OrganizationDAO  extends JpaRepository<Organization, Integer> {

}

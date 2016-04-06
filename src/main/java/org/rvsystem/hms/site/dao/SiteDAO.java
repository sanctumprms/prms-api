package org.rvsystem.hms.site.dao;

import org.rvsystem.hms.site.entity.Site;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly=true)
public interface SiteDAO  extends JpaRepository<Site, Integer>{

}

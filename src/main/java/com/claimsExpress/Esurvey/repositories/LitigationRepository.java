package com.claimsExpress.Esurvey.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import com.claimsExpress.Esurvey.models.Reviews;
@Repository
@EnableJpaRepositories
public interface LitigationRepository  extends JpaRepository<Reviews, String> {

}

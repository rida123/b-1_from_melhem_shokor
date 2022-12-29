package com.claimsExpress.Esurvey.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.claimsExpress.Esurvey.models.Doors;

@Repository
@EnableJpaRepositories
public interface DoorsRepository extends JpaRepository<Doors, String>  {

}

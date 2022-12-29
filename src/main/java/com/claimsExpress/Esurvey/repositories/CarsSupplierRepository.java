package com.claimsExpress.Esurvey.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.claimsExpress.Esurvey.models.CarsAppPictures;
import com.claimsExpress.Esurvey.models.CarsSupplier;
@Repository
@EnableJpaRepositories
public interface CarsSupplierRepository extends JpaRepository<CarsSupplier, String> {
	@Query("select  c from CarsSupplier c     where c.supplierCoreUserId = ?1 ")

	Optional<CarsSupplier>  findBySupplierCoreUserId(String id);
}

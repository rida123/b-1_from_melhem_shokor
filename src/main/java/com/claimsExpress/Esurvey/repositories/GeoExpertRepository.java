
package com.claimsExpress.Esurvey.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.claimsExpress.Esurvey.models.GeoExpert;

@Repository
@EnableJpaRepositories
public interface GeoExpertRepository  extends JpaRepository<GeoExpert, String> {
 Optional<GeoExpert> findByGeoExpertId(String userId);
}

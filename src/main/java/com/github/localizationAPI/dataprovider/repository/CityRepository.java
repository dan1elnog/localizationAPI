package com.github.localizationAPI.dataprovider.repository;

import com.github.localizationAPI.dataprovider.repository.entity.CityEntity;
import com.github.localizationAPI.dataprovider.repository.projection.CityProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<CityEntity, Long>, JpaSpecificationExecutor<CityEntity> {

    Page<CityEntity> findByNameContaining(String name, Pageable pageable);

    @Query(value ="SELECT c.id, c.name FROM city" , nativeQuery = true)
    CityProjection getCityProjection();
}

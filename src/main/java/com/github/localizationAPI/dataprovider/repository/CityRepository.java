package com.github.localizationAPI.dataprovider.repository;

import com.github.localizationAPI.dataprovider.repository.entity.CityEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<CityEntity, Long> {

    Page<CityEntity> findByName(String name, Pageable pageable);
}

package com.github.localizationAPI.dataprovider.repository.specification;

import com.github.localizationAPI.dataprovider.repository.entity.CityEntity;
import org.springframework.data.jpa.domain.Specification;

public abstract class CitySpecification {


    public static Specification<CityEntity> nameLike(String name){
        return (root, query, cb) -> cb.like(root.get("name"), name );
    }

    public static Specification<CityEntity> populationGreaterThan(Long population){
        return (root, query, cb) -> cb.greaterThan(root.get("population"), population);
    }

    public static Specification<CityEntity> populationBetween(Long min, Long max){
        return (root, query, cb) -> cb.between(root.get("population"), min, max);
    }
}

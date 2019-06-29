package com.pma.pma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pma.pma.model.Restriction;

@Repository
public interface RestrictionRepository extends JpaRepository<Restriction,Long>{

	public Restriction findByNewsId(Long id);
}

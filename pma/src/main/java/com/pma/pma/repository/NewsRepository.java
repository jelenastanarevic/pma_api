package com.pma.pma.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pma.pma.model.News;
import com.pma.pma.model.RestrictionType;


public interface NewsRepository extends JpaRepository<News,Long>{

	
	public Optional<News> findByIdentificator(Long identificator);
	@Query("SELECT p FROM news p, restriction r WHERE r.news.id = p.id AND r.restrictionType =?1 ")
	public List<News> findByRestrictionType(RestrictionType restrictionType);
}

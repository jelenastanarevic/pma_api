package com.pma.pma.service;

import java.util.List;
import java.util.Optional;

import com.pma.pma.model.News;
import com.pma.pma.model.RestrictionType;

public interface NewsService {

	public Optional<News> findById(Long id);
	public List<News> findAll();
	public News save(News dto);
	public List<News> findByRestrictionType(RestrictionType restrictionType);
	public Optional<News> findByIdentificator(Long id);
}

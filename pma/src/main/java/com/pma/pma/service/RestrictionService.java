package com.pma.pma.service;

import java.util.List;
import java.util.Optional;

import com.pma.pma.model.Restriction;

public interface RestrictionService {
	
	public Restriction save (Restriction restriction);
	public List<Restriction> findAll();
	public Optional<Restriction> findById(Long id);
	public Restriction findByNewsId(Long id);

}

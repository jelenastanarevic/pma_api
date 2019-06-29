package com.pma.pma.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pma.pma.model.Restriction;
import com.pma.pma.repository.RestrictionRepository;
import com.pma.pma.service.RestrictionService;

@Service
public class RestrictionServiceImpl implements RestrictionService {

	@Autowired
	private RestrictionRepository restrictionRepository;
	
	@Override
	public Restriction save(Restriction restriction) {
		return restrictionRepository.save(restriction);
	}

	@Override
	public List<Restriction> findAll() {
		return restrictionRepository.findAll();
	}

	@Override
	public Optional<Restriction> findById(Long id) {
		// TODO Auto-generated method stub
		return restrictionRepository.findById(id);
	}

	@Override
	public Restriction findByNewsId(Long id) {
		// TODO Auto-generated method stub
		return restrictionRepository.findByNewsId(id);
	}

}

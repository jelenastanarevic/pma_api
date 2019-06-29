package com.pma.pma.serviceImpl;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pma.pma.model.News;
import com.pma.pma.model.RestrictionType;
import com.pma.pma.repository.NewsRepository;
import com.pma.pma.service.NewsService;

@Service
public class NewsServiceImpl implements NewsService{

	@Autowired
	private NewsRepository newsRepository;
	
	@Override
	public Optional<News> findById(Long id) {
		return newsRepository.findById(id);
	}

	@Override
	public List<News> findAll() {
		// TODO Auto-generated method stub
		return newsRepository.findAll();
	}

	@Override
	public News save(News dto) {
		// TODO Auto-generated method stub
		dto.setIdentificatior(new Random().nextLong());
		return newsRepository.save(dto);
	}

	@Override
	public List<News> findByRestrictionType(RestrictionType restrictionType) {
		// TODO Auto-generated method stub
		return newsRepository.findByRestrictionType(restrictionType);
	}

	@Override
	public Optional<News> findByIdentificator(Long id) {
		// TODO Auto-generated method stub
		return newsRepository.findByIdentificator(id);
	}

}

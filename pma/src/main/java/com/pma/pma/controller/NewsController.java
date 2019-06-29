package com.pma.pma.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.pma.pma.model.News;
import com.pma.pma.model.RestrictionType;
import com.pma.pma.service.NewsService;

@Controller
@RequestMapping("/news")
public class NewsController {

	@Autowired
	private NewsService newsService;
	
	@RequestMapping("/{id}")
	public ResponseEntity<News> getNewsById(@PathVariable ("id") Long id) {
		
		Optional<News> news = newsService.findById(id);
		
		return new ResponseEntity<News>(news.get(),HttpStatus.OK);
	}
	
	
	@RequestMapping("/findByIdentificator/{id}")
	public ResponseEntity<News> findByIdentificator(@PathVariable ("id") Long id) {
		
		Optional<News> news = newsService.findByIdentificator(id);
		
		return new ResponseEntity<News>(news.get(),HttpStatus.OK);
	}
	@RequestMapping("/")
	public ResponseEntity<List<News>> getNews() {
		
		List<News> news = newsService.findAll();
		
		return new ResponseEntity<List<News>>(news,HttpStatus.OK);
	}
	
	@RequestMapping("/save")
	public ResponseEntity<News> saveNews(@RequestParam ("file") MultipartFile file,
			@RequestParam ("title") String title,
			@RequestParam ("text") String text) {
		
		News news = new News();
		news.setContent(text);
		news.setTitle(title);
		try {
			news.setImage(file.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		news = newsService.save(news);
		
		return new ResponseEntity<News>(news,HttpStatus.OK);
	}
	
	@RequestMapping("/restrictionType/{id}")
	public ResponseEntity<List<News>> getByRestrictionType(@PathVariable ("id") int restrictionType) {
		
		RestrictionType type = null;
		if(restrictionType == 0) {
			type = RestrictionType.ROAD;
		} else if (restrictionType == 1) {
			type = RestrictionType.WATER;
		} else if (restrictionType == 2) {
			type = RestrictionType.ELECTRICAL;
		}
		List<News> news = newsService.findByRestrictionType(type);
		
		return new ResponseEntity<List<News>>(news,HttpStatus.OK);
	}
}

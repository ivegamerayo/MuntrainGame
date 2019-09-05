package com.telefonica.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.telefonica.entities.Question;
import com.telefonica.repositories.QuestionRepository;

@Service("questionService")
public class QuestionServiceImpl implements QuestionService{

	@Autowired
	private QuestionRepository questionRepository;
	
	@Override
	public Iterable<Question> findAll() {
		return questionRepository.findAll();
		}
	

}

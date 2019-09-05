package com.telefonica.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.telefonica.entities.Question;

@Repository("questionRespository")
public interface QuestionRepository extends CrudRepository<Question, Integer> {

}

package com.vermeg.ams.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.vermeg.ams.entities.Article;

public interface ArticleRepository extends CrudRepository<Article, Long> {

}
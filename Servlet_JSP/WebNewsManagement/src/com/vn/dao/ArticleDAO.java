package com.vn.dao;

import java.util.List;
import com.vn.entities.Article;

public interface ArticleDAO {

	public List<Article> getAll();

	public Article create(Article article);

	public Article update(Article article);

	public Article delete(Article article);

}

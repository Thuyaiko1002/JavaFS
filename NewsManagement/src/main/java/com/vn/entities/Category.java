package com.vn.entities;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;

import java.util.List;


/**
 * The persistent class for the categories database table.
 * 
 */
@Data
@Entity
@Table(name="categories")
@NamedQuery(name="Category.findAll", query="SELECT c FROM Category c")
public class Category implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	//bi-directional many-to-one association to Article
	@OneToMany(mappedBy="category")
	private List<Article> articles;

	public Article addArticle(Article article) {
		getArticles().add(article);
		article.setCategory(this);

		return article;
	}

	public Article removeArticle(Article article) {
		getArticles().remove(article);
		article.setCategory(null);

		return article;
	}

}
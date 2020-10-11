package com.vn.dao;

import java.util.List;
import com.vn.entities.Category;

public interface CategoryDAO {

	public List<Category> getAll();

	public Category create(Category category);

	public Category update(Category category);

	public Category delete(Category category);

}

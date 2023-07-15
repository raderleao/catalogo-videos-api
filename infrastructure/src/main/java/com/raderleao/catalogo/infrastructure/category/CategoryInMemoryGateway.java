package com.raderleao.catalogo.infrastructure.category;

import com.raderleao.catalogo.domain.category.Category;
import com.raderleao.catalogo.domain.category.CategoryGateway;
import com.raderleao.catalogo.domain.category.CategorySearchQuery;
import com.raderleao.catalogo.domain.pagination.Pagination;

import java.util.Optional;

public class CategoryInMemoryGateway implements CategoryGateway {
    @Override
    public Category save(Category aCategory) {
        return null;
    }

    @Override
    public void deleteById(String anId) {

    }

    @Override
    public Optional<Category> findById(String anId) {
        return Optional.empty();
    }

    @Override
    public Pagination<Category> findAll(CategorySearchQuery aQuery) {
        return null;
    }
}

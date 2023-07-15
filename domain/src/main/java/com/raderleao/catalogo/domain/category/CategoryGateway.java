package com.raderleao.catalogo.domain.category;

import com.raderleao.catalogo.domain.pagination.Pagination;

import java.util.Optional;

public interface CategoryGateway {

    Category save(Category aCategory);

    void deleteById(String anId);

    Optional<Category> findById(String anId);

    Pagination<Category> findAll(CategorySearchQuery aQuery);
}

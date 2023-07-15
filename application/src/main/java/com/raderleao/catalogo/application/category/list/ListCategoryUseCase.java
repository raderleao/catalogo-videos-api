package com.raderleao.catalogo.application.category.list;

import com.raderleao.catalogo.application.UseCase;
import com.raderleao.catalogo.domain.category.CategoryGateway;
import com.raderleao.catalogo.domain.category.CategorySearchQuery;
import com.raderleao.catalogo.domain.pagination.Pagination;

import java.util.Objects;

public class ListCategoryUseCase extends UseCase<CategorySearchQuery, Pagination<ListCategoryOutput>> {

    private final CategoryGateway categoryGateway;

    public ListCategoryUseCase(CategoryGateway categoryGateway) {
        this.categoryGateway = Objects.requireNonNull(categoryGateway);
    }

    @Override
    public Pagination<ListCategoryOutput> execute(final CategorySearchQuery aQuery) {
        return this.categoryGateway.findAll(aQuery)
                .map(ListCategoryOutput::from);
    }
}

package com.raderleao.catalogo.application.category.save;

import com.raderleao.catalogo.application.UseCase;
import com.raderleao.catalogo.domain.category.Category;
import com.raderleao.catalogo.domain.category.CategoryGateway;
import com.raderleao.catalogo.domain.exceptions.NotificationException;
import com.raderleao.catalogo.domain.validation.Error;
import com.raderleao.catalogo.domain.validation.handler.Notification;

import java.util.Objects;

public class SaveCategoryUseCase extends UseCase<Category, Category> {

    private final CategoryGateway categoryGateway;

    public SaveCategoryUseCase(final CategoryGateway categoryGateway) {
        this.categoryGateway = Objects.requireNonNull(categoryGateway);
    }

    @Override
    public Category execute(Category aCategory) {
        if(aCategory == null) {
            throw NotificationException.with(new Error("'aCategory' cannot be null"));
        }

        final var notification = Notification.create();
        aCategory.validate(notification);

        if (notification.hasError()) {
            throw NotificationException.with("Invalid category", notification);
        }
        return this.categoryGateway.save(aCategory);
    }
}

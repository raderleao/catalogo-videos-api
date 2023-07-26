package com.raderleao.catalogo.infrastructure;

import com.raderleao.catalogo.infrastructure.category.persistence.CategoryRepository;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;

public class IntegrationTestConfiguration {

    @Bean
    public CategoryRepository categoryRepository() {
        return Mockito.mock(CategoryRepository.class);
    }
}

package com.raderleao.catalogo.application.category.delete;

import com.raderleao.catalogo.application.UseCaseTest;
import com.raderleao.catalogo.domain.Fixture;
import com.raderleao.catalogo.domain.category.CategoryGateway;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class DeleteCategoryUseCaseTest extends UseCaseTest {

    @InjectMocks
    private DeleteCategoryUseCase useCase;

    @Mock
    private CategoryGateway categoryGateway;

    @Test
    public void givenValidId_whenCallsDelete_shouldBeok(){
        // given
        final var aulas = Fixture.Categories.aulas();
        final var expectedId = aulas.id();

        doNothing()
                .when(this.categoryGateway).deleteById(anyString());

        // when
        Assertions.assertDoesNotThrow(() -> this.useCase.execute(expectedId));

        // then
        verify(this.categoryGateway, times(1)).deleteById(eq(expectedId));
    }

    @Test
    public void givenInvalidId_whenCallsDelete_shouldBeok() {
        // given
        final String expectedId = null;

        // when
        Assertions.assertDoesNotThrow(() -> this.useCase.execute(expectedId));

        // then
        verify(this.categoryGateway, never()).deleteById(eq(expectedId));
    }
}

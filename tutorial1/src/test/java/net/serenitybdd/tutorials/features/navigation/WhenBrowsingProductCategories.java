package net.serenitybdd.tutorials.features.navigation;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.tutorials.model.Category;
import net.serenitybdd.tutorials.steps.NavigatingUser;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

/**
 * Created by john on 9/05/2016.
 */
@ExtendWith(SerenityJUnit5Extension.class)
public class WhenBrowsingProductCategories {

    @Steps
    NavigatingUser mark;

    @Managed
    WebDriver browser;

    @Test
    public void shouldBeAbleToNavigateToTheMotorsCategory() {
        // Given
        mark.isOnTheHomePage();

        // When
        mark.navigatesToCategory(Category.Motors);

        // Then
        mark.shouldSeePageTitleContaining("New & Used Cars");
    }
}

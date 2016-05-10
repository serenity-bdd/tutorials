package net.serenitybdd.tutorials.features.navigation;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.tutorials.model.Category;
import net.serenitybdd.tutorials.steps.NavigatingUser;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

/**
 * Created by john on 9/05/2016.
 */
@RunWith(SerenityRunner.class)
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

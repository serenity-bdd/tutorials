package net.serenitybdd.tutorials.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.tutorials.model.Category;

/**
 * Created by john on 10/05/2016.
 */
public class CategoryNavigationBar extends PageObject{
    public void selectCategory(Category category) {
        $("*[role=navigation] *[role=list]").find(By.linkText(category.name())).click();
    }
}

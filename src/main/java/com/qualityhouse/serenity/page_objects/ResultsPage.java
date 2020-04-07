package com.qualityhouse.serenity.page_objects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

public class ResultsPage extends BasePage {

    public static final By PRICE_RANGE_BUTTON_LOCATOR = By.id("menuItemButton-price_range");
    public static final By MORE_FILTERS_BUTTON_LOCATOR = By.id("menuItemButton-dynamicMoreFilters");
    public static final By MINIMAL_PRICE_FIELD_LOCATOR = By.id("price_filter_min");
    public static final By MAXIMAL_PRICE_FIELD_LOCATOR = By.id("price_filter_max");
    public static final By PRICE_FILTER_SAVE_BUTTON = By.id("filter-panel-save-button");


    @FindBy(css = "[id='filterItem-stepper-min_bathrooms-0'] [aria-label='увеличаване на стойността']")
    public WebElementFacade addBathroomButton;

}

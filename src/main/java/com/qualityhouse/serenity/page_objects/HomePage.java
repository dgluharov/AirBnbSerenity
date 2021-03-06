package com.qualityhouse.serenity.page_objects;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import java.util.List;

@DefaultUrl("https://bg.airbnb.com/")
public class HomePage extends PageObject {

    public static final By DESTINATION_FIELD = By.name("query");
    public static final By GUESTS_PLUS_BUTTONS = By.className("_1iz654np");
    public static final By DESTINATION_SEARCH_OPTIONS = By.id("Koan-query__option-0");
    //public static final By CALENDAR_LOCATOR = By.cssSelector("._1w7uj89a");

    @FindBy(css = "._1lds9wb")
    public List<WebElementFacade> checkOutDate;

    @FindBy(className = "_2gf2wq")
    public List<WebElementFacade> searchBarList;

    @FindBy(className = "_1a72ixey")
    public List<WebElementFacade> guestOptions;

    @FindBy(className = "_h6px0p")
    public WebElementFacade searchButton;

    @FindBy(className = "_b0ybw8s")
    public WebElementFacade saveLinkText;

    @FindBy(id = "Koan-query__listbox")
    public List<WebElementFacade> destinationOptionsDropDown;

    @FindBy(className = "_ojs7nk")
    public List<WebElementFacade> currencyLinkText;

    @FindBy(className = "_a7a5sx")
    public List<WebElementFacade> currencyOptions;

    @FindBy(className = "_xpkakx")
    public WebElementFacade regionAndCurrencyButton;

    //TODO
    @FindBy(css = "[aria-labelledby$='searchFlow-title-label-stepper-adults'] [aria-label='увеличаване на стойността']")
    public WebElementFacade addAdultsButton;

    @FindBy(css = "[aria-describedby='searchFlow-subtitle-label-stepper-children'] [aria-label='увеличаване на стойността']")
    public WebElementFacade addChildrenButton;

    @FindBy(css = "[aria-label='Напред']")
    public WebElementFacade monthRightArrow;

    //public WebElementFacade increaseChildrenButton = guestOptions.get(1).find(GUESTS_PLUS_BUTTONS);
    //public WebElementFacade increaseAdultsButton = guestOptions.get(0).find(GUESTS_PLUS_BUTTONS);

}


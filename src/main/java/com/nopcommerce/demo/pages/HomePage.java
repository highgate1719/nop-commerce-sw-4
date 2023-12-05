package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By welcomeToOurStore = By.xpath("//h2[normalize-space()='Welcome to our store']");
    //By listOfTopMenuBar = By.xpath("//ul[@class='top-menu notmobile']/li/a");
    By computersTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
    By electronicsTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
    By apparelTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']");
    By digitalDownloadsTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Digital downloads']");
    By booksTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Books']");
    By jewelryTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Jewelry']");
    By giftCardsTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Gift Cards']");
    By loginLink = By.xpath("//a[normalize-space()='Log in']");
    By registerLink = By.xpath("//a[normalize-space()='Register']");



    //2.37 Verify the text “Welcome to our store”
    public String getTextFromWelcomeStore() {
        return getTextFromElement(welcomeToOurStore);
    }

    public void mouseHoverAndClickOnComputers() {
        mouseHoverToElementAndClick(computersTab);
    }

    public void mouseHoverAndClickOnElectronics() {
        mouseHoverToElementAndClick(electronicsTab);
    }

    public void mouseHoverAndClickOnApparel() {
        mouseHoverToElementAndClick(apparelTab);
    }

    public void mouseHoverAndClickOnDigitalDownloads() {
        mouseHoverToElementAndClick(digitalDownloadsTab);
    }

    public void mouseHoverAndClickOnBooks() {
        mouseHoverToElementAndClick(booksTab);
    }

    public void mouseHoverAndClickOnJewelry() {
        mouseHoverToElementAndClick(jewelryTab);
    }

    public void mouseHoverAndClickOnGiftCards() {
        mouseHoverToElementAndClick(giftCardsTab);
    }

    public void mouseHoverAndClickOnLoginLink() {
        mouseHoverToElementAndClick(loginLink);
    }

    public void mouseHoverAndClickOnRegisterLink() {
        mouseHoverToElementAndClick(registerLink);
    }

}

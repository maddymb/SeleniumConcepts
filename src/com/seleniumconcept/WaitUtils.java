///*
// * package com.seleniumconcept;
// */
//
//package com.seleniumconcept;
//import io.appium.java_client.ios.IOSElement;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions; import org.openqa.selenium.support.ui.WebDriverWait;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
///**
//* This will contain all wait related utility methods. *
//* @author prat3ik
//*/
//public class WaitUtils {
//public final int explicitWaitDefault = PropertyUtils.getIntegerProperty("explicitWait", 10);
//    /**
//     * This method is for static wait
//     *
//     * @param millis
//     */
//    public void staticWait(final long millis) {
//        try {
//TimeUnit.MILLISECONDS.sleep(millis); } catch (final InterruptedException e) { }
//}
//    /**
//     * To wait for button to be clickable
// 131 www.kobiton.com
//Making the move to automation testing with Appium
//       *
//     * @param driver
//     * @param element
//     */
//    public void waitForElementToBeClickable(final WebElement
//element, final WebDriver driver) {
//new WebDriverWait(driver, this.explicitWaitDefault)
//.until(ExpectedConditions.elementToBeClickable(element)); }
//    /**
//     * To wait for element (By) to be invisible
//     *
//     * @param driver
//     * @param locator
//     */
//    public void waitForElementToBeInvisible(final By locator,
//final WebDriver driver) {
//long s = System.currentTimeMillis();
//new WebDriverWait(driver, this.explicitWaitDefault)
//.until(ExpectedConditions.invisibilityOfElementLocated(locato r));
//}
//    /**
//     * To wait for given element (By) to be present
//     *
//     * @param driver
//     * @param locator
//     */
//    public void waitForElementToBePresent(final By locator,
//final WebDriver driver) {
//new WebDriverWait(driver, this.explicitWaitDefault)
//.until(ExpectedConditions.presenceOfElementLocated(locator)); }
///**
//  132 www.kobiton.com
//
//Making the move to automation testing with Appium
//       * To wait for element (By) to be visible
//     *
//     * @param driver
//     * @param locator
//*/
//    public void waitForElementToBeVisible(final By locator,
//final WebDriver driver) {
//new WebDriverWait(driver, this.explicitWaitDefault)
//.until(ExpectedConditions.visibilityOfElementLocated(locator) );
//}
//    /**
//     * To wait for element to be visible
//     *
//     * @param driver
//     * @param element
//     */
//    public void waitForElementToBeVisible(final WebElement
//element, final WebDriver driver) {
//long s = System.currentTimeMillis();
//new WebDriverWait(driver, this.explicitWaitDefault).until(ExpectedConditions.visibility Of(element));
//}
///**
//     * To wait for element to be visible for given amount of
//time
//     *
//     * @param element
//     * @param driver
//     * @param time
//     */
//    public void waitForElementToBeVisible(final IOSElement
//element, final WebDriver driver, int time) {
//long s = System.currentTimeMillis();
//new WebDriverWait(driver, time).until(ExpectedConditions.visibilityOf(element));
//}
//  133 www.kobiton.com
//
//Making the move to automation testing with Appium
//public void waitForElementsToBeInvisible(final
//List<WebElement> elements, final WebDriver driver) {
//final long s = System.currentTimeMillis();
//new WebDriverWait(driver, this.explicitWaitDefault)
//.until(ExpectedConditions.invisibilityOfAllElements(elements) );
//}
//    public void waitForElementToBeNotPresent(final By
//element, WebDriver driver) {
//long s = System.currentTimeMillis();
//new WebDriverWait(driver, this.explicitWaitDefault)
//.until(ExpectedConditions.not(ExpectedConditions.presenceOfAl lElementsLocatedBy(element)));
//}
//    public void waitUntilNestedElementPresent(WebElement
//element, By locator, WebDriver driver) {
//        new WebDriverWait(driver, explicitWaitDefault)
//.until(ExpectedConditions.presenceOfNestedElementLocatedBy(el ement, locator));
//} } 

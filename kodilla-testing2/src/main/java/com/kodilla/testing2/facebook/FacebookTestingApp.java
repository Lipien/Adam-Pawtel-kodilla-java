package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_BIRTHDAY_DAY = "//div[contains(@class,\"_5k_5\")]//*[contains(@id,\"day\")]";
    public static final String XPATH_BIRTHDAY_MONTH = "//div[contains(@class,\"_5k_5\")]//*[contains(@id,\"month\")]";
    public static final String XPATH_BIRTHDAY_YEAR = "//div[contains(@class,\"_5k_5\")]//*[contains(@id,\"year\")]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver((WebDriverConfig.CHROME));
        driver.get("https://www.facebook.com/");

        final WebElement birthdayDayCombo = driver.findElement(By.xpath(XPATH_BIRTHDAY_DAY));
        final Select birthdayDaySelect = new Select(birthdayDayCombo);
        birthdayDaySelect.selectByValue("2");

        final WebElement birthdayMonthCombo = driver.findElement(By.xpath(XPATH_BIRTHDAY_MONTH));
        final Select birthdayMonthSelect = new Select(birthdayMonthCombo);
        birthdayMonthSelect.selectByValue("11");

        final WebElement birthdayYearCombo = driver.findElement(By.xpath(XPATH_BIRTHDAY_YEAR));
        final Select birthdayYearSelect = new Select(birthdayYearCombo);
        birthdayYearSelect.selectByValue("1999");
    }
}

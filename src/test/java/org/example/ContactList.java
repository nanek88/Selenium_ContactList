package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class ContactList {
    WebDriver driver = new ChromeDriver();
    System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver.exe");
    driver.manage.window.maximize();
    driver.get("https://thinking-tester-contact-list.herokuapp.com/");
    WebElement email=driver.findElement(By.id("email"));
    WebElement password=driver.findElement(By.id("password"));
    WebElement submit=driver.findElement(By.id("submit"));
    email.sendKeys("mutap.kenan.sa@live.com");
    password.sendKeys("K3GDLwvRAt6N@@q");
    submit.click();
    String actualUrl="https://thinking-tester-contact-list.herokuapp.com/";
    String expectedUrl= driver.getCurrentUrl();
    Assert.assertEquals(expectedUrl, actualUrl);

    //Simillar approach would be with adding new contacts, where all fields will be populated and clicked
    //on Submit button

}


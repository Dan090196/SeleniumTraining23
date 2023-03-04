package Navegadores;

import org.junit.experimental.theories.Theories;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MiPrimerTest
{
    private WebDriver driver;

    @BeforeTest
    public void Setup()
    {
        //Se coloca la dirección del driver, según corresponda, (chrome, mozilla, edge...)
        System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver.exe");

        // Se crea la instancia u objeto del navegador
        driver = new ChromeDriver();

        //Maximiza el navegador
        driver.manage().window().maximize();

        //Enviamos la URL al navegador
        driver.get("https://demo.guru99.com/test/newtours/");
        driver.manage().deleteAllCookies();

    }

    @Test
    public void MiPrimerTest() throws InterruptedException
    {
        Thread.sleep(3000);
        WebElement demoSite = driver.findElement(By.id("site-name"));
        demoSite.click();
        Thread.sleep(3000);
        /*sendkeys se utiliza para enviar texto a los inputs
        inputSearch.sendKeys("Alexa");
        Thread.sleep(2000);
       //submit se utiliza para simular un enter
        inputSearch.submit();
        Thread.sleep(6000);*/
    }

    @AfterTest
    public void TearDown()
    {
        //Cierra el navegador
        driver.close();
        //no se quedará el chrome colgado
        driver.quit();
    }

}

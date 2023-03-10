package Interacciones;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.TreeMap;

public class Interacciones
{
    private WebDriver driver;

    @BeforeTest
    public void Setup() throws InterruptedException
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
        Thread.sleep(3000);
    }

    @Test
    public void Interacciones() throws InterruptedException
    {
        WebElement userName = driver.findElement(By.xpath("//input[@name='userName']"));
        userName.clear();
        userName.sendKeys("REGISTRO");
        Thread.sleep(3000);
        userName.clear();
        Thread.sleep(3000);
        userName.sendKeys("UserName");
        Thread.sleep(3000);

        WebElement submit = driver.findElement(By.name("submit"));
        submit.click();
        Thread.sleep(3000);
    }

    @AfterTest
    public void TearDown()
    {
        //Cierra el navegador
        driver.close();
        //Para cerrar instancia de chrome, desde administrador de tareas
        driver.quit();
    }
}

package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Locators
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
    public void Locators() throws InterruptedException
    {
        //***************** Localizar por "ID" *********************
        /*WebElement demoSite = driver.findElement(By.id("site-name"));
        demoSite.click();
        Thread.sleep(3000);*/

        //**************** Localizar por "Name" **********************
        /*WebElement userName = driver.findElement(By.name("userName"));
        //sendkeys se utiliza para enviar texto a los inputs
        userName.sendKeys("Automation23");
        Thread.sleep(3000);*/

        //**************** Localizar por "ClassName" ********************
        /*WebElement logo = driver.findElement(By.className("logo"));
        logo.click();
        Thread.sleep(3000);*/

        //**************** Localizador por "Link Text" *******************
        /*WebElement demoSite = driver.findElement(By.linkText("Demo Site"));
        demoSite.click();
        Thread.sleep(3000);*/

        //**************** Localizador por "Partial Link Text" *****************
        /*WebElement demoSite = driver.findElement(By.partialLinkText("Demo"));
        demoSite.click();
        Thread.sleep(3000);*/

        //*************** Localizador por "cssSelector" ********************
        /*WebElement userName = driver.findElement(By.cssSelector("input[name='userName']"));
        demoSite.click();
        demoSite.sendKeys("Automation23");
        Thread.sleep(3000);*/

        /*WebElement demoSite = driver.findElement(By.cssSelector("div#site-name"));
        demoSite.click();
        Thread.sleep(3000);*/

        /*WebElement demoSite = driver.findElement(By.cssSelector("#site-name"));
        demoSite.click();
        Thread.sleep(3000);*/

        /*WebElement userName = driver.findElement(By.cssSelector("input[type='text'][name='userName']"));
        userName.sendKeys("Automation23");
        Thread.sleep(3000);*/

        //**************** Localizador por "Xpath" *******************
        //Existen dos tipos de xpaths; que son: absoluto y relativo
        //El xpath absoluto por buenas practicas NO se debe utilizar o bien, NO abusar de el
        //Diferencias
        //El xpath absoluto es toda la ruta del elemento, es decir, la ubicación del mismo y su sintaxis inicia con una diagonal

        //*********** Xpath Absoluto **************
        /*WebElement userName = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input"));
        userName.sendKeys("Locura");
        Thread.sleep(3000);*/

        //*********** Xpath Relativo **************
        //El uso de xpath relativo inicia con doble // (diagonal)
        //El uso de xpath relativo se realiza por medio de los tags y atributos, entiendase que tags, son: img, 

        // 1 Atributo
        /*WebElement userName = driver.findElement(By.xpath("//input[@name='userName']"));
        userName.sendKeys("REGISTRO");
        Thread.sleep(3000);*/

        //2 Atributo
        WebElement demoSite = driver.findElement(By.xpath("//@[title='Home' and @styles='font-size:32px;']"));
        demoSite.click();
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

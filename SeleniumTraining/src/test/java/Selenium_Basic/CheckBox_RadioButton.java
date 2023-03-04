package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CheckBox_RadioButton
{
    private WebDriver driver;

    @BeforeTest
    public void Setup() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.seleniumeasy.com/basic-radiobutton-demo.html");
        driver.manage().deleteAllCookies();
        Thread.sleep(3000);
    }

    // Validar:
    // 1. Verificar que se muestre el elemento con el cual vamos a interactuar, antes de cualquier operacion
    // 2. Verificar que los radio button o check box esten habilitados
    // 3. Verificar que la seleccion predeterminada del boton, ya sea, radio o check

    @Test
    public void CheckAndRadio() throws InterruptedException
    {
       /*WebElement radioButtonMale = driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));
        radioButtonMale.click();
        Thread.sleep(3000);*/

        //isDisplayed(); --> lo que nos regresa es un valor booleano, si devuelve, verdadero, entonces
        // dicho boton esta presente, si es falso, entonces el boton no esta presente.
        /*WebElement radioButtonMale = driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));
        boolean statusDisplayed = radioButtonMale.isDisplayed();
        System.out.println("Status: " + statusDisplayed);
        radioButtonMale.click();
        Thread.sleep(3000);*/

        //isEnabled() --> lo que nos regresa es tambien un valor booleano, si devuelve verdadero, entonces,
        // el boton esta habilitado, si regresa falso, entonces el boton no esta presente.
        /*WebElement radioButtonMale = driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));
        boolean statusDisplayed = radioButtonMale.isDisplayed();
        radioButtonMale.click();
        Thread.sleep(3000);
        boolean statusEnabled = radioButtonMale.isEnabled();
        Thread.sleep(3000);
        System.out.println("Status Displayed: " + statusDisplayed);
        System.out.println("Status Enabled: " + statusEnabled);*/

        //isSelected(); -->lo que nos regresa es un valor booleano, si devuleve verdadero, entonces,
        //el boton ests seleccionada, si regresa falso, el boton no esta presente.
        WebElement radioButtonMale = driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));
        boolean statusDisplayed = radioButtonMale.isDisplayed();
        Thread.sleep(3000);

        boolean statusEnabled = radioButtonMale.isEnabled();
        Thread.sleep(3000);

        boolean statusSelected = radioButtonMale.isSelected();
        Thread.sleep(3000);

        System.out.println("Status Displayed: " + statusDisplayed);
        System.out.println("Status Enabled: " + statusEnabled);
        System.out.println("Status Selected: " + statusSelected);

        Thread.sleep(3000);

    }
    @AfterTest
    public void TearDown()
    {
        driver.close();
        driver.quit();
    }
}


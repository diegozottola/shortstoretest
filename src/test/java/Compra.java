

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URI;

public class Compra {
    public RemoteWebDriver firefoxDriver;

    @BeforeTest
    public void abrirDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setVersion("80.0");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);

         firefoxDriver = new RemoteWebDriver(

        URI.create("http://192.168.245.3:4444/wd/hub").toURL(),
                capabilities
        );
        firefoxDriver.manage().window().maximize();
    }



    @AfterTest
    public void cerrarDriver() {
        //Cerrar ventana, apagar driver
        firefoxDriver.quit();
    }
}
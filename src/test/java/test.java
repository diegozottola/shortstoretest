
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class test extends Compra{

    @Test
    public void hacer_una_compra() {
        //Abrimos una URL
        firefoxDriver.get("http://www.automationpractice.com/index.php");

        //Crear elementos Web
        WebElement labelSignIn = firefoxDriver.findElement(By.xpath("//*[@title='Log in to your customer account']"));
        labelSignIn.click();

        //Cargamos el campo de email
        WebElement campoEmail = firefoxDriver.findElement(By.cssSelector("#email"));
        campoEmail.sendKeys("juantor16@gmail.com");

        //Cargamos el campo de contraseña
        WebElement campoPassword = firefoxDriver.findElement(By.cssSelector("#passwd"));
        campoPassword.sendKeys("Argentina1");

        //Hacemos click en Sign in
        WebElement botonSignIn = firefoxDriver.findElement(By.cssSelector("#SubmitLogin"));
        botonSignIn.click();

        //Seleccionamos la pestaña de "T-shirts"
        WebElement etiquetaTshirts = firefoxDriver.findElement(By.xpath("//*[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[contains(text(),\"T-shirts\")]"));
        etiquetaTshirts.click();

        //Creamos una acción
        Actions action = new Actions(firefoxDriver);

        //Encontramos un elemento de la imagen que queremos comprar
        WebElement we = firefoxDriver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));

        //Movemos el cursor hacia el boton de agregar al carrito
        action.moveToElement(we).moveToElement(firefoxDriver.findElement(By.cssSelector(".ajax_add_to_cart_button.btn.btn-default"))).click().build().perform();

    }




}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicacifrado;

import io.appium.java_client.windows.WindowsDriver;
import java.net.MalformedURLException;
import java.net.URL;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

/**
 *
 * @author Dramirez
 */
public class PracticaCifradoTest {
    private WindowsDriver<RemoteWebElement> wd;
    
    
    public PracticaCifradoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "Windows"); 
        dc.setCapability("deviceName", "WindowsPC");
        dc.setCapability("app","C:\\Users\\Dramirez\\Documents\\PracticaCifrado\\PracticaDescifrado.exe");
        dc.setCapability("noReset", true);
        
        URL url = new URL("http://localhost:4723/wd/hub");
        wd = new WindowsDriver<>(url,dc);
    }
    
    @After
    public void tearDown() { // limpiando ejecucion
        wd.quit();
    }

    /**
     * Test of main method, of class PracticaCifrado.
     */
    @Test
    public void testMain() {
        RemoteWebElement rwe = wd.findElementByName("Algoritmos de cifrado");
        //rwe.sendKeys("Hola Mundo");
    }
    
}

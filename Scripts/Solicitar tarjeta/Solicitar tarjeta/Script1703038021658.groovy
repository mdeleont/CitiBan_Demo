import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.testobject.SelectorMethod as SelectorMethod
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.WebDriver as WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join
import org.testng.asserts.SoftAssert as SoftAssert
import com.kms.katalon.core.testdata.CSVData as CSVData
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.banamex.com/solicita-tu-tarjeta-credito-en-linea/index.html')

WebUI.click(findTestObject('Object Repository/Presencial/Page_Solicitud de Tarjeta de Crdito en Lnea_f35c3f/button_Continuar                           _1eb805'))

WebUI.click(findTestObject('Object Repository/Presencial/Page_Solicitud de Tarjeta de Crdito en Lnea_f35c3f/button_S'))

WebUI.setText(findTestObject('Object Repository/Presencial/Page_Solicitud de Tarjeta de Crdito en Lnea_f35c3f/input_Nombre(s)_informacion-personal-control-1'), 
    'Miguel')

WebUI.setText(findTestObject('Object Repository/Presencial/Page_Solicitud de Tarjeta de Crdito en Lnea_f35c3f/input_Primer Apellido_informacion-personal-_dab627'), 
    'De León')

WebUI.setText(findTestObject('Object Repository/Presencial/Page_Solicitud de Tarjeta de Crdito en Lnea_f35c3f/input_Segundo Apellido_informacion-personal_ab76c1'), 
    'Presencial')

WebUI.closeBrowser()


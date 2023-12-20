import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.banamex.com/seguros/seguro-de-auto-protegido.html')

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.waitForElementClickable(findTestObject('Cotizador de seguro de auto/Page_Seguro de Auto  Citibanamex/a_Cotiza en lnea'), 
    0)

WebUI.click(findTestObject('Cotizador de seguro de auto/Page_Seguro de Auto  Citibanamex/a_Cotiza en lnea'))

WebUI.switchToWindowTitle('Cotizador de Seguro de Auto | Citibanamex Chubb')

WebUI.waitForPageLoad(15)

WebUI.click(findTestObject('Object Repository/Cotizador de seguro de auto/Page_Cotizador de Seguro de Auto  Citibanam_8baf52/div_2019'))

WebUI.click(findTestObject('Object Repository/Cotizador de seguro de auto/Page_Cotizador de Seguro de Auto  Citibanam_8baf52/div_FORD'))

WebUI.click(findTestObject('Object Repository/Cotizador de seguro de auto/Page_Cotizador de Seguro de Auto  Citibanam_8baf52/div_MUSTANG'))

WebUI.click(findTestObject('Object Repository/Cotizador de seguro de auto/Page_Cotizador de Seguro de Auto  Citibanam_8baf52/div_MUSTANG ECOBOOST L4 IMP AUT 2 ABS CA CE_534915'))

WebUI.click(findTestObject('Object Repository/Cotizador de seguro de auto/Page_Cotizador de Seguro de Auto  Citibanam_8baf52/button_Continuar'))

WebUI.setText(findTestObject('Object Repository/Cotizador de seguro de auto/Page_Cotizador de Seguro de Auto  Citibanam_8baf52/input_Nombre(s)_mat-input-0'), 
    'Test Miguel')

WebUI.setText(findTestObject('Object Repository/Cotizador de seguro de auto/Page_Cotizador de Seguro de Auto  Citibanam_8baf52/input_Cdigo postal_mat-input-3'), 
    '55130')

WebUI.setText(findTestObject('Object Repository/Cotizador de seguro de auto/Page_Cotizador de Seguro de Auto  Citibanam_8baf52/input_Telfono_mat-input-1'), 
    '55 4433 2211')

WebUI.setText(findTestObject('Object Repository/Cotizador de seguro de auto/Page_Cotizador de Seguro de Auto  Citibanam_8baf52/input_Correo electrnico_mat-input-2'), 
    'test@outlook.com')

WebUI.click(findTestObject('Object Repository/Cotizador de seguro de auto/Page_Cotizador de Seguro de Auto  Citibanam_8baf52/label_Acepto   el   Aviso de Privacidad   y_407862'))

WebUI.closeBrowser()


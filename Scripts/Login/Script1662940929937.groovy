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

WebUI.navigateToUrl('https://www.sandbox.paypal.com/my/business')

WebUI.click(findTestObject('Object Repository/Login/Page_PayPal Business  Merchant Services for_0ffd0b/a_Log Masuk'))

WebUI.setText(findTestObject('Object Repository/Login/Page_Log masuk ke akaun PayPal anda/input_MY_login_email'), 'sb-5nuc4314643945@business.example.com')

WebUI.click(findTestObject('Object Repository/Login/Page_Log masuk ke akaun PayPal anda/button_Seterusnya'))

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_Log masuk ke akaun PayPal anda/input_Seterusnya_login_password'), 
    'Zaegf44StniHolX9QxciFQ==')

WebUI.click(findTestObject('Object Repository/Login/Page_Log masuk ke akaun PayPal anda/button_Log Masuk'))

WebUI.mouseOver(findTestObject('Object Repository/Login/Page_Home - PayPal/div_Total received'))

WebUI.mouseOver(findTestObject('Object Repository/Login/Page_Home - PayPal/div_Total sent or spent'))

WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_Home - PayPal/h2_Balance'), 'Balance')

WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_Home - PayPal/div_Insights'), 'Insights')


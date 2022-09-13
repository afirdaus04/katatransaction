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

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Transfer to Bank/Page_Home - PayPal/a_Transfer Money'))

WebUI.navigateToUrl('https://www.sandbox.paypal.com/fundstransfer/to')

WebUI.click(findTestObject('Object Repository/Transfer to Bank/Page_Funds Transfer/label_HSBC BANK MALAYSIA BERHADChecking  6277'))

WebUI.click(findTestObject('Object Repository/Transfer to Bank/Page_Funds Transfer/button_Next'))

WebUI.setText(findTestObject('Object Repository/Transfer to Bank/Page_Funds Transfer/input_Enter transfer amount_amount'), 
    '50.00')

WebUI.click(findTestObject('Object Repository/Transfer to Bank/Page_Funds Transfer/button_Next'))

WebUI.click(findTestObject('Object Repository/Transfer to Bank/Page_Funds Transfer/button_Transfer RM46.82 Now'))

WebUI.click(findTestObject('Object Repository/Transfer to Bank/Page_Funds Transfer/button_Done'))

WebUI.click(findTestObject('Object Repository/Transfer to Bank/Page_Money/div'))

WebUI.click(findTestObject('Object Repository/Transfer to Bank/Page_Money/a_Log out'))

WebUI.closeBrowser()


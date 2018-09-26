import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(url)

WebUI.navigateToUrl(url)

WebUI.setText(findTestObject('Object Repository/Page_Metafour User Login/input_Login_access_code'), accesscode)

WebUI.setText(findTestObject('Object Repository/Page_Metafour User Login/input_Login_login'), username)

WebUI.setText(findTestObject('Object Repository/Page_Metafour User Login/input_Login_j_password'), password)

WebUI.click(findTestObject('Object Repository/Page_Metafour User Login/button_Sign in'))

WebUI.delay(3)

WebUI.verifyElementNotPresent(findTestObject('Page_Metafour User Login/div_Sorry login failed'), 0)

WebUI.closeBrowser()


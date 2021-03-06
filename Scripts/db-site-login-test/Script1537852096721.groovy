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

WebUI.openBrowser(siteurl)

WebUI.navigateToUrl(siteurl)

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/itrack_obj/Page_iTrak2  Login/input_Username_loginFormuserId'), username)

WebUI.setText(findTestObject('Object Repository/itrack_obj/Page_iTrak2  Login/input_Password_loginFormpasswo'), password)

WebUI.click(findTestObject('Object Repository/itrack_obj/Page_iTrak2  Login/input_Password_loginFormidSubm'))

WebUI.delay(3)

WebUI.closeBrowser()



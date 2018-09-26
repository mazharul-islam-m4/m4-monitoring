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

WebUI.setText(findTestObject('Object Repository/ubook_obj/Page_UK Intranet  eCourier  uBook U/input_Staff number_txtUSCD'), username)
WebUI.setText(findTestObject('Object Repository/ubook_obj/Page_UK Intranet  eCourier  uBook U/input_Password_txtPASS'), password)
WebUI.click(findTestObject('Object Repository/ubook_obj/Page_UK Intranet  eCourier  uBook U/input_Password_btnSubmit'))

WebUI.delay(3)
WebUI.closeBrowser()


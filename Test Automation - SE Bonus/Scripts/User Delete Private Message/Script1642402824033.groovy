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

WebUI.navigateToUrl('http://localhost/moodle/login/index.php')

WebUI.setText(findTestObject('Object Repository/Page_Moodle Log in to the site/input_Username_username (40)'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Moodle Log in to the site/input_Password_password (40)'), 
    '8JanWqnBZBo6yBKKrpSnpw==')

WebUI.click(findTestObject('Object Repository/Page_Moodle Log in to the site/button_Log in (30)'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/i_See all_icon fa fa-comment fa-fw (2)'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/div_c H'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/p_hi'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/i__icon fa fa-trash fa-fw'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Delete'))


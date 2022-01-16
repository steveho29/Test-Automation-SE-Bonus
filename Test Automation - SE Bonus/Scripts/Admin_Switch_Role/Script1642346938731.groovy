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

WebUI.setText(findTestObject('Object Repository/1/Page_moodle Log in to the site/input_Username_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/1/Page_moodle Log in to the site/input_Password_password'), '8JanWqnBZBo6yBKKrpSnpw==')

WebUI.click(findTestObject('Object Repository/1/Page_moodle Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/1/Page_Dashboard/a_Admin User'))

WebUI.click(findTestObject('Object Repository/1/Page_Dashboard/span_Switch role to'))

WebUI.click(findTestObject('Object Repository/1/Page_Switch role to/button_Teacher'))

WebUI.click(findTestObject('Object Repository/1/Page_Dashboard/span_Site home'))

WebUI.click(findTestObject('Object Repository/1/Page_moodle/a_Test'))

WebUI.click(findTestObject('Object Repository/1/Page_Course Test/span_Announcements Forum'))

WebUI.click(findTestObject('Object Repository/1/Page_Announcements/a_Add a new topic'))

WebUI.setText(findTestObject('Object Repository/1/Page_Announcements/input_Subject_subject'), 'Thông báo')

WebUI.setText(findTestObject('Object Repository/1/Page_Announcements/div_Thng bo'), '<p dir="ltr" style="text-align: left;">Thông báo</p>')

WebUI.click(findTestObject('Object Repository/1/Page_Announcements/input_Message_submitbutton'))


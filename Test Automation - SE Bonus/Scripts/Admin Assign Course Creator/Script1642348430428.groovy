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

WebUI.setText(findTestObject('Object Repository/Page_Moodle Log in to the site/input_Username_username (13)'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Moodle Log in to the site/input_Password_password (13)'), 
    '8JanWqnBZBo6yBKKrpSnpw==')

WebUI.click(findTestObject('Object Repository/Page_Moodle Log in to the site/button_Log in (10)'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Site administration (10)'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Search/a_Users (6)'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Search/a_Assign system roles (2)'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Users Permission_6fdc16/a_Course creator'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Moodle Administration Users Permission_6fdc16/select_c H (hongocminhducgmail.com)    c H _8cfc97 (1)'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Users Permission_6fdc16/input_Match the search text anywhere in the_89f7b5 (1)'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Users Permission_6fdc16/a_Back to the list of all roles (2)'))


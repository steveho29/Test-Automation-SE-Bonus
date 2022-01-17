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

WebUI.callTestCase(findTestCase('Admin Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Dashboard/span_Site administration'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Search/a_Users (3)'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Search/a_Add a new user (2)'))

WebUI.setText(findTestObject('Object Repository/Page_Moodle Administration Users Accounts A_0fbd97/input_Username_username (2)'), 
    'minhduc')

WebUI.click(findTestObject('Page_Moodle Administration Users Accounts A_0fbd97/a_Click to enter text'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Moodle Administration Users Accounts A_0fbd97/input_New password_newpassword (2)'), 
    '8JanWqnBZBo6yBKKrpSnpw==')

WebUI.setText(findTestObject('Object Repository/Page_Moodle Administration Users Accounts A_0fbd97/input_First name_firstname (2)'), 
    'Đức')

WebUI.setText(findTestObject('Object Repository/Page_Moodle Administration Users Accounts A_0fbd97/input_Surname_lastname (2)'), 
    'Hồ')

WebUI.setText(findTestObject('Object Repository/Page_Moodle Administration Users Accounts A_0fbd97/input_Email address_email (2)'), 
    'hnmduc19@clc.fitus.edu.vn')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Moodle Administration Users Accounts A_0fbd97/select_Select a country.            Afghani_160506 (2)'), 
    'VN', true)

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Users Accounts A_0fbd97/input_Address_submitbutton (2)'))


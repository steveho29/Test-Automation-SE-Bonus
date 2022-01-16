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

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Site home (5)'))

WebUI.click(findTestObject('Object Repository/Page_Moodle/a_New Course Edited (4)'))

WebUI.click(findTestObject('Object Repository/Page_Course New Course Edited/i_New Course Edited_icon fa fa-cog fa-fw (4)'))

WebUI.click(findTestObject('Object Repository/Page_Course New Course Edited/a_More (4)'))

WebUI.click(findTestObject('Object Repository/Page_Course administration/a_Users (4)'))

WebUI.click(findTestObject('Object Repository/Page_Course administration/a_Other users'))

WebUI.click(findTestObject('Object Repository/Page_New Course Edited 0 other users/button_Assign roles'))

WebUI.click(findTestObject('Object Repository/Page_Assign roles in Course New Course Edited/a_Teacher'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Assign role Teacher in Course New Cour_04a7a0/select_c H (hongocminhducgmail.com)    c H _8cfc97'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Page_Assign role Teacher in Course New Cour_04a7a0/input_Match the search text anywhere in the_89f7b5'))

WebUI.click(findTestObject('Object Repository/Page_Assign role Teacher in Course New Cour_04a7a0/a_Back to the list of all roles'))


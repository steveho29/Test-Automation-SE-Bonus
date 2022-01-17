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

WebUI.callTestCase(findTestCase('Student Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Site home (8)'))

WebUI.click(findTestObject('Object Repository/Page_Moodle/a_New Course Edited (7)'))

WebUI.click(findTestObject('Object Repository/Page_Course New Course Edited/span_New Forum'))

WebUI.click(findTestObject('Object Repository/Page_New Forum/a_Add a new discussion topic'))

WebUI.setText(findTestObject('Object Repository/Page_New Forum/input_Subject_subject'), 'New discussion topic')

WebUI.click(findTestObject('Object Repository/Page_New Forum/div_Subject'))

WebUI.setText(findTestObject('Object Repository/Page_New Forum/input_Subject_subject'), 'New discussion topic')

WebUI.click(findTestObject('Object Repository/Page_New Forum/p'))

WebUI.setText(findTestObject('Object Repository/Page_New Forum/div_New discussion topic'), '<p dir="ltr" style="text-align: left; outline: rgb(255, 0, 0) solid 2px;" id="yui_3_17_2_1_1642383176173_510"><span style="font-size: 14.9262px;">New discussion topic</span><br></p>')

WebUI.click(findTestObject('Object Repository/Page_New Forum/input_New discussion topic_submitbutton'))


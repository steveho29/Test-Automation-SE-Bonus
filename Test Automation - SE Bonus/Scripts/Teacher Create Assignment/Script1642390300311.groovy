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

WebUI.callTestCase(findTestCase('Teacher Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Site home (17)'))

WebUI.click(findTestObject('Object Repository/Page_Moodle/a_New Course Edited (16)'))

WebUI.click(findTestObject('Object Repository/Page_Course New Course Edited/button_Turn editing on (1)'))

WebUI.click(findTestObject('Object Repository/Page_Course New Course Edited/span_Add an activity or resource (1)'))

WebUI.click(findTestObject('Object Repository/Page_Course New Course Edited/img_Recommended_icon icon'))

WebUI.setText(findTestObject('Object Repository/Page_Editing Assignment/input_Assignment name_name'), 'New Assignment')

WebUI.click(findTestObject('Object Repository/Page_Editing Assignment/input_Upon activity completion_submitbutton2'))


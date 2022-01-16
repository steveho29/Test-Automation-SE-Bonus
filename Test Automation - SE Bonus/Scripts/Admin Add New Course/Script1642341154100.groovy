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

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Site administration (5)'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Search/a_Courses (2)'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Search/a_Add a new course'))

WebUI.setText(findTestObject('Object Repository/Page_Moodle Add a new course/div_1 1'), '1 <p>1</p>')

WebUI.setText(findTestObject('Object Repository/Page_Moodle Add a new course/input_Course full name_fullname (1)'), 'New Course')

WebUI.setText(findTestObject('Object Repository/Page_Moodle Add a new course/input_Course short name_shortname (1)'), 'New Course')

WebUI.click(findTestObject('Object Repository/Page_Moodle Add a new course/span_ (1)'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Add a new course/li_New Category'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Moodle Add a new course/select_Miscellaneous            New Categor_201542'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Page_Moodle Add a new course/input__saveanddisplay'))


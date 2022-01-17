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

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Search/a_Courses (1)'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Search/a_Add a category (1)'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Add new category/span_'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Add new category/li_New Category'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Moodle Add new category/select_Top            Miscellaneous        _183c6c'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/Page_Moodle Add new category/input_Category name_name (1)'), 'Child Category')

WebUI.click(findTestObject('Object Repository/Page_Moodle Add new category/input_Description_submitbutton (1)'))


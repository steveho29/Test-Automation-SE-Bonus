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

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Search/img_c Minh_userpicture defaultuserpic'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Search/span_Profile'))

WebUI.click(findTestObject('Object Repository/Page_c Minh Public profile/a_Edit profile'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Edit profile/div_Surname'))

WebUI.setText(findTestObject('Object Repository/Page_Moodle Edit profile/input_Surname_lastname'), 'Hồ')

WebUI.click(findTestObject('Object Repository/Page_Moodle Edit profile/div_Email address_yui_3_17_2_1_1642339639116_856'))

WebUI.setText(findTestObject('Object Repository/Page_Moodle Edit profile/input_Email address_email'), 'hongocminhduc@gmail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Moodle Edit profile/select_Select a country.            Afghani_160506'), 
    'VN', true)

WebUI.sendKeys(findTestObject('Object Repository/Page_Moodle Edit profile/input_Address_submitbutton'), Keys.chord(Keys.ENTER))


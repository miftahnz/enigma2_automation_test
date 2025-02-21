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

WebUI.navigateToUrl('https://dev.enigmacamp.com/api/auth/login')

WebUI.setText(findTestObject('Object Repository/ForTryTesting/Page_Login - Enigmacamp Bootcamp 2.0/input_Masuk Dashboard_username'), 
    'user.auto.kwjky.56@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/ForTryTesting/Page_Login - Enigmacamp Bootcamp 2.0/input_Email_password'), 
    'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/ForTryTesting/Page_Login - Enigmacamp Bootcamp 2.0/button_Masuk'))

WebUI.click(findTestObject('Object Repository/ForTryTesting/Page_Enigma Camp - Dashboard/button_Saya mengerti'))

WebUI.click(findTestObject('Object Repository/ForTryTesting/Page_Enigma Camp - Dashboard/button_Pilih Jadwal TC'))

WebUI.click(findTestObject('Object Repository/ForTryTesting/Page_Enigma Camp - Metode Pembelajaran/button_Hadir beda sesi'))

//TestObject myObject = findTestObject('Object Repository/ForTryTesting/Page_Enigma Camp - Metode Pembelajaran/span_Sebelum melanjutkan, mohon konfirmasi _161a70')

WebUI.delay(3)
WebUI.click(findTestObject('Page_ProgramType/CustomCheckbox'))
WebUI.delay(3)
WebUI.click(findTestObject('Page_ProgramType/CustomCheckbox2'))
WebUI.delay(3)
WebUI.click(findTestObject('Page_ProgramType/CustomCheckbox3'))
WebUI.delay(3)
//
//WebUI.click(findTestObject('Object Repository/ForTryTesting/Page_Enigma Camp - Metode Pembelajaran/span_Sebelum melanjutkan, mohon konfirmasi _161a70'))
//
//WebUI.click(findTestObject('Object Repository/ForTryTesting/Page_Enigma Camp - Metode Pembelajaran/span_Sebelum melanjutkan, mohon konfirmasi _161a70'))


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
// ========================================
// 				USER LOGIN
// ========================================
WebUI.navigateToUrl('https://staging.enigmacamp.com/api/auth/login')
WebUI.setText(findTestObject('Object Repository/Page_Profile/input_Masuk Dashboard_username'), 'user.auto.kgmgr.850@yopmail.com')
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Profile/input_Email_password'), 'iFGeFYmXIrUhQZHvW7P22w==')
WebUI.click(findTestObject('Object Repository/Page_Profile/button_Masuk'))
WebUI.click(findTestObject('Object Repository/Page_Profile/button_Saya mengerti'))

// ========================================
// 				FILL PROFILE
// ========================================
WebUI.click(findTestObject('Object Repository/Page_Profile/button_Lengkapi data diri'))
WebUI.click(findTestObject('Object Repository/Page_Profile/button_Ubah Profil'))

// FILL NIK
WebUI.setText(findTestObject('Object Repository/Page_Profile/input__float-input ng-untouched ng-pristine_613cdb'), '7289992828276262')

// DROPDOWN GENDER
WebUI.click(findTestObject('Object Repository/Page_Profile/div_Pilih Jenis Kelamin'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Page_Profile/dropdown_gender_male'))

// DROPDOWN EDUCATION
WebUI.click(findTestObject('Object Repository/Page_Profile/input__float-input ng-untouched ng-pristine_613cdb'))
WebUI.click(findTestObject('Object Repository/Page_Profile/dropdown_education_graduate'))

// DROPDOWN MARITAL STATUS
WebUI.click(findTestObject('Object Repository/Page_Profile/input__float-input ng-untouched ng-pristine_613cdb'))
WebUI.click(findTestObject('Object Repository/Page_Profile/div_Lajang'))

// FILL BIRTH PLACE
WebUI.setText(findTestObject('Object Repository/Page_Profile/input__float-input ng-untouched ng-pristine_613cdb'), 'BEKASI')

// FILL CITY KTP
WebUI.click(findTestObject('Object Repository/Page_Profile/div_Pilih Kota Domisili'))

// DROPDOWN DOMISILI
WebUI.click(findTestObject('Object Repository/Page_Profile/input__float-input ng-untouched ng-pristine_613cdb'))

// UPLOAD PROFILE
WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Profile/input_Ubah_upload'))

// SUBMIT PROFILE
WebUI.click(findTestObject('Object Repository/Page_Profile/button_Simpan Profil'))

WebUI.closeBrowser()


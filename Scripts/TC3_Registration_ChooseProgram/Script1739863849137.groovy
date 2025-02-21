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

// =========================================
// Call Test Case Login
// =========================================
//WebUI.callTestCase(findTestCase('TC2_Login_ValidCredential'), [:], FailureHandling.STOP_ON_FAILURE)
// Buka browser dan navigasi ke halaman login
//WebUI.openBrowser('')
//WebUI.navigateToUrl('https://dev.enigmacamp.com/api/auth/login')
//WebUI.maximizeWindow()
// Verifikasi elemen penting di halaman login
//TestObject loginImage = findTestObject('Page_Login/img')
//TestObject loginLabel = findTestObject('Page_Login/label_Masuk Dashboard')
//
//WebUI.verifyElementVisible(loginImage)
//WebUI.verifyElementVisible(loginLabel)
// Ambil email dari GlobalVariable atau minta input jika kosong
//String email = GlobalVariable.registeredEmail.isBlank() ?
//	JOptionPane.showInputDialog('Masukkan email:') :
//	GlobalVariable.registeredEmail
//
//// Input email dan password
//WebUI.setText(findTestObject('Page_Login/input_username'), email)
//WebUI.setEncryptedText(findTestObject('Page_Login/input_password'), 'iFGeFYmXIrUhQZHvW7P22w==')
//
//// Klik tombol login
//WebUI.click(findTestObject('Page_Login/button_login'))
// =========================================
//WebUI.delay(5)

//WebUI.verifyElementText(findTestObject('Object Repository/strong_Selamat datang di laman IT Bootcamp _95e55d'), 'Selamat datang di laman IT Bootcamp Enigma Camp.')

//WebUI.verifyElementClickable(findTestObject('Page_Dashboard/button_ChooseProgram'))

def ChooseProgramType() {
	WebUI.click(findTestObject('Page_Dashboard/button_ChooseProgram'))
	WebUI.click(findTestObject('Page_ProgramType/button_ChooseOnlineClass'))
	WebUI.click(findTestObject('Page_ProgramType/button_Yes_OnlineClass'))
}

boolean isProgramSelected = WebUI.verifyElementVisible(findTestObject('Page_Dashboard/button_Pilih Jadwal TC'), FailureHandling.OPTIONAL)

if(!isProgramSelected) {
	def buttonSeeSchedule = findTestObject('Page_ProgramType/button_SeeSchedule')
	
	if(!WebUI.verifyElementVisible(buttonSeeSchedule, FailureHandling.OPTIONAL)) {
		ChooseProgramType()
	}
	
	WebUI.click(buttonSeeSchedule)
	
	WebUI.click(findTestObject('Page_ProgramType/button_SelectSchedule'))
} else {
	WebUI.click(findTestObject('Page_Dashboard/button_Pilih Jadwal TC'))
}

WebUI.click(findTestObject('Page_ProgramType/button_SkipTnc'))

WebUI.click(findTestObject('Page_ProgramType/CustomCheckbox'))
WebUI.click(findTestObject('Page_ProgramType/CustomCheckbox2'))
WebUI.click(findTestObject('Page_ProgramType/CustomCheckbox3'))

WebUI.click(findTestObject('Page_ProgramType/button_SendConfirmationTnc'))

WebUI.click(findTestObject('Page_Dashboard/button_Understand'))


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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import javax.swing.JOptionPane as JOptionPane

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev.enigmacamp.com/api/auth/login')

WebUI.maximizeWindow()

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Login - Enigmacamp Bootcamp 2.0/img'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Login - Enigmacamp Bootcamp 2.0/label_Masuk Dashboard'))

String email = GlobalVariable.registeredEmail

if(email.isBlank()) {
	email = JOptionPane.showInputDialog('Masukkan email:')
}

WebUI.setText(findTestObject('Object Repository/Page_Login - Enigmacamp Bootcamp 2.0/input_username'), email)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - Enigmacamp Bootcamp 2.0/input_password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/Page_Login - Enigmacamp Bootcamp 2.0/button_login'))

TestObject buttonSayaMengerti = findTestObject('Page_Enigma Camp - Dashboard/button_Saya mengerti')

if (WebUI.waitForElementPresent(buttonSayaMengerti, 5)) {
    WebUI.click(buttonSayaMengerti)

    WebUI.comment('Popup muncul, tombol diklik.')
}

WebUI.click(findTestObject('Object Repository/Page_Enigma Camp - Dashboard/span_User Automation Dev'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Enigma Camp - Dashboard/span_User Automation Dev'), 'User Automation Dev!')


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
import java.util.Random as Random
import javax.swing.JOptionPane as JOptionPane

def firstNames = ['Ahmad', 'Budi', 'Citra', 'Diana', 'Faris']

def lastNames = ['Sutanto', 'Ariani', 'Pratama', 'Rini', 'Sakti']

Random random = new Random()

def randomFirstName = firstNames[random.nextInt(firstNames.size())]

def randomLastName = lastNames[random.nextInt(lastNames.size())]

def randomFullName = (randomFirstName + ' ') + randomLastName

def randomEmail = (((randomFirstName.toLowerCase() + '.') + randomLastName.toLowerCase()) + random.nextInt(900)) + '@gmail.com'

def randomPhoneNumber = '08' + (100000000 + random.nextInt(900000000))

GlobalVariable.registeredEmail = randomEmail

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://dev.enigmacamp.com/api/auth/register')

WebUI.setText(findTestObject('Object Repository/Page_Register - Enigmacamp Bootcamp 2.0/input_Daftar Akun Baru_fullname'), 
    randomFullName)

WebUI.setText(findTestObject('Object Repository/Page_Register - Enigmacamp Bootcamp 2.0/input_Nama Lengkap_email'), randomEmail)

WebUI.setText(findTestObject('Object Repository/Page_Register - Enigmacamp Bootcamp 2.0/input_Email_phone'), randomPhoneNumber)

WebUI.setText(findTestObject('Object Repository/Page_Register - Enigmacamp Bootcamp 2.0/input_No Telepon_birthdate'), '')

WebUI.click(findTestObject('Object Repository/Page_Register - Enigmacamp Bootcamp 2.0/input_No Telepon_birthdate'))

WebUI.click(findTestObject('Object Repository/Page_Register - Enigmacamp Bootcamp 2.0/td_6'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register - Enigmacamp Bootcamp 2.0/input_Tanggal Lahir_password'), 
    'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/Page_Register - Enigmacamp Bootcamp 2.0/button_Kata Sandi_btn-ghost'))

WebUI.click(findTestObject('Object Repository/Page_Register - Enigmacamp Bootcamp 2.0/i_Kata Sandi_hide_eye'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register - Enigmacamp Bootcamp 2.0/input_Kata Sandi_cpassword'), 
    'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/Page_Register - Enigmacamp Bootcamp 2.0/i_(Opsional)_check-iconFailed'))

WebUI.click(findTestObject('Object Repository/Page_Register - Enigmacamp Bootcamp 2.0/i_Setujui syarat dan ketentuan untuk bergab_cd416e'))

WebUI.scrollToElement(findTestObject('Page_Register - Enigmacamp Bootcamp 2.0/a_Syarat dan Ketentuan Privy'), 5)

WebUI.click(findTestObject('Object Repository/Page_Register - Enigmacamp Bootcamp 2.0/button_Ya, saya setuju'))

// Manual Input untuk Captcha
String userInput = JOptionPane.showInputDialog('Masukkan nilai untuk melanjutkan:')

println('Input yang diberikan: ' + userInput)

WebUI.setText(findTestObject('Page_Register - Enigmacamp Bootcamp 2.0/input_Setujui syarat dan ketentuan untuk be_d95a67'), 
    userInput)

WebUI.click(findTestObject('Object Repository/Page_Register - Enigmacamp Bootcamp 2.0/button_Submit'))

WebUI.click(findTestObject('Page_Register - Enigmacamp Bootcamp 2.0/img_Ya, saya setuju_hide-modal-success-register'))

WebUI.click(findTestObject('Page_Register - Enigmacamp Bootcamp 2.0/a_Sudah memiliki akun  Sign In'))


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
import java.io.File as File
import java.io.FileWriter as FileWriter

// ==========================
// STEP 1: Generate User Data
// ==========================
Random random = new Random()

def firstNames = ['Ahmad', 'Budi', 'Citra', 'Diana', 'Faris']
def lastNames = ['Sutanto', 'Ariani', 'Pratama', 'Rini', 'Sakti']

String randomFirstName = firstNames[random.nextInt(firstNames.size())]
String randomLastName = lastNames[random.nextInt(lastNames.size())]
String randomFullName = "${randomFirstName} ${randomLastName}"
String randomEmail = "${randomFirstName.toLowerCase()}.${randomLastName.toLowerCase()}${random.nextInt(900)}@yopmail.com"
String randomPhoneNumber = "08${100000000 + random.nextInt(900000000)}"

// =========================================
// STEP 2: Open Browser & Navigate to Page
// =========================================
WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('https://dev.enigmacamp.com/api/auth/register')

// ========================================
// STEP 3: Fill in Registration Form
// ========================================
WebUI.setText(findTestObject('Page_Register/input_Fullname'), randomFullName)
WebUI.setText(findTestObject('Page_Register/input_Email'), randomEmail)
WebUI.setText(findTestObject('Page_Register/input_PhoneNumber'), randomPhoneNumber)

// Set Birthdate
WebUI.click(findTestObject('Page_Register/input_Birthdate'))
WebUI.click(findTestObject('Page_Register/td_6'))

// ========================================
// STEP 4: Set Password
// ========================================
String encryptedPassword = 'iFGeFYmXIrUhQZHvW7P22w=='

WebUI.setEncryptedText(findTestObject('Page_Register/input_Password'), encryptedPassword)
WebUI.click(findTestObject('Page_Register/button_Kata Sandi_btn-ghost'))
WebUI.click(findTestObject('Page_Register/i_Kata Sandi_hide_eye'))
WebUI.setEncryptedText(findTestObject('Page_Register/input_Kata Sandi_cpassword'), encryptedPassword)

// ========================================
// STEP 5: Accept Terms & Conditions
// ========================================
WebUI.click(findTestObject('Page_Register/i_(Opsional)_check-iconFailed'))
WebUI.click(findTestObject('Page_Register/checkbox_Tnc'))
WebUI.scrollToElement(findTestObject('Page_Register/link_TermsAndConditions'), 5)
WebUI.click(findTestObject('Page_Register/button_TncAgree'))

// ========================================
// STEP 6: Manual CAPTCHA Input
// ========================================
String userInput = JOptionPane.showInputDialog('Masukkan Captcha untuk melanjutkan:')
WebUI.setText(findTestObject('Page_Register/input_Captcha'), userInput)

// ========================================
// STEP 7: Submit Registration
// ========================================
WebUI.click(findTestObject('Page_Register/button_Submit'))

// ========================================
// STEP 8: Activate Account
// ========================================
JOptionPane.showInputDialog('Klik OK jika kamu sudah konfirmasi email secara manual')
WebUI.click(findTestObject('Page_Register/button_CloseDialogActivation'))

// ========================================
// STEP 9: Save Registered Email
// ========================================
GlobalVariable.registeredEmail = randomEmail

String filePath = 'Data Files/generated_emails.csv'
File file = new File(filePath)
boolean isNewFile = !file.exists()
FileWriter writer = new FileWriter(file, true)

if (isNewFile) {
	writer.append('Email\n') // Add header if new file
}

writer.append(randomEmail + '\n')
writer.flush()
writer.close()
println("Email saved: ${randomEmail}")

// ========================================
// STEP 10: Close Browser
// ========================================
WebUI.closeBrowser()

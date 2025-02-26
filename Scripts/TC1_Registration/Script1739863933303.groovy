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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

// ==========================
// STEP 1: Generate User Data
// ==========================
Random random = new Random()
String randomFullName = "User Auto " + RandomStringUtils.randomAlphabetic(5)
String randomEmail = "${randomFullName.toLowerCase().replaceAll(" ", ".")}.${random.nextInt(900)}@yopmail.com"
String randomPhoneNumber = "08${100000000 + random.nextInt(900000000)}"

// =========================================
// STEP 2: Open Browser & Navigate to Page
// =========================================
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl("$GlobalVariable.BASE_URL/register")

// ========================================
// STEP 3: Fill in User Credentials
// ========================================
WebUI.setText(findTestObject('Page_Register/input_Fullname'), randomFullName)

WebUI.setText(findTestObject('Page_Register/input_Email'), randomEmail)

WebUI.setText(findTestObject('Page_Register/input_PhoneNumber'), randomPhoneNumber)

// ========================================
// STEP 4: Set BirthDate
// ========================================
WebUI.click(findTestObject('Page_Register/input_Birthdate'))

WebUI.click(findTestObject('Page_Register/td_6'))

// ========================================
// STEP 5: Set Password
// ========================================
String encryptedPassword = 'iFGeFYmXIrUhQZHvW7P22w=='

WebUI.setEncryptedText(findTestObject('Page_Register/input_Password'), encryptedPassword)

//WebUI.click(findTestObject('Page_Register/button_CloseConfirmationTnc'))
//WebUI.click(findTestObject('Page_Register/button_PasswordHide'))
WebUI.setEncryptedText(findTestObject('Page_Register/input_PasswordConfirmation'), encryptedPassword)

// ========================================
// STEP 6: Accept Terms & Conditions
// ========================================
WebUI.click(findTestObject('Page_Register/i_(Opsional)_check-iconFailed'))

WebUI.click(findTestObject('Page_Register/checkbox_Tnc'))

WebUI.scrollToElement(findTestObject('Page_Register/link_TermsAndConditions'), 5)

def buttonAgree = findTestObject('Page_Register/button_TncAgree')

WebUI.waitForElementPresent(findTestObject('Page_Register/button_TncAgree'), 3)

WebUI.click(buttonAgree)

int maxAttempt = 3

for (int attempt = 0; attempt < maxAttempt; attempt++) {
    inputManualCaptcha()

    WebUI.click(findTestObject('Page_Register/button_Submit'))

    WebUI.waitForElementVisible(findTestObject('Page_Register/text_EmailVerification'), 3)

    if (WebUI.verifyElementVisible(findTestObject('Page_Register/text_EmailVerification'), FailureHandling.CONTINUE_ON_FAILURE)) {
        WebUI.comment('Captcha berhasil diverifikasi.')

        break
    }
    
    // ========================================
    // STEP 9: Re-Chaptcha
    // ========================================
	WebUI.comment("Captcha salah, mencoba ulang... (${attempt + 1}/${maxAttempt})")

    WebUI.click(findTestObject('Page_Register/button_RefreshCaptcha'))
}

WebUI.comment("Gagal memvalidasi captcha setelah $maxAttempt percobaan.")

// ========================================
// STEP 10: Activate Account
// ========================================
int activateAccount = JOptionPane.showConfirmDialog(null, 'Apakah Anda sudah melakukan Aktivation melalui Email?', 'Konfirmasi', 
    JOptionPane.YES_NO_OPTION)

if (activateAccount == JOptionPane.YES_OPTION) {
    WebUI.click(findTestObject('Page_Register/button_CloseDialogActivation'))

    // ========================================
    // STEP 11: Save Registered Email After User Confirm Email
    // ========================================
    GlobalVariable.registeredEmail = randomEmail

    String filePath = 'Data Files/generated_emails.csv'

    File file = new File(filePath)

    boolean isNewFile = !(file.exists())

    FileWriter writer = new FileWriter(file, true)

    if (isNewFile) {
        writer.append('Email\n' // Add header if new file
            )
    }
    
    writer.append(randomEmail + '\n')

    writer.flush()

    writer.close()

    println("Email saved: $randomEmail")
} else {
    WebUI.comment('User memilih NO')
}

WebUI.closeBrowser()

def inputManualCaptcha() {
    String userInput = JOptionPane.showInputDialog('Masukkan Captcha untuk melanjutkan:')

    WebUI.setText(findTestObject('Page_Register/input_Captcha'), userInput)
}


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
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
// Path ke file JPG di komputer Anda
//String filePath = "C:\\Users\\Miptah\\Downloads\\profile.jpg"
//WebUI.click(findTestObject('Page_PersonalData/Page_Enigma Camp - Dashboard/input_Ubah_upload'))
//
//// Upload file ke elemen input file
//WebUI.uploadFile(findTestObject('Page_PersonalData/Page_Enigma Camp - Dashboard/input_Ubah_upload'), filePath)
//import org.openqa.selenium.WebElement
//import org.openqa.selenium.By
//import com.kms.katalon.core.webui.driver.DriverFactory
//
//String filePath = "C:\\Users\\Miptah\\Downloads\\profile.jpg"
//
//WebElement uploadElement = DriverFactory.getWebDriver().findElement(By.xpath("//input[@type='file']"))
//uploadElement.sendKeys(filePath)
import java.awt.*
import java.awt.datatransfer.StringSelection as StringSelection
import java.awt.event.KeyEvent as KeyEvent

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev.enigmacamp.com/api/auth/login?message=sessionExpired')

WebUI.setText(findTestObject('Object Repository/Page_PersonalData/Page_Login - Enigmacamp Bootcamp 2.0/input_Masuk Dashboard_username'), 
    'user.auto.nksmd.277@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_PersonalData/Page_Login - Enigmacamp Bootcamp 2.0/input_Email_password'), 
    'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/Page_PersonalData/Page_Login - Enigmacamp Bootcamp 2.0/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Page_PersonalData/Page_Enigma Camp - Dashboard/button_Saya mengerti'))

WebUI.click(findTestObject('Object Repository/Page_PersonalData/Page_Enigma Camp - Dashboard/button_Lengkapi data diri'))

WebUI.click(findTestObject('Object Repository/Page_PersonalData/Page_Enigma Camp - Dashboard/button_Ubah Profil'))

// Klik tombol upload (yang membuka File Explorer)
WebUI.click(findTestObject('Object Repository/Page_Dashboard/button_Upload'))

// Delay untuk memastikan File Explorer terbuka
WebUI.delay(2)

// Path file yang akan di-upload
String imagePath = 'C:\\Users\\Miptah\\Downloads\\profile.jpg'

// Copy path file ke clipboard
StringSelection selection = new StringSelection(imagePath)

Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null)

// Gunakan Robot Class untuk menempelkan path & tekan ENTER
Robot robot = new Robot()

robot.keyPress(KeyEvent.VK_CONTROL)

robot.keyPress(KeyEvent.VK_V)

robot.keyRelease(KeyEvent.VK_V)

robot.keyRelease(KeyEvent.VK_CONTROL)

robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_ENTER)

// Tunggu proses upload selesai
WebUI.delay(3)

// ============================================
// Fill NIK
WebUI.setText(findTestObject('Object Repository/Page_PersonalData/Page_Enigma Camp - Dashboard/input_Ubah_upload'), '7289998910100092')

WebUI.click(findTestObject('Object Repository/Page_PersonalData/Page_Enigma Camp - Dashboard/div_Pilih Jenis Kelamin'))

WebUI.click(findTestObject('Object Repository/Page_PersonalData/Page_Enigma Camp - Dashboard/div_Laki-laki'))

WebUI.click(findTestObject('Object Repository/Page_PersonalData/Page_Enigma Camp - Dashboard/input_Ubah_upload'))

WebUI.click(findTestObject('Object Repository/Page_PersonalData/Page_Enigma Camp - Dashboard/div_Lulus Kuliah'))

WebUI.click(findTestObject('Object Repository/Page_PersonalData/Page_Enigma Camp - Dashboard/input_Ubah_upload'))

WebUI.click(findTestObject('Object Repository/Page_PersonalData/Page_Enigma Camp - Dashboard/div_Lajang'))

WebUI.setText(findTestObject('Object Repository/Page_PersonalData/Page_Enigma Camp - Dashboard/input_Ubah_upload'), 'BOGOR')

WebUI.click(findTestObject('Object Repository/Page_PersonalData/Page_Enigma Camp - Dashboard/div_BOGOR'))

not_run: WebUI.click(findTestObject('Object Repository/Page_PersonalData/Page_Enigma Camp - Dashboard/button_Simpan Profil'))

not_run: WebUI.click(findTestObject('Object Repository/Page_PersonalData/Page_Enigma Camp - Dashboard/b_Lewati'))

not_run: WebUI.click(findTestObject('Object Repository/Page_PersonalData/Page_Enigma Camp - Dashboard/button_Ya'))


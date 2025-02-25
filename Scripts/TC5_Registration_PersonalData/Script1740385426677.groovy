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


WebUI.click(findTestObject('Object Repository/button_Lengkapi data diri'))

WebUI.verifyElementClickable(findTestObject('Object Repository/button_Ubah Profil'))

WebUI.click(findTestObject('Object Repository/button_Ubah Profil'))

WebUI.setText(findTestObject('Object Repository/input__float-input ng-untouched ng-pristine_613cdb'), '')

WebUI.click(findTestObject('Object Repository/input__float-input ng-untouched ng-pristine_613cdb'))

WebUI.click(findTestObject('Object Repository/div_Laki-laki'))

WebUI.click(findTestObject('Object Repository/div_Pilih Pendidikan Terakhir'))

WebUI.click(findTestObject('Object Repository/div_Lulus Kuliah'))

WebUI.click(findTestObject('Object Repository/input__float-input ng-untouched ng-pristine_613cdb'))

WebUI.click(findTestObject('Object Repository/div_Lajang'))

WebUI.setText(findTestObject('Object Repository/input__float-input ng-untouched ng-pristine_613cdb'), 'BO')

WebUI.click(findTestObject('Object Repository/div_BOGOR'))

WebUI.click(findTestObject('Object Repository/button_Simpan Profil'))
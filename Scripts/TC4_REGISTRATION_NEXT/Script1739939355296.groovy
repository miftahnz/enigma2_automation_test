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



WebUI.waitForElementVisible(findTestObject('Object Repository/text_TncSchedule'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/button_Lihat Jadwal'))

WebUI.click(findTestObject('Object Repository/button_Lihat Jadwal'))

WebUI.verifyElementClickable(findTestObject('Object Repository/button_Pilih jadwal'))

WebUI.click(findTestObject('Object Repository/button_Pilih jadwal'))

WebUI.click(findTestObject('Object Repository/button_SkipTnc'))

WebUI.click(findTestObject('Object Repository/span_Sebelum melanjutkan, mohon konfirmasi _161a70'))

WebUI.click(findTestObject('Object Repository/span_Sebelum melanjutkan, mohon konfirmasi _161a70'))

WebUI.click(findTestObject('Object Repository/span_Sebelum melanjutkan, mohon konfirmasi _161a70'))

WebUI.click(findTestObject('Object Repository/button_Kirim'))

WebUI.waitForElementVisible(findTestObject('Object Repository/h5_Panduan TC'), 0)

WebUI.click(findTestObject('Object Repository/button_Saya mengerti'))

WebUI.click(findTestObject('Object Repository/a_Selengkapnya'))

WebUI.click(findTestObject('Object Repository/img_JENIS PROGRAM_pointer'))

WebUI.verifyElementClickable(findTestObject('Object Repository/button_Pilih materi belajar'))

WebUI.click(findTestObject('Object Repository/button_Pilih materi belajar'))

WebUI.click(findTestObject('Object Repository/button_Pilih'))

WebUI.click(findTestObject('Object Repository/button_Ya'))

WebUI.click(findTestObject('Object Repository/a_Selengkapnya'))

WebUI.click(findTestObject('Object Repository/img_JENIS PROGRAM_pointer'))

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

WebUI.verifyElementClickable(findTestObject('Object Repository/b_Lewati'))

WebUI.verifyElementClickable(findTestObject('Object Repository/button_Mulai'))

WebUI.click(findTestObject('Object Repository/a_Selengkapnya'))

WebUI.click(findTestObject('Object Repository/img_JENIS PROGRAM_pointer'))

WebUI.click(findTestObject('Object Repository/b_Lewati'))

WebUI.click(findTestObject('Object Repository/button_Ya'))

WebUI.click(findTestObject('Object Repository/a_Selengkapnya'))

WebUI.click(findTestObject('Object Repository/img_JENIS PROGRAM_pointer'))

WebUI.click(findTestObject('Object Repository/button_Perjanjian  kontrak'))

WebUI.click(findTestObject('Object Repository/button_Unduh berkas kontrak'))

WebUI.click(findTestObject('Object Repository/input_Swafoto (selfie)_inputSelfie'))

WebUI.verifyElementClickable(findTestObject('Object Repository/button_Kirim File'))

WebUI.click(findTestObject('Object Repository/button_Kirim File'))

WebUI.waitForElementVisible(findTestObject('Object Repository/button_Buat link'), 0)

WebUI.click(findTestObject('Object Repository/button_Buat link'))

WebUI.click(findTestObject('Object Repository/svg_Pemberitahuan_svg-inline--fa fa-sort-do_127c02'))

WebUI.click(findTestObject('Object Repository/img_Pemberitahuan_img-fluid img-logo-user r_b38fbf'))

WebUI.click(findTestObject('Object Repository/button_Keluar'))

WebUI.closeBrowser()
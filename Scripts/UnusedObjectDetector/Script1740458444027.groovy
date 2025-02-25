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
import com.kms.katalon.core.testobject.ObjectRepository
import groovy.io.FileType
import com.kms.katalon.core.configuration.RunConfiguration

// Ambil daftar semua test object di Object Repository
def objectDir = new File(RunConfiguration.getProjectDir() + "/Object Repository/Page_Register")
def allObjects = []

objectDir.eachFileRecurse(FileType.FILES) { file ->
	if (file.name.endsWith('.rs')) {
		allObjects << file.name.replace('.rs', '')
	}
}

// Cari objek yang digunakan di test case dan test suite
def usedObjects = []
def scriptDir = new File(RunConfiguration.getProjectDir() + "/Scripts")

scriptDir.eachFileRecurse(FileType.FILES) { file ->
	if (file.name.endsWith('.groovy')) {
		def content = file.text
		allObjects.each { obj ->
			if (content.contains("findTestObject('$obj')")) {
				usedObjects << obj
			}
		}
	}
}

// Objek yang tidak dipakai
def unusedObjects = allObjects - usedObjects

// Print hasil
println "🔍 Objek yang tidak digunakan di Test Cases:"
unusedObjects.each { println it }

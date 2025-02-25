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
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import org.openqa.selenium.WebElement

// =========================================
// STEP 1: Choose Program Type
// =========================================
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

// =========================================
// STEP 2: Select TNC Schedule
// =========================================
	WebUI.click(buttonSeeSchedule)
	
	WebUI.click(findTestObject('Page_ProgramType/button_SelectSchedule'))
} else {
	WebUI.click(findTestObject('Page_Dashboard/button_Pilih Jadwal TC'))
}

// =========================================
// STEP 3: Skip TNC
// =========================================
WebUI.click(findTestObject('Page_ProgramType/button_SkipTnc'))
List<WebElement> elements = WebUiCommonHelper.findWebElements(findTestObject('Page_ProgramType/CustomCheckbox'), 10)
for (int i = 0; i < Math.min(3, elements.size()); i++) {
	elements.get(i).click()
}
WebUI.click(findTestObject('Page_ProgramType/button_SendConfirmationTnc'))

WebUI.click(findTestObject('Page_Dashboard/button_Understand'))


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



WebUI.openBrowser('')

WebUI.navigateToUrl('https://gredu.sowat.dev/auth')

WebUI.setText(findTestObject('Object Repository/input_atau_credential'), username)

WebUI.setText(findTestObject('Object Repository/input_atau_pin'), password)

WebUI.click(findTestObject('Object Repository/span_Masuk'))

//WebUI.click(findTestObject('Page_Classroom  GREDU/svg'))
//
//WebUI.setText(findTestObject('Object Repository/input_Nama Kelas_name'), nama_kelas)
//
//WebUI.setText(findTestObject('Object Repository/input_Mata Pelajaran_subject'), 'katalon')
//
//WebUI.click(findTestObject('div_Tambah'))
//
//WebUI.click(findTestObject('Object Repository/input_Anak apel lima_ant-checkbox-input'))
//
//WebUI.click(findTestObject('Object Repository/span_Simpan'))
//
//WebUI.click(findTestObject('Object Repository/span_Buat Kelas'))
nama_kelas = "Kelas"

for (int i = 40; i < 50; i++) {
	
	WebUI.click(findTestObject('Page_Classroom  GREDU/svg'))
	
	WebUI.setText(findTestObject('Object Repository/input_Nama Kelas_name'), nama_kelas+" "+i)
	
	WebUI.setText(findTestObject('Object Repository/input_Mata Pelajaran_subject'), 'katalon')
	
	WebUI.click(findTestObject('div_Tambah'))
	
	WebUI.click(findTestObject('Object Repository/input_Anak apel lima_ant-checkbox-input'))
	
	WebUI.click(findTestObject('Object Repository/span_Simpan'))
	
	WebUI.click(findTestObject('Object Repository/span_Buat Kelas'))
	
}

WebUI.closeBrowser()


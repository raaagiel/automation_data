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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://gredu.sowat.dev/auth')

WebUI.setText(findTestObject('Object Repository/input_atau_credential'), 'tuncayio.s.1.4@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/input_atau_pin'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/span_Masuk'))

WebUI.click(findTestObject('Object Repository/span_Detail Kelas'))

//WebUI.click(findTestObject('span_Buat Baru'))
//
//WebUI.click(findTestObject('span_Buat Tugas'))
//
//WebUI.click(findTestObject('Object Repository/span_Tugas'))
//
//WebUI.sendKeys(findTestObject('input_Judul Tugas_title'), Keys.chord(Keys.COMMAND, 'a'))
//
//WebUI.sendKeys(findTestObject('input_Judul Tugas_title'), Keys.chord(Keys.DELETE))
//
//WebUI.setText(findTestObject('Object Repository/input_Judul Tugas_title'), judulTugas++)
//
//WebUI.click(findTestObject('Object Repository/button_Tugaskan'))
//
//WebUI.click(findTestObject('Object Repository/span_Tugaskan'))
judulTugas = 'PERTUGASAN'

for (int i = 1; i < 6; i++) {
    WebUI.click(findTestObject('span_Buat Baru'))

    WebUI.click(findTestObject('span_Buat Tugas'))

    WebUI.click(findTestObject('Object Repository/span_Tugas'))

    WebUI.sendKeys(findTestObject('input_Judul Tugas_title'), Keys.chord(Keys.COMMAND, 'a'))

    WebUI.sendKeys(findTestObject('input_Judul Tugas_title'), Keys.chord(Keys.DELETE))

    WebUI.setText(findTestObject('Object Repository/input_Judul Tugas_title'), (judulTugas + ' ') + i)

    WebUI.setText(findTestObject('deskripsi'), ' deskripsi')

    WebUI.click(findTestObject('Object Repository/button_Tugaskan'))

    WebUI.click(findTestObject('Object Repository/span_Tugaskan'))
}

not_run: WebUI.closeBrowser()


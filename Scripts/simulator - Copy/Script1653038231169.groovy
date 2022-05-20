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

WebUI.navigateToUrl('https://simulatortest.e2pay.co.id/simulator/')

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.delay(2)

WebUI.click(findTestObject('simulator post/btn_proses payment'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('page_tagihan BCA/p_Menunggu Pembayaran'), 'Menunggu Pembayaran')

va = WebUI.getText(findTestObject('page_tagihan BCA/div_700701701000000319'))

value_bayar = WebUI.getText(findTestObject('page_tagihan BCA/span_Rp 300.000,00'))

WebUI.delay(2)

WebUI.navigateToUrl('https://simulatortest.e2pay.co.id/pg-server/simulatorbank', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Page_Simulator Payment/text_Simulator Payment Partner Side'), 'Simulator Payment Partner Side')

WebUI.click(findTestObject('Page_Simulator Payment/center_BCA VIRTUAL ACCOUNT'))

WebUI.verifyElementText(findTestObject('Page_Simulator BCAVA/h1_Simulator BCA Virtual Account'), 'Simulator BCA Virtual Account')

WebUI.setText(findTestObject('Page_Simulator BCAVA/input_Virtual Account_virtualAccount'), va)

WebUI.click(findTestObject('Page_Simulator BCAVA/btn_cari VA'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Page_Simulator BCAVA/h3_Detail Transaction'), 'Detail Transaction')

WebUI.verifyElementText(findTestObject('Page_Simulator BCAVA/text_detail no VA'), va)

WebUI.setText(findTestObject('Page_Simulator BCAVA/input__paymentAmount'), value_bayar)

WebUI.delay(3)

WebUI.click(findTestObject('Page_Simulator BCAVA/btn_proses payment'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Page_Simulator BCAVA Response/h1_Simulator Payment Partner Side'), 'Simulator Payment Partner Side')

WebUI.verifyElementText(findTestObject('Page_Simulator BCAVA Response/h3_PAYMENT SUCCESS'), 'PAYMENT SUCCESS')

WebUI.delay(3)

WebUI.click(findTestObject('Page_Simulator BCAVA Response/btn_back to simulator'))


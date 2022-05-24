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

WebUI.delay(4)

WebUI.click(findTestObject('simulator post/input_merhant code'))

WebUI.sendKeys(findTestObject('simulator post/input_merhant code'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('simulator post/input_merhant code'), Keys.chord(Keys.CONTROL, 'v'))

WebUI.sendKeys(findTestObject('simulator post/input_merhant code'), Keys.chord(Keys.SHIFT, Keys.ARROW_LEFT, Keys.ARROW_LEFT, 
        Keys.ARROW_LEFT, Keys.ARROW_LEFT, Keys.ARROW_LEFT, Keys.ARROW_LEFT, Keys.ARROW_LEFT, Keys.ARROW_LEFT))

WebUI.sendKeys(findTestObject('simulator post/input_merhant code'), Keys.chord(Keys.CONTROL, 'x'))

//WebUI.setText(findTestObject('simulator post/input_merhant code'), 'IF000002_S00005')
WebUI.click(findTestObject('simulator post/input_paymentID'))

WebUI.sendKeys(findTestObject('simulator post/input_paymentID'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('simulator post/input_paymentID'), Keys.chord(Keys.DELETE))

WebUI.sendKeys(findTestObject('simulator post/input_paymentID'), Keys.chord(Keys.CONTROL, 'v'))

WebUI.sendKeys(findTestObject('simulator post/input_paymentID'), Keys.chord(Keys.SHIFT, Keys.ARROW_LEFT, Keys.ARROW_LEFT, 
        Keys.ARROW_LEFT, Keys.ARROW_LEFT, Keys.ARROW_LEFT, Keys.ARROW_LEFT))

'EPT0000228121000'
WebUI.sendKeys(findTestObject('simulator post/input_paymentID'), Keys.chord(Keys.CONTROL, 'x'))

WebUI.click(findTestObject('simulator post/input_amount'))

WebUI.sendKeys(findTestObject('simulator post/input_amount'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('simulator post/input_amount'), Keys.chord(Keys.DELETE))

WebUI.sendKeys(findTestObject('simulator post/input_amount'), Keys.chord(Keys.CONTROL, 'v'))

value_amount = WebUI.getText(findTestObject('simulator post/input_amount'))

WebUI.delay(2)

println(value_amount)

WebUI.click(findTestObject('simulator post/btn_proses payment'))

WebUI.delay(3)

va = WebUI.getText(findTestObject('page_tagihan BCA/div_700701701000000319'))

value_bayar = WebUI.getText(findTestObject('page_tagihan BCA/span_Rp 300.000,00'))

WebUI.delay(2)

WebUI.navigateToUrl('https://simulatortest.e2pay.co.id/pg-server/simulatorbank', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Page_Simulator Payment/text_Simulator Payment Partner Side'), 'Simulator Payment Partner Side')

WebUI.click(findTestObject('Page_Simulator Payment/center_BNI VIRTUAL ACCOUNT'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Page_Simulator BCAVA/h1_Simulator BCA Virtual Account'), 'Simulator BNI Virtual Account')

WebUI.setText(findTestObject('Page_Simulator BNI/input_virtual Account'), va)

WebUI.delay(3)

WebUI.click(findTestObject('Page_Simulator BNI/btn_proses payment'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Page_Simulator BCAVA Response/h1_Simulator Payment Partner Side'), 'Simulator Payment Partner Side')

WebUI.verifyElementText(findTestObject('Page_Simulator BCAVA Response/h3_PAYMENT SUCCESS'), 'PAYMENT SUCCESS')

WebUI.delay(3)

WebUI.click(findTestObject('Page_Simulator BCAVA Response/btn_back to simulator'))


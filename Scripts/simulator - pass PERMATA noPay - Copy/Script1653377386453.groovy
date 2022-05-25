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
for (i=1;i<=10;i++) {

	WebUI.navigateToUrl('www.google.com')
	
	WebUI.delay(1)
	
	temp_amount = amount + i    //1001

	temp = all + temp_amount + "00"    //10010		EPT00002 22 10000

	WebUI.setText(findTestObject('Page_Google/search'), temp)
	
	WebUI.sendKeys(findTestObject('Page_Google/search'), Keys.chord(Keys.CONTROL, 'a'))
	
	WebUI.sendKeys(findTestObject('Page_Google/search'), Keys.chord(Keys.CONTROL, 'c'))
	
	WebUI.navigateToUrl('https://simulatortest.e2pay.co.id/simulator/')
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('simulator post/input_merhant code'))
	
	WebUI.sendKeys(findTestObject('simulator post/input_merhant code'), Keys.chord(Keys.CONTROL, 'a'))
	
	WebUI.sendKeys(findTestObject('simulator post/input_merhant code'), Keys.chord(Keys.DELETE))
	
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
	
	'EPT0000222199900\r\n'
	WebUI.sendKeys(findTestObject('simulator post/input_paymentID'), Keys.chord(Keys.CONTROL, 'x'))
	
	WebUI.click(findTestObject('simulator post/input_amount'))
	
	WebUI.sendKeys(findTestObject('simulator post/input_amount'), Keys.chord(Keys.CONTROL, 'a'))
	
	WebUI.sendKeys(findTestObject('simulator post/input_amount'), Keys.chord(Keys.DELETE))
	
	WebUI.sendKeys(findTestObject('simulator post/input_amount'), Keys.chord(Keys.CONTROL, 'v'))
	
	value_amount = WebUI.getText(findTestObject('simulator post/input_amount'))
	
	WebUI.delay(1)
	
	println(value_amount)
	
	WebUI.takeFullPageScreenshot()
	
	WebUI.click(findTestObject('simulator post/btn_proses payment'))
	
	WebUI.delay(1)
	
	va = WebUI.getText(findTestObject('page_tagihan BCA/div_700701701000000319'))
	
	value_bayar = WebUI.getText(findTestObject('page_tagihan BCA/span_Rp 300.000,00'))
	
	WebUI.delay(1)
	
	WebUI.takeFullPageScreenshot()

}




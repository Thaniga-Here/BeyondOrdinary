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

'Opening the browser and Navigating to the URL\r\n'
WebUI.openBrowser(GlobalVariable.URL)

'Maximizing the window'
WebUI.maximizeWindow()

'Verify the "Log in to Your Account" Heading'
WebUI.verifyElementPresent(findTestObject('Login/lbl_LogintoAccount'), 5)

'Enter Valid mail Id'
WebUI.sendKeys(findTestObject('Login/inp_Email'), GlobalVariable.Username)

'Enter Valid Passowrd'
WebUI.setEncryptedText(findTestObject('Login/inp_Password'), GlobalVariable.Password)

'Select Remember me checkbox'
WebUI.click(findTestObject('Login/chk_RememberMe'))

'Click the Sign In Button'
WebUI.click(findTestObject('Login/btn_SignIn'))

'Validating "Login Successfull" Alert message\r\n'
WebUI.verifyElementPresent(findTestObject('Login/lbl_LoginSuccessAlert'), 10)


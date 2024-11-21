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

Mobile.startApplication('C:\\Users\\Ahmed Radwan\\Downloads\\General-Store (1).apk', true)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Afghanistan'), 0)

Mobile.scrollToText('Egypt')

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Egypt'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Enter name here'), 'Ahmed Radwan', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.RadioButton - Male'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Lets  Shop'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - ADD TO CART'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/android.widget.TextView - Air Jordan 4 Retro'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/android.widget.TextView - Air Jordan 1 Mid SE'), 0)

String product1PriceText = Mobile.getText(findTestObject('Product1Price'), 0)

String product2PriceText = Mobile.getText(findTestObject('Product2Price'), 0)

String totalPriceText = Mobile.getText(findTestObject('TotalPrice'), 0)

double product1Price = Double.parseDouble(product1PriceText.replace('$', '').trim())

double product2Price = Double.parseDouble(product2PriceText.replace('$', '').trim())

double totalPrice = Double.parseDouble(totalPriceText.replace('$', '').trim())

double calculatedTotal = product1Price + product2Price

assert calculatedTotal == totalPrice

Mobile.closeApplication()


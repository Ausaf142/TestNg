package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageCashora {
public HomePageCashora(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
@FindBy(xpath = "//span[text()='Pet Care']")
WebElement petCare;
@FindBy(xpath = "//span[text()='Fre stuff']")
WebElement freeStuff;
@FindBy(xpath = "//span[text()='Loot Offers']")
WebElement lootOffer;
@FindBy(xpath = "//span[text()='Food & Entertainment']")
WebElement food_Entertainment;
@FindBy(xpath = "//span[text()='Hosting']")
WebElement hosting;

public void Petcare() {
	petCare.click();
}
public void FreeStuff() {
	freeStuff.click();
}
public void LootOffer() {
	lootOffer.click();
}
public void FoodEntertainment() {
	food_Entertainment.click();
}
public void Hosting() {
	hosting.click();
}




}

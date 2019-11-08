import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SelectedFoodsWebObject extends WebObjectBase
{
	By ContainerObject = By.cssSelector("table[class='ui selectable structured large table'] ");
	
	public enum SelectedFoodsElements
	{
		SELECTED_FOOD_TITLE(By.Xpath("//h3[text() = 'Selected foods']")),
		DESCRIPTION(By.Xpath("//th[@class = 'eight wide']")),
		KCAL(By.Xpath("//th[text()= 'Kcal']")),
		PROTEIN(By.Xpath("//th[text()= 'Protein (g)']")),
		FAT(By.Xpath("Fat (g)")),
		CARBS(By.Xpath("//th[text()= 'Carbs (g)']"));
		
		private final By by;
		public SelectedFoodsElements(By by) 
		{
			this.by = by;
		}
		
		public By getlocator() 
		{
			return (by);
		}
	}
	
	public SelectedFoodsWebObject() 
	{
		super(getContainers()[0]);
	}
	
	public List<WebElement> getContainers()
	{
		return driver.findElments(ContainerObject);
	}
	
	public void assert_ElementsAreDisplayed() 
	{
		WebElement element = driver.findElement(SelectedFoodsElements.DESCRIPTION.getlocator());
		WebElement element1 = driver.findElement(SelectedFoodsElements.CARBS.getlocator());
		WebElement element2 = driver.findElement(SelectedFoodsElements.FAT.getlocator());
		WebElement element3 = driver.findElement(SelectedFoodsElements.KCAL.getlocator());
		WebElement element4 = driver.findElement(SelectedFoodsElements.PROTEIN.getlocator());
		WebElement element5 = driver.findElement(SelectedFoodsElements.SELECTED_FOOD_TITLE.getlocator());
		element.isDisplayed();
		
		ArrayList<WebElement> elements = new ArrayList();
		
		elements.add(element);
		elements.add(element1);
		elements.add(element2);
		elements.add(element3);
		elements.add(element4);
		elements.add(element5);
		
		
		for(WebElement ele : elements) 
		{
			Assert.assertTrue(ele.isDisplayed());
		}
	}
	
}

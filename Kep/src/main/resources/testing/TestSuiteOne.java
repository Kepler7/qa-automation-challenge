import org.testng.annotations.Test;

public class TestSuiteOne extends Testbase
{
	@Test
	public void AssertElementsAreDisplayed() 
	{
		SelectedFoodsWebOject food = new SelectedFoodsWebOject();
		food.assert_ElementsAreDisplayed();
	}
}

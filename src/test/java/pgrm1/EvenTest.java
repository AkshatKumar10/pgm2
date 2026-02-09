package pgrm1;
import org.testng.Assert;
import org.testng.annotations.Test;
public class EvenTest {
	@Test
	public void testPass() {
		Assert.assertEquals(Even.display(55),"pass");
	}
	@Test
	public void testFail() {
		Assert.assertEquals(Even.display(35),"fail");
	}
}





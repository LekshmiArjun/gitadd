package utilities;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Dataprovider {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 123456, "admin" }
//      new Object[] { 2, "b" },
    };
  }
}

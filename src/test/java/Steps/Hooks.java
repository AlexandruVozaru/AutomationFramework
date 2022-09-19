package Steps;

import Base.BaseUtil;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends BaseUtil {
    private BaseUtil base;
    public Hooks(BaseUtil base) {
        this.base = base;
    }
    public Hooks(){};


    @Before
    public void InitializeTheTest() {
        //  base.stepInfo="Chrome";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\alexandru.vozaru\\Desktop\\chromedriver.exe");
        base.Driver = new ChromeDriver();

    }

    @After
    public void TearDownTest(){

        //System.out.println("After test  "+base.stepInfo);
    }
}

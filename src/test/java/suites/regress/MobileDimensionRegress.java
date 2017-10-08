package suites.regress;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.MainPageTests;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        MainPageTests.class})
public class MobileDimensionRegress {

    private final static PlatformConfig CHROME_MOBILE_SCREEN = new PlatformConfig(
            "chrome",
            "480",
            "800");

    @BeforeClass
    public static void setUp() {
        setPlatformConfig(CHROME_MOBILE_SCREEN);
    }
}

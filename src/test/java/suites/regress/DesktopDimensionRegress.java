package suites.regress;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.MainPageTests;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        MainPageTests.class})
public class DesktopDimensionRegress {

    private final static PlatformConfig CHROME_FULL_SCREEN = new PlatformConfig(
            "chrome",
            "1920",
            "800");

    @BeforeClass
    public static void setUp() {
        setPlatformConfig(CHROME_FULL_SCREEN);
    }
}

package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import suites.regress.DesktopDimensionRegress;
import suites.regress.MobileDimensionRegress;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        DesktopDimensionRegress.class,
        MobileDimensionRegress.class
})
public class FullRegress {
}

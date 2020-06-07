package by.larchenko.utils;

import by.larchenko.utils.StringUtils;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringUtilsTest {
    @Test
    public void testIsPositiveNumberMethod() {
    assertTrue("someLibraryMethod should return 'true'", StringUtils.isPositiveNumber("5"));
}
}


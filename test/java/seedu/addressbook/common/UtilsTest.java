package seedu.addressbook.common;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class UtilsTest {


    @Test
    public void elementsAreUnique() throws Exception {
        // empty list
        assertAreUnique();

        // only one object
        assertAreUnique((Object) null);
        assertAreUnique(1);
        assertAreUnique("");
        assertAreUnique("abc");

        // all objects unique
        assertAreUnique("abc", "ab", "a");
        assertAreUnique(1, 2);

        // some identical objects
        assertNotUnique("abc", "abc");
        assertNotUnique("abc", "", "abc", "ABC");
        assertNotUnique("", "abc", "a", "abc");
        assertNotUnique(1, new Integer(1));
        assertNotUnique(null, 1, new Integer(1));
        assertNotUnique(null, null);
        assertNotUnique(null, "a", "b", null);
    }

    private void assertAreUnique(Object... objects) {
        assertTrue(Utils.elementsAreUnique(Arrays.asList(objects)));
    }

    private void assertNotUnique(Object... objects) {
        assertFalse(Utils.elementsAreUnique(Arrays.asList(objects)));
    }
    
    @Test
    private void isAnyNull() throws Exception{
        //no null elements
        checkContainsNull_noNull_returnFalse("abc", "aaa", "xyz");
        checkContainsNull_noNull_returnFalse();


        //some null elements
        checkContainsNull_someNull_returnFalse("abc", null, "xyz");
        
        //all are null
        checkContainsNull_allNull_returnFalse(null, null, null);
    }

    private void checkContainsNull_noNull_returnFalse(Object... objects) {
        assertFalse(Utils.isAnyNull(objects));
    }

    private void checkContainsNull_someNull_returnFalse(Object... objects) {
        assertTrue(Utils.isAnyNull(objects));
    }

    private void checkContainsNull_allNull_returnFalse(Object... objects) {
        assertTrue(Utils.isAnyNull(objects));
    }
}

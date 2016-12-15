package ie.bhaa.registration.enumeration;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pauloconnell on 15/12/16.
 */
public class PageTest {

    @Test
    public void pages() {
        assertEquals("Number of pages",6,Page.values().length);
    }
}
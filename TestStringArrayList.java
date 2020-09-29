import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
public class TestStringArrayList {

    /**
     * Test edge cases for get.
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetOutOfBounds1() {
        StringArrayList tester = new StringArrayList(); 
        tester.get(-3);
    }
    
    /**
     * Test edge cases for get.
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetOutOfBounds2() {
        StringArrayList tester = new StringArrayList();
        tester.get(3);
    }
    
    /**
     * Test that get works for item 0 when set with single item constructor.
     */
    @Test
    public void testGetSingleItemConstructor() {
        StringArrayList tester = new StringArrayList("Anna");
        String item0 = tester.get(0);
        assertEquals("Testing get for 0th index and single item constructor.\n", "Anna", item0);
    }

    /**
     * Test edge cases for set.
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetOutOfBounds1() {
        StringArrayList tester = new StringArrayList(); 
        tester.set(-3, "Anna");
    }
    
    /**
     * Test edge cases for set.
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetOutOfBounds2() {
        StringArrayList tester = new StringArrayList();
        tester.set(3, "Anna");
    }
    
    /**
     * Test that set (and get) work for item 0 when set with single item constructor.
     */
    @Test
    public void testSetSingleItemConstructor() {
        StringArrayList tester = new StringArrayList("Anna");
        String oldItem = tester.set(0, "Eris");
        assertEquals("Testing set for 0th index and single item constructor.\n", "Anna", oldItem);

        assertEquals("Testing set and get for 0th index and single item constructor.\n", "Eris", tester.get(0));

    }

    /**
     * Test that adding at the end works when no resizing of array is needed.
     */
    @Test
    public void testAddAtEndNoResize() {
        StringArrayList tester = new StringArrayList(); 
        java.util.List<String> stringList = new ArrayList<String>();
        //Add the numbers 0-6 to the list in string form
        //and check array after each one.
        for (int i = 0; i < 7; i++) {
            tester.add(Integer.toString(i));
            stringList.add(Integer.toString(i));
            assertEquals("Checking add at end. (Look at how you change numItems if your output doesn't match the expected one in length.)\n", stringList.toString(), Arrays.toString(tester.toArray()));
        }
    }

    /**
     * Test that adding at the beginning works when no resizing of array is needed.
     */
    @Test
    public void testAddAtIndexNoResize() {
        StringArrayList tester = new StringArrayList(); 
        java.util.List<String> stringList = new ArrayList<String>();

        //Add the numbers 0-6 to the list in string form
        //and check array after each one.
        for (int i = 0; i < 7; i++) {
            tester.add(0, Integer.toString(i));
            stringList.add(0, Integer.toString(i));
            assertEquals("Checking add at index. (Look at how you change numItems if your output doesn't match the expected one in length.)\n", stringList.toString(), Arrays.toString(tester.toArray()));
        }
    }

    /**
     * Test that adding at the end works when resizing of array is needed.
     */
    @Test
    public void testAddAtEndResize() {
        StringArrayList tester = new StringArrayList(); 
        java.util.List<String> stringList = new ArrayList<String>();

        //Add the numbers 0-24 to the list in string form
        //and check array after each one.
        for (int i = 0; i < 25; i++) {
            tester.add(Integer.toString(i));
            stringList.add(Integer.toString(i));
            assertEquals("Checking add at end. (Look at how you change numItems if your output doesn't match the expected one in length.)\n", stringList.toString(), Arrays.toString(tester.toArray()));
        }
    }

    /**
     * Test that getting works for a variety of spots in the array, as well as 
     * adding at an index and resizing.
     */
    @Test
    public void testAddAtIndexResize() {
        StringArrayList tester = new StringArrayList(); 
        java.util.List<String> stringList = new ArrayList<String>();

        //Add the numbers 0-24 to the list in string form
        //and check array after each one.
        for (int i = 0; i < 25; i++) {
            tester.add(0, Integer.toString(i));
            stringList.add(0, Integer.toString(i));
            assertEquals("Checking add at index. (Look at how you change numItems if your output doesn't match the expected one in length.)\n", stringList.toString(), Arrays.toString(tester.toArray()));
            for(int j = 0; j < stringList.size(); j++) {
                assertEquals("Checking get at many spots in array, after adding.", stringList.get(j), tester.get(j));
            }
        }
    }
}
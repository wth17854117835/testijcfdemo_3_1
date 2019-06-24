package com.sitech.ijcf.demo;

import com.sitech.ijcf.demo.dto.User;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.lang.reflect.Field;

/**
 * Unit test for simple App.
 */
public class AppTests
        extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTests( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTests.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {

        Field[] fields = User.class.getDeclaredFields();

        for(Field field :fields )
        {
            String name = field.getName();
            Class<?> type = field.getType();



            System.out.println(name+","+type.getName());

        }




    }
}

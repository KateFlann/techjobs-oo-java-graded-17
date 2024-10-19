package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here


    @Test
    public void testSettingJobId() {

        Employer comcast =new Employer("Comcast");
        Location philly = new Location("Philadelphia");
        PositionType entryLevel = new PositionType("Entry Level");
        CoreCompetency js = new CoreCompetency("Javascript");

       Job comcastSDjob = new Job("Software Developer",  comcast, philly, entryLevel, js);
       Job comcastSEjob = new Job("Senior Engineer", comcast, philly, entryLevel, js);

        assertNotEquals(comcastSDjob.getEmployer().getId(), comcastSEjob.getEmployer().getId(), .001);
    }

    @Test
    public void testJobConstructorSetsAllFields(){

       Job productTester = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

//        Use assertTrue and assertEquals statements to test that the constructor correctly assigns both the class
//        and value of each field. Your test should have 5 assert statements of each type.

        assertTrue(productTester.getId()>=1);
        assertEquals("Product tester", productTester.getName());
        assertEquals(productTester.getEmployer().getValue(), "ACME");
        assertEquals(productTester.getLocation().getValue(), "Desert");
        assertEquals(productTester.getEmployer().getValue(),"Quality Control");
        assertEquals(productTester.getEmployer().getValue(),"Persistence");


    }

    @Test
    public void testJobsForEquality(){

        Employer comcast =new Employer("Comcast");
        Location philly = new Location("Philadelphia");
        PositionType entryLevel = new PositionType("Entry Level");
        CoreCompetency js = new CoreCompetency("Javascript");
        Job comcastSDjob1 = new Job("Software Developer",  comcast, philly, entryLevel, js);
        Job comcastSDjob2 = new Job("Software Developer",  comcast, philly, entryLevel, js);

        assertNotEquals(comcastSDjob1.getEmployer().getId(), comcastSDjob2.getEmployer().getId(), .001);
    }

}

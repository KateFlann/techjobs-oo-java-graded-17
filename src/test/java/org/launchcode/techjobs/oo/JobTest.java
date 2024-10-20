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

        assertNotEquals(comcastSDjob.getId(), comcastSEjob.getId(), .001);
    }

    @Test
    public void testJobConstructorSetsAllFields(){

       Job productTester = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

//        Use assertTrue and assertEquals statements to test that the constructor correctly assigns both the class
//        and value of each field. Your test should have 5 assert statements of each type.

        assertTrue(productTester.getId()>=1);
        assertEquals("Product tester", productTester.getName());
        assertEquals("ACME", productTester.getEmployer().getValue());
        assertEquals("Desert", productTester.getLocation().getValue());
        assertEquals("Quality control", productTester.getPositionType().getValue());
        assertEquals("Persistence", productTester.getCoreCompetency().getValue());


    }

    @Test
    public void testJobsForEquality(){

        Employer comcast =new Employer("Comcast");
        Location philly = new Location("Philadelphia");
        PositionType entryLevel = new PositionType("Entry Level");
        CoreCompetency js = new CoreCompetency("Javascript");
        Job comcastSDjob1 = new Job("Software Developer",  comcast, philly, entryLevel, js);
        Job comcastSDjob2 = new Job("Software Developer",  comcast, philly, entryLevel, js);

        assertNotEquals(comcastSDjob1.getId(), comcastSDjob2.getId(), .001);
    }


    @Test
    public void testToStringStartsAndEndsWithNewLine() {

//        When passed a Job object, it should return a string that contains
//        a blank line before and after the job information.

        Employer comcast = new Employer("Comcast");
        Location philly = new Location("Philadelphia");
        PositionType entryLevel = new PositionType("Entry Level");
        CoreCompetency js = new CoreCompetency("Javascript");
        Job comcastSDjob1 = new Job("Software Developer", comcast, philly, entryLevel, js);


        assertEquals(System.lineSeparator(), comcastSDjob1.toString().substring(0, 2));
        assertEquals(System.lineSeparator(), comcastSDjob1.toString().substring(comcastSDjob1.toString().length()-2));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {


        Employer comcast = new Employer("Comcast");
        Location philly = new Location("Philadelphia");
        PositionType entryLevel = new PositionType("Entry Level");
        CoreCompetency js = new CoreCompetency("Javascript");
        Job comcastSDjob1 = new Job("Software Developer", comcast, philly, entryLevel, js);


        assertEquals(comcastSDjob1.toString(),
                System.lineSeparator() +
                        "ID: " + comcastSDjob1.getId() + System.lineSeparator() +
                        "Name: " + comcastSDjob1.getName() + System.lineSeparator() +
                "Employer: " + comcastSDjob1.getEmployer() + System.lineSeparator() +
                "Location: " + comcastSDjob1.getLocation() + System.lineSeparator() +
                "Position Type: " + comcastSDjob1.getPositionType() + System.lineSeparator() +
                "Core Competency: " + comcastSDjob1.getCoreCompetency() + System.lineSeparator());

    }

    @Test

    public void testToStringHandlesEmptyField() {

        Employer comcast = new Employer("Comcast");
        Location philly = new Location("Philadelphia");
        PositionType entryLevel = new PositionType("Entry Level");
        CoreCompetency js = new CoreCompetency("");
        Job comcastSDjob1 = new Job("Software Developer", comcast, philly, entryLevel, js);

        assertEquals(comcastSDjob1.toString(),
                System.lineSeparator() +
                        "ID: " + comcastSDjob1.getId() + System.lineSeparator() +
                        "Name: " + comcastSDjob1.getName() + System.lineSeparator() +
                        "Employer: " + comcastSDjob1.getEmployer() + System.lineSeparator() +
                        "Location: " + comcastSDjob1.getLocation() + System.lineSeparator() +
                        "Position Type: " + comcastSDjob1.getPositionType() + System.lineSeparator() +
                        "Core Competency: Data not available" + System.lineSeparator());


    }

    }


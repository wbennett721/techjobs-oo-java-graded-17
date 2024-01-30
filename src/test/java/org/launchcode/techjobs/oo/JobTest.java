package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
        Job job_test = new Job();
        Job next_job_test = new Job();
        assertNotEquals(job_test.getId(), next_job_test.getId());

    }

    @Test
    public void testJobsForEquality() {
        Job equalsTest1 = new Job("Teacher", new Employer("Hazelwood"), new Location("STL"), new PositionType("Gym Teacher"), new CoreCompetency("Fitness"));
        Job equalsTest2 = new Job("Teacher", new Employer("Hazelwood"), new Location("STL"), new PositionType("Gym Teacher"), new CoreCompetency("Fitness"));
        assertNotEquals(true, equalsTest1.equals(equalsTest2));
    }
    @Test
    public void testJobConstructorSetsAllFields() {
        Job job_test1 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        assertTrue(job_test1.getName() instanceof String);
        assertTrue(job_test1.getEmployer() instanceof Employer);
        assertTrue(job_test1.getLocation() instanceof Location);
        assertTrue(job_test1.getPositionType() instanceof PositionType);
        assertTrue(job_test1.getCoreCompetency() instanceof CoreCompetency);

        assertEquals("Product tester", job_test1.getName());
        assertEquals("ACME", job_test1.getEmployer().getValue());
        assertEquals("Desert", job_test1.getLocation().getValue());
        assertEquals("Quality control", job_test1.getPositionType().getValue());
        assertEquals("Persistence", job_test1.getCoreCompetency().getValue());
    }

@Test
public void testToStringStartsAndEndsWithNewLine(){
    Job job = new Job("Web Developer", new Employer("LaunchCode"), new Location("StL"), new PositionType("Back-end developer"), new CoreCompetency("Java"));
    String firstChar = String.valueOf(job.toString().charAt(0));
    String lastChar = String.valueOf(job.toString().charAt(job.toString().length()-1));
    assertEquals(firstChar,"\r" );
    assertEquals(lastChar, "\n");
}

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job1 = new Job("Web Developer", new Employer("LaunchCode"), new Location("StL"), new PositionType("Back-end developer"), new CoreCompetency("Java"));
        String newLine = System.lineSeparator();
        assertEquals(newLine +
                "ID: " + job1.getId() + newLine +
                "Name: " + job1.getName() + newLine +
                "Employer: " + job1.getEmployer() + newLine +
                "Location: " + job1.getLocation() + newLine +
                "Position Type: " + job1.getPositionType() + newLine +
                "Core Competency: " + job1.getCoreCompetency() + newLine, job1.toString());


    }

    @Test
    public void testToStringHandlesEmptyField()  {
        Job job2 = new Job("", new Employer(""), new Location("StL"), new PositionType("Back-end developer"), new CoreCompetency("Java"));
        String newLine = System.lineSeparator();
        assertEquals(newLine +
                "ID: " + job2.getId() + newLine +
                "Name: Data not available" + newLine +
                "Employer: Data not available" + newLine +
                "Location: " + job2.getLocation() + newLine +
                "Position Type: " + job2.getPositionType() + newLine +
                "Core Competency: " + job2.getCoreCompetency() + newLine, job2.toString());
    }


}

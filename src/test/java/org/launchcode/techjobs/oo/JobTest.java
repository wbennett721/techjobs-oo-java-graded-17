package org.launchcode.techjobs.oo;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static java.lang.System.lineSeparator;
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
        assertEquals("ID=" + job1.getId() + newLine +
                "Name: " + job1.getName() + newLine +
                "Employer: " + job1.getEmployer("") + newLine +
                "location: " + job1.getLocation() + newLine +
                "Position Type: " + job1.getPositionType() + newLine +
                "Core Competency: " + job1.getCoreCompetency() + newLine, job1.toString());


    }

    @Test
    public void testToStringHandlesEmptyField()  {
        Job job = new Job("", new Employer(""), new Location("StL"), new PositionType("Back-end developer"), new CoreCompetency("Java"));
        String newLine = System.lineSeparator();
        assertEquals("ID=" + job.getId() + newLine +
                "Name: Data not available" + newLine +
                "Employer: Data not available" + newLine +
                "location: " + job.getLocation() + newLine +
                "Position Type: " + job.getPositionType() + newLine +
                "Core Competency=" + job.getCoreCompetency() + newLine, job.toString());
    }


}

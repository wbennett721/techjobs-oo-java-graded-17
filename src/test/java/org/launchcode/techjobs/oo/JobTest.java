package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

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
        Job job_test = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        assertEquals(job_test.getName(), "Product tester");
        assertNotNull(job_test.getEmployer("ACME"));
        assertNotNull(job_test.getLocation("Desert"));
        assertNotNull(job_test.getPositionType("Quality control"));
        assertNotNull(job_test.getCoreCompetency("Persistence"));
        //assertEquals(job_test.getEmployer("ACME"), "ACME");
    }

@Test
public void testJobsForEquality(){

}


}

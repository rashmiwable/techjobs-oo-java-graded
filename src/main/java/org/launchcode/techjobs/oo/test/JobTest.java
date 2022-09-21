package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import java.lang.reflect.Method;

import static org.junit.Assert.fail;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId ()  {

        Job j1 = new Job();
        Job j2 = new Job();

        Assert.assertNotEquals (j1.getId() , j2.getId());

    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job j1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assert.assertTrue(j1.getName() instanceof String);
        Assert.assertTrue(j1.getEmployer() instanceof Employer);
        Assert.assertTrue(j1.getLocation() instanceof Location);
        Assert.assertTrue(j1.getPositionType() instanceof PositionType);
        Assert.assertTrue(j1.getCoreCompetency() instanceof CoreCompetency);

        Assert.assertEquals(j1.getName(), "Product tester");
        Assert.assertEquals(j1.getEmployer().getValue(), "ACME");
        Assert.assertEquals(j1.getLocation().getValue(), "Desert");
        Assert.assertEquals(j1.getPositionType().getValue(), "Quality control");
        Assert.assertEquals(j1.getCoreCompetency().getValue(), "Persistence");

    }

    @Test
    public void testJobsForEquality(){
        Job j1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job j2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        Assert.assertFalse(j1.equals(j2));
    }

}


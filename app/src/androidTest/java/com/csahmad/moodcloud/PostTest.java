package com.csahmad.moodcloud;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by Taylor on 2017-02-26.
 */

public class PostTest extends ActivityInstrumentationTestCase2 {
    public PostTest() {

        super(MainActivity.class);
    }

    public void testEquals() {
        Profile profile = new Profile("test");
        double[] loc = new double[] {1,2,3};
        Post post1 = new Post("t", "m", "tr", "tri", "c", profile, loc);
        Post post2 = new Post("t", "m", "tr", "tri", "c", profile, loc);
        assertTrue(post1.equals(post2));
    }

    public void testText() {
        Profile profile = new Profile("test");
        double[] loc = new double[] {1,2,3};
        Post post = new Post("t", "m", "tr", "tri", "c", profile, loc);
        post.setText("test");
        assertEquals("test", post.getText());
    }

    public void testMood() {
        Profile profile = new Profile("test");
        double[] loc = new double[] {1,2,3};
        Post post = new Post("t", "m", "tr", "tri", "c", profile, loc);
        post.setMood("test");
        assertEquals("test", post.getMood());
    }

    public void testTriggerText() {
        Profile profile = new Profile("test");
        double[] loc = new double[] {1,2,3};
        Post post = new Post("t", "m", "tr", "tri", "c", profile, loc);
        post.setTriggerText("test");
        assertEquals("test", post.getTriggerText());
    }

    public void testTriggerImage() {
        Profile profile = new Profile("test");
        double[] loc = new double[] {1,2,3};
        Post post = new Post("t", "m", "tr", "tri", "c", profile, loc);
        post.setTriggerImage("test");
        assertEquals("test", post.getTriggerImage());
    }

    public void testContext() {
        Profile profile = new Profile("test");
        double[] loc = new double[] {1,2,3};
        Post post = new Post("t", "m", "tr", "tri", "c", profile, loc);
        post.setContext("test");
        assertEquals("test", post.getContext());
    }

    public void testPoster() {
        Profile profile = new Profile("test");
        Profile profile2 =  new Profile("test2");
        double[] loc = new double[] {1,2,3};
        Post post = new Post("t", "m", "tr", "tri", "c", profile, loc);
        post.setPoster(profile2);
        assertEquals(profile2, post.getPoster());
    }

    public void testLocation() {
        Profile profile = new Profile("test");
        double[] loc = new double[] {1,2,3};
        double[] loc2 = new double[] {3,2,3};
        Post post = new Post("t", "m", "tr", "tri", "c", profile, loc);
        post.setLocation(loc2);
        assertEquals(loc2, post.getLocation());
    }

}
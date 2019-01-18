package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User ronnie = new Millenials("Ronnie O'Sullivan");
        User mark = new YGeneration("Mark Selby");
        User judd = new ZGeneration("Judd Trump");

        //When
        String ronniePublishes = ronnie.sharePost();
        System.out.println("Ronnie says: " + ronniePublishes);
        String markPublishes = mark.sharePost();
        System.out.println("Ronnie says: " + markPublishes);
        String juddPublishes = judd.sharePost();
        System.out.println("Judd says: " + juddPublishes);

        //Then
        Assert.assertEquals("I am using Facebook.", ronniePublishes);
        Assert.assertEquals("I am using Twitter.", markPublishes);
        Assert.assertEquals("I am using Snapchat.", juddPublishes);

    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User ronnie = new Millenials("Ronnie O'Sullivan");

        //When
        String ronniePublishes = ronnie.sharePost();
        System.out.println("Ronnie says: " + ronniePublishes);
        ronnie.setSocialPublisher((new SnapchatPublisher()));
        ronniePublishes = ronnie.sharePost();
        System.out.println("Ronnie changed his mind: " + ronniePublishes);

        //Then
        Assert.assertEquals("I am using Snapchat.", ronniePublishes);
    }
}

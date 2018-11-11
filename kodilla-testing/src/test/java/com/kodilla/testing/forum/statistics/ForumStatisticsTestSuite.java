package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    private static int testCounter = 0;
    private ForumStatistics forumStatistics;


    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {

        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
        forumStatistics = new ForumStatistics();
    }

    @Test
    public void testForumStatisticsNoPost() {
        //Given
        int postCountTest = 0;
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(postCountTest);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, forumStatistics.getPostCount());

    }

    @Test
    public void testForumStatisticsWithPosts() {
        //Given
        int postCountTest = 1000;
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(postCountTest);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(1000, forumStatistics.getPostCount());

    }

    @Test
    public void testForumStatisticsWithNoComments() {
        //Given
        int commentsCountTest = 0;
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(commentsCountTest);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, forumStatistics.getCommentCount());

    }

    @Test
    public void testForumStatisticsNumberOfCommentsLowerThanNumberOfPosts() {
        //Given
        int postCountTest = 1000;
        int commentsCountTest = 900;
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(commentsCountTest);
        when(statisticsMock.postsCount()).thenReturn(postCountTest);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        boolean result = false;
        if (forumStatistics.getCommentCount() < forumStatistics.getPostCount()) {
            result = true;
        }
        Assert.assertTrue(result);
    }

    @Test
    public void testForumStatisticsNumberOfCommentsHigherThanNumberOfPosts() {
        //Given
        int postCountTest = 500;
        int commentsCountTest = 900;
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(commentsCountTest);
        when(statisticsMock.postsCount()).thenReturn(postCountTest);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        boolean result = false;
        if (forumStatistics.getCommentCount() > forumStatistics.getPostCount()) {
            result = true;
        }
        Assert.assertTrue(result);
    }

    @Test
    public void testForumStatisticsNoUsers() {
        //Given
        List<String> usersNames = new ArrayList<>();
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, forumStatistics.getUsersCount());

    }

    @Test
    public void testForumStatisticsWithUsers() {

        //Given
        List<String> userNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            userNames.add("User" + i);
        }
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(100, forumStatistics.getUsersCount());

    }
}
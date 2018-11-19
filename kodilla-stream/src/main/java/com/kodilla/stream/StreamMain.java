package com.kodilla.stream;

/*
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.person.People;
import java.util.List;
*/

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

public class StreamMain {
    public static void main(String[] args) {
        /*
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println(" ");
        System.out.println("Zadanie: Upiększacz tekstów:");
        System.out.println(" ");

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Text Text Text", (String::toUpperCase));
        poemBeautifier.beautify("Text Text Text", text -> text.toLowerCase());
        poemBeautifier.beautify("Text Text text", (text -> "***" + text + "***"));
        poemBeautifier.beautify("TEXT IN CAGES", (text -> {
            StringBuilder textStringBuilt = new StringBuilder();
            textStringBuilt.append("|");
            for (int i = 0; i < text.length(); i++) {
                textStringBuilt.append(text.charAt(i));
                textStringBuilt.append("|");
            }
            return textStringBuilt.toString();

        }));
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
        */
        /*
        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);
        */
        /*
        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);
        */

        Forum theForumUsers = new Forum();

        Map<Integer, ForumUser> theResultMapOfForumUsers = theForumUsers.getTheForumUserList().stream().filter(forumUser -> forumUser.getSex() == 'M').filter(forumUser -> Period.between(forumUser.getDateOfBirth(), LocalDate.now()).getYears() >= 20).filter(forumUser -> forumUser.getQtyOfPublishedPosts() >= 1).collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        System.out.println("# elements: " + theResultMapOfForumUsers.size());
        theResultMapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry
                .getValue()).forEach(System.out::println);
    }
}

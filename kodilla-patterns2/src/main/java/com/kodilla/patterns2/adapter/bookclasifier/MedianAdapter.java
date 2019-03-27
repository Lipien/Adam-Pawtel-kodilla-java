package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set <com.kodilla.patterns2.adapter.bookclasifier.librarya.Book> bookSet) {
        Map <BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> booksList = new HashMap <>();
        for (com.kodilla.patterns2.adapter.bookclasifier.librarya.Book bookYearMedian : bookSet) {
            booksList.put(new BookSignature(bookYearMedian.getSignature()), new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book
                    (bookYearMedian.getAuthor(), bookYearMedian.getTitle(), bookYearMedian.getPublicationYear()));
        }
        return medianPublicationYear(booksList);
    }
}

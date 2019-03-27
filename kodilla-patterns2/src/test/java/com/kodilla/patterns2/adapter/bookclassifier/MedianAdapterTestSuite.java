package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Book book1 = new Book("Jaroslaw Grzedowicz", "Hel3", 1989, "ISBN 2020234");
        Book book2 = new Book("Jaroslaw Grzedowicz", "Anioly i demony", 1990, "ISBN 2020235");
        Book book3 = new Book("Jaroslaw Grzedowicz", "Pan lodowego ogrodu 1", 1995, "ISBN 2020236");
        Book book4 = new Book("Jaroslaw Grzedowicz", "Pan lodowego ogrodu 2", 1999, "ISBN 2020237");
        Book book5 = new Book("Jaroslaw Grzedowicz", "Pan lodowego ogrodu 3", 2002, "ISBN 2020238");
        Book book6 = new Book("Jaroslaw Grzedowicz", "Pan lodowego ogrodu 4", 2003, "ISBN 2020239");
        Book book7 = new Book("Jaroslaw Grzedowicz", "Wypychacz zwierzat", 2008, "ISBN 2020240");
        Book book8 = new Book("Andrzej Ziemianski", "Achaja 1", 2015, "ISBN 2020241");
        Book book9 = new Book("Andrzej Ziemianski", "Achaja 2", 2016, "ISBN 2020242");
        Book book10 = new Book("Andrzej Ziemianski", "Achaja 3", 2019, "ISBN 2020243");

        Set <Book> bookSet = new HashSet <>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);
        bookSet.add(book6);
        bookSet.add(book7);
        bookSet.add(book8);
        bookSet.add(book9);
        bookSet.add(book10);

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int medianPubYear = medianAdapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(2003, medianPubYear);
    }
}

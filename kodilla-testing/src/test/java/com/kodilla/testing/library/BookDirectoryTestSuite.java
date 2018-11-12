package com.kodilla.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.internal.verification.VerificationModeFactory.times;

public class BookDirectoryTestSuite {

    @Test
    public void testListBooksWithConditionsReturnList() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }


    @Test
    public void testListBooksWithConditionMoreThan20() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }


    @Test
    public void testListOfNoBooksInHandsOf() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("Andrzej", "Nowak", "60101005556");
        List<Book> listOfNoBooks = new ArrayList<Book>();
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(listOfNoBooks);

        //When
        List<Book> noBooksInHand = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        assertEquals(listOfNoBooks.size(), noBooksInHand.size());
    }

    @Test
    public void testListOfOneBookInHandsOf() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("Andrzej", "Nowak", "60101005556");
        List<Book> listOfOneBook = new ArrayList<>();
        Book book1 = new Book("Potop","Henryk Sienkiewicz", 1886);
        listOfOneBook.add(book1);

        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(listOfOneBook);

        //Then
        List<Book> oneBookInHands = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        assertEquals(listOfOneBook.size(), oneBookInHands.size());
    }

    @Test
    public void testListOfFiveBooksInHandsOf() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("Andrzej", "Nowak", "60101005556");
        List<Book> listOfFiveBooks = new ArrayList<Book>();
        Book book1 = new Book("Potop","Henryk Sienkiewicz", 1886);
        Book book2 = new Book("Krzyżacy","Henryk Sienkiewicz",  1900);
        Book book3 = new Book("Ogniem i mieczem", "Henryk Sienkiewicz",  1884);
        Book book4 = new Book("Pan Wołodyjowski", "Henryk Sienkiewicz", 1888);
        Book book5 = new Book("Quo vadis","Henryk Sienkiewicz", 1896);
        listOfFiveBooks.add(book1);
        listOfFiveBooks.add(book2);
        listOfFiveBooks.add(book3);
        listOfFiveBooks.add(book4);
        listOfFiveBooks.add(book5);

        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(listOfFiveBooks);

        //Then
        List<Book> fiveBooksInHands = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        assertEquals(listOfFiveBooks.size(), fiveBooksInHands.size());
    }
}
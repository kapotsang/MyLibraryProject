package com.softwareinstitute.training.kptsang;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibraryTest {

    @Test
    public void testGenreMethod(){
        Fiction testFiction = new Fiction("Nineteen Eighty Four", "George Orwell", 328, "Dystopian");
        assertEquals("This genre is not correct", "Dystopian", testFiction.getGenre());
    }
    @Test
    public void testTopicMethod(){
        NonFiction testNonFiction = new NonFiction("LEGO Star Wars Visual Dictionary", "DK",160, "Lego");
        assertEquals("This topic isn't correct", "Lego", testNonFiction.getTopic());
    }
    @Test
    public void testDirectorMethod(){
        Movie testMovie = new Movie("Kill Bill", 2, "Quentin Tarantino",215);
        assertEquals("This isn't the right director", "Quentin Tarantino", testMovie.getDirector());
    }
    @Test
    public void testRuntimeMethod(){
        Movie testMovie = new Movie("Kill Bill", 2, "Quentin Tarantino",215);
        assertEquals("This runtime is wrong", 215, testMovie.getRuntime());
    }
    @Test
    public void testNumberOfEpisodes1(){
        TVShow testTVShow = new TVShow("Seinfeld", 8, 180);
        assertEquals("This isn't the right episode count", 180, testTVShow.getNumberOfEpisodes1());
    }
    @Test
    public void testAuthor(){
        Book testBook = new Book("Of Mice and Men", "John Steinbeck", 107);
        assertEquals("This isn't the right author", "John Steinbeck", testBook.getAuthor());
    }
    @Test
    public void testName(){
        Book testBook = new Book("Of Mice and Men", "John Steinbeck", 107);
        assertEquals("This isn't the right title", "Of Mice and Men", testBook.getName());

        }
    @Test
    public void testPages(){
        Book testPages = new Book("Of Mice and Men", "John Steinbeck", 107);
        assertEquals("This isn't the correct page count", 107, testPages.getPages());
    }
    @Test
    public void testNoOfDiscs(){
        Disc testDisc = new Disc("Blue Planet",4);
        assertEquals("This is the wrong number of discs", 4, testDisc.getNoOfDiscs());
    }


    }


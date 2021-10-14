package com.softwareinstitute.training.kptsang;

public class NonFiction extends Book{

        private String Topic;
        public int pages;

        public NonFiction(String name, String Author, int pages) {
                super(name, Author, pages);
        }

        // public NonFiction(String name) {
         //       super(name);
       // }

        public void Topic(String topicArea){
                System.out.println("This book's topic is "+topicArea );
        }

}

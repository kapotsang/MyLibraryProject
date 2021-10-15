package com.softwareinstitute.training.kptsang;

public class NonFiction extends Book{

        private String topic;
        private int pages;

        public NonFiction(String name, String Author, int pages, String topic) {
                super(name, Author, pages);
                this.topic = topic;
        }

        //methods
        public void setTopic(String topic){
                this.topic = topic;
        }
        public String getTopic(){
                return topic;
        }
}

package com.example.demo2;

public class demoGreeting {

        private final long id;
        private final String content;

        public demoGreeting(long id, String content) {
            this.id = id;
            this.content = content;
            //naman
        }

        public long getId() {
            return id;
        }

        public String getContent() {
            return content;
        }
}

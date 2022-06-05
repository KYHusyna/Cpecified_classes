package com;

public class Journal   {
    int pages = 1, coast = 2;

class article {
    String topic = "healthy", how = "exercise";

    void journalData(){
        System.out.println("\nJournal have next topics");
    }

}

    void output() {
        Journal.article info = new Journal.article();
        info.journalData();
        System.out.println(info.topic + " " + info.how);
    }
}


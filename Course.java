package com.example.project;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Course {
    private final StringProperty crn;
    private final StringProperty professor;
    private final StringProperty days;
    private final StringProperty time;
    private final StringProperty location;

    public Course(String crn, String professor, String days, String time, String location) {
        this.crn = new SimpleStringProperty(crn);
        this.professor = new SimpleStringProperty(professor);
        this.days = new SimpleStringProperty(days);
        this.time = new SimpleStringProperty(time);
        this.location = new SimpleStringProperty(location);
    }

    public StringProperty crnProperty() { return crn; }
    public StringProperty professorProperty() { return professor; }
    public StringProperty daysProperty() { return days; }
    public StringProperty timeProperty() { return time; }
    public StringProperty locationProperty() { return location; }
}
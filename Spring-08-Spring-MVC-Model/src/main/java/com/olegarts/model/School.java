package com.olegarts.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
public class School {

    private String name;
    private List<String> subjects;
    private int studentCount;
    private boolean isOpen;
    private double averageGrade;
    private LocalDate establishedDate;
}

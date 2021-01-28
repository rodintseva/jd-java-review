package com.cybertek.oop.inheritance;

import com.cybertek.oop.encapsulation.User;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.stream.Stream;

public class Project extends BaseEntity {


    private  String projectCode;
    private String projectName;
    private User assignedManager;
    private LocalDate startDate;
    private LocalDate endDate;
    private String projectStatus;
    private String projectDetails;

    public Project(long id, LocalDateTime insertDateTime,
                   long insertUserId, LocalDateTime lastUpdateDate,
                   long lastUpdateUserId, String projectCode,
                   String projectName, User assignedManager,
                   LocalDate startDate, LocalDate endDate,
                   String projectStatus, String projectDetails) {
        super(id, insertDateTime, insertUserId, lastUpdateDate, lastUpdateUserId);
        this.projectCode = projectCode;
        this.projectName = projectName;
        this.assignedManager = assignedManager;
        this.startDate = startDate;
        this.endDate = endDate;
        this.projectStatus = projectStatus;
        this.projectDetails = projectDetails;
    }
}

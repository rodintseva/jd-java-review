package com.cybertek.oop.inheritance;

import com.cybertek.enums.Status;
import com.cybertek.oop.encapsulation.User;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Project extends BaseEntity {


    private  String projectCode;
    private String projectName;
    private User assignedManager;
    private LocalDate startDate;
    private LocalDate endDate;
    private Status projectStatus;
    private String projectDetails;

    public Project(long id, LocalDateTime insertDateTime,
                   long insertUserId, LocalDateTime lastUpdateDate,
                   long lastUpdateUserId, String projectCode,
                   String projectName, User assignedManager,
                   LocalDate startDate, LocalDate endDate,
                   Status projectStatus, String projectDetails) {
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

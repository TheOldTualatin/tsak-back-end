package com.task.pojo;


import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Task {
  private String id;
  private String userId;
  private String taskName;
  private String taskDesc;
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date releaseTime;
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date taskDuration;
  private Long taskState;

  public String getId()
  {
    return id;
  }

  public void setId(String id)
  {
    this.id = id;
  }

  public String getUserId()
  {
    return userId;
  }

  public void setUserId(String userId)
  {
    this.userId = userId;
  }

  public String getTaskName()
  {
    return taskName;
  }

  public void setTaskName(String taskName)
  {
    this.taskName = taskName;
  }

  public String getTaskDesc()
  {
    return taskDesc;
  }

  public void setTaskDesc(String taskDesc)
  {
    this.taskDesc = taskDesc;
  }

  public Date getReleaseTime()
  {
    return releaseTime;
  }

  public void setReleaseTime(Date releaseTime)
  {
    this.releaseTime = releaseTime;
  }

  public Date getTaskDuration()
  {
    return taskDuration;
  }

  public void setTaskDuration(Date taskDuration)
  {
    this.taskDuration = taskDuration;
  }

  public Long getTaskState()
  {
    return taskState;
  }

  public void setTaskState(Long taskState)
  {
    this.taskState = taskState;
  }
}

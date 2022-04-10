package com.task.pojo;


import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Task {

  private String id;
  private String taskName;
  private long taskTotal;
  private long receiveNumber;
  private String taskDesc;
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date releaseTime;
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date taskDuration;
  private long taskState;

  public String getId()
  {
    return id;
  }

  public void setId(String id)
  {
    this.id = id;
  }

  public String getTaskName()
  {
    return taskName;
  }

  public void setTaskName(String taskName)
  {
    this.taskName = taskName;
  }

  public long getTaskTotal()
  {
    return taskTotal;
  }

  public void setTaskTotal(long taskTotal)
  {
    this.taskTotal = taskTotal;
  }

  public long getReceiveNumber()
  {
    return receiveNumber;
  }

  public void setReceiveNumber(long receiveNumber)
  {
    this.receiveNumber = receiveNumber;
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

  public long getTaskState()
  {
    return taskState;
  }

  public void setTaskState(long taskState)
  {
    this.taskState = taskState;
  }
}

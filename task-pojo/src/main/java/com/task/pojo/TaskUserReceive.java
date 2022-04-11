package com.task.pojo;


public class TaskUserReceive {

  private String taskId;
  private String userId;
  private long taskState;


  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public long getTaskState() {
    return taskState;
  }

  public void setTaskState(long taskState) {
    this.taskState = taskState;
  }

}

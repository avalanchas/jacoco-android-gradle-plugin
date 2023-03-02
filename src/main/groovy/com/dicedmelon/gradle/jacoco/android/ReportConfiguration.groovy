package com.dicedmelon.gradle.jacoco.android

public class ReportConfiguration {

  private boolean required

  ReportConfiguration(boolean required) {
    this.required = required
  }

  public boolean isRequired() {
    required
  }

  public void required(boolean required) {
    this.required = required
  }
}

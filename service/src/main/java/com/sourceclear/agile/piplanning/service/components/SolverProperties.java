package com.sourceclear.agile.piplanning.service.components;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.net.URI;

@Validated
@Component
@ManagedResource
@ConfigurationProperties(prefix = "solver")
public class SolverProperties {

  ///////////////////////////// Class Attributes \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

  ////////////////////////////// Class Methods \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

  //////////////////////////////// Attributes \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

  @NotNull
  private boolean remote;

  private URI uri;

  private int timeout; // seconds

  /////////////////////////////// Constructors \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

  ////////////////////////////////// Methods \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

  //------------------------ Implements:

  //------------------------ Overrides:

  //---------------------------- Abstract Methods -----------------------------

  //---------------------------- Utility Methods ------------------------------

  //---------------------------- Property Methods -----------------------------

  public boolean isRemote() {
    return remote;
  }

  public void setRemote(boolean remote) {
    this.remote = remote;
  }

  public URI getUri() {
    return uri;
  }

  public void setUri(URI uri) {
    this.uri = uri;
  }

  public int getTimeout() {
    return timeout;
  }

  public void setTimeout(int timeout) {
    this.timeout = timeout;
  }
}

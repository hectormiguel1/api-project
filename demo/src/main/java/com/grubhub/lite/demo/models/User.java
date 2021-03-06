package com.grubhub.lite.demo.models;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.*;


/**
 * Class User
 */
@Entity
@Table

public class User {

  //
  // Fields
  //

  private @Id @GeneratedValue  Long userID;
  private String uniqueIdentifier;
  
  //
  // Constructors
  //
  public User () { };

  public User(String uniqueIdentifier) {
    this.uniqueIdentifier = uniqueIdentifier;
  }
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of userID
   * @param newVar the new value of userID
   */
  public void setUserID (Long newVar) {
    userID = newVar;
  }

  /**
   * Get the value of userID
   * @return the value of userID
   */
  public Long getUserID () {
    return userID;
  }

  /**
   * Set the value of uniqueIdentifier
   * @param newVar the new value of uniqueIdentifier
   */
  public void setUniqueIdentifier (String newVar) {
    uniqueIdentifier = newVar;
  }

  /**
   * Get the value of uniqueIdentifier
   * @return the value of uniqueIdentifier
   */
  public String getUniqueIdentifier () {
    return uniqueIdentifier;
  }

  //
  // Other methods
  //


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    User user = (User) o;

    return Objects.equals(uniqueIdentifier, user.uniqueIdentifier);
  }

  @Override
  public int hashCode() {
    int result = userID != null ? userID.hashCode() : 0;
    result = 31 * result + (uniqueIdentifier != null ? uniqueIdentifier.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "User{" +
            "userID=" + userID +
            ", uniqueIdentifier='" + uniqueIdentifier + '\'' +
            '}';
  }
}

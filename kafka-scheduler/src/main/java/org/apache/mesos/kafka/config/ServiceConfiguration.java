package org.apache.mesos.kafka.config;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

import java.util.Objects;

public class ServiceConfiguration {
    @JsonProperty("name")
    private String name;
    @JsonProperty("user")
    private String user;
    @JsonProperty("placementStrategy")
    private String placementStrategy;
    @JsonProperty("planStrategy")
    private String planStrategy;
    @JsonProperty("role")
    private String role;
    @JsonProperty("principal")
    private String principal;

    @JsonCreator
    public ServiceConfiguration(
            @JsonProperty("name")String name,
            @JsonProperty("user")String user,
            @JsonProperty("placementStrategy")String placementStrategy,
            @JsonProperty("planStrategy")String planStrategy,
            @JsonProperty("role")String role,
            @JsonProperty("principal")String principal) {
        this.name = name;
        this.user = user;
        this.placementStrategy = placementStrategy;
        this.planStrategy = planStrategy;
        this.role = role;
        this.principal = principal;
    }

    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    public String getPlacementStrategy() {
        return placementStrategy;
    }

    @JsonProperty("placementStrategy")
    public void setPlacementStrategy(String placementStrategy) {
        this.placementStrategy = placementStrategy;
    }

    public String getPlanStrategy() {
        return planStrategy;
    }

    @JsonProperty("planStrategy")
    public void setPlanStrategy(String planStrategy) {
        this.planStrategy = planStrategy;
    }

    public String getRole() {
        return role;
    }

    @JsonProperty("role")
    public void setRole(String role) {
        this.role = role;
    }

    public String getPrincipal() {
        return principal;
    }

    @JsonProperty("principal")
    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceConfiguration that = (ServiceConfiguration) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(user, that.user) &&
                Objects.equals(placementStrategy, that.placementStrategy) &&
                Objects.equals(role, that.role) &&
                Objects.equals(principal, that.principal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, user, placementStrategy, role, principal);
    }

    @Override
    public String toString() {
        return "ServiceConfiguration{" +
                "name='" + name + '\'' +
                ", user='" + user + '\'' +
                ", placementStrategy='" + placementStrategy + '\'' +
                ", planStrategy='" + planStrategy + '\'' +
                ", role='" + role + '\'' +
                ", principal='" + principal + '\'' +
                '}';
    }
}

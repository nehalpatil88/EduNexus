
package com.hexagon.school_service.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "school")
public class school {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String schoolname;
    private String location;
    private String principalname;

    public school() {
    }

    public school(String schoolname, String location, String principalname) {
        this.schoolname = schoolname;
        this.location = location;
        this.principalname = principalname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolname;
    }

    public void setSchoolName(String schoolName) {
        this.schoolname = schoolname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPrincipalname() {
        return principalname;
    }

    public void setPrincipalName(String principalname) {
        this.principalname = principalname;
    }
}

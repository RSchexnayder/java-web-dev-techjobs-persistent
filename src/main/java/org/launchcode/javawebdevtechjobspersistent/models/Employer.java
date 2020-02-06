package org.launchcode.javawebdevtechjobspersistent.models;

import org.launchcode.javawebdevtechjobspersistent.models.data.EmployerRepository;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {



    @NotBlank
    @Size(max = 255)
    private String location;

    @OneToMany
    @JoinColumn
    private List<Job> jobs = new ArrayList<>();

    public Employer(@NotBlank @Size(max = 255) String location) {
        this.location = location;
    }

    public Employer(){}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<String> getEmployerNames (){
        EmployerRepository employerRepository = null;
        Iterable<Employer> employerList = employerRepository.findAll();
        List<String> employerNames = new ArrayList<>();
        for (Employer employer : employerList) {
            String employerName = employer.getName();
            employerNames.add(employerName);
        }
        return employerNames;
    }
}

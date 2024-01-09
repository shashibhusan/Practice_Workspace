package com.project.department.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.List;

@Component
@ConfigurationProperties
public class ApplicationClass {
    List<String> profiles;
    HashMap<String,Integer> hashMap=new HashMap();
    @Value("${applicationTest}")
    String applicationTest;
    public List<String> getProfiles() {
        return profiles;
    }

    public void setProfiles(List<String> profiles) {
        this.profiles = profiles;
    }

    public HashMap<String, Integer> getHashMap() {
        return hashMap;
    }

    public void setHashMap(HashMap<String, Integer> hashMap) {
        this.hashMap = hashMap;
    }

    public String getApplicationTest() {
        return applicationTest;
    }

    public void setApplicationTest(String applicationTest) {
        this.applicationTest = applicationTest;
    }
}

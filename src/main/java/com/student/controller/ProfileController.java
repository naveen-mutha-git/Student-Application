package com.student.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.student.entity.Profile;
import com.student.service.ProfileService;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    // Save profile
    @PostMapping("/save")
    public Profile saveProfile(@RequestBody Profile profile) {
        return profileService.saveProfile(profile);
    }

    // Get all profiles
    @GetMapping("/all")
    public List<Profile> getAllProfiles() {
        return profileService.getAllProfiles();
    }

    // Get profile by ID
    @GetMapping("/{id}")
    public Optional<Profile> getProfileById(@PathVariable String id) {
        return profileService.getProfileById(id);
    }

    // Update profile
    @PutMapping("/update/{id}")
    public Profile updateProfile(@PathVariable String id,
                                 @RequestBody Profile profile) {
        return profileService.updateProfile(id, profile);
    }

    // Delete profile
    @DeleteMapping("/delete/{id}")
    public String deleteProfile(@PathVariable String id) {
        return profileService.deleteProfile(id);
    }
}
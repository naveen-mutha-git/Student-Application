package com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Profile;
import com.student.repository.ProfileRepo;

@Service
public class ProfileService {

    @Autowired
    private ProfileRepo profileRepo;

    // Save profile
    public Profile saveProfile(Profile profile) {
        return profileRepo.save(profile);
    }

    // Get all profiles
    public List<Profile> getAllProfiles() {
        return profileRepo.findAll();
    }

    // Get profile by ID
    public Optional<Profile> getProfileById(String id) {
        return profileRepo.findById(id);
    }

    // Update profile
    public Profile updateProfile(String id, Profile profileDetails) {

        Profile profile = profileRepo.findById(id).get();

        profile.setAddress(profileDetails.getAddress());
        profile.setPhone(profileDetails.getPhone());
        profile.setGender(profileDetails.getGender());

        return profileRepo.save(profile);
    }

    // Delete profile
    public String deleteProfile(String id) {
        profileRepo.deleteById(id);
        return "Profile deleted successfully";
    }
}
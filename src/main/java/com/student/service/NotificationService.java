package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Notification;
import com.student.repository.NotificationRepo;

@Service
public class NotificationService {

    @Autowired
    private NotificationRepo notificationRepo;

    public Notification saveNotification(Notification notification) {
        return notificationRepo.save(notification);
    }

    public List<Notification> getAllNotifications() {
        return notificationRepo.findAll();
    }

    public String deleteNotification(String id) {
        notificationRepo.deleteById(id);
        return "Notification deleted";
    }
}
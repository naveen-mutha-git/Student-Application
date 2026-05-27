package com.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.entity.Notification;

@Repository
public interface NotificationRepo extends JpaRepository<Notification, String> {

}
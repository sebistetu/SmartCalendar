package com.getarrays.calendarmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.getarrays.calendarmanager.model.UserModel;

public interface UserRepo extends JpaRepository<UserModel, Long> {

}

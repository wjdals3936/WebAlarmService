package com.pjm.alarmdemo1.data.repository;

import com.pjm.alarmdemo1.data.entity.Alarm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlarmRepository extends JpaRepository<Alarm, Integer> {
}

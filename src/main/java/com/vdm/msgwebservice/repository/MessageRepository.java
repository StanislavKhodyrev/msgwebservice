package com.vdm.msgwebservice.repository;

import com.vdm.msgwebservice.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}

package com.deproject.deproject.repository;

import com.deproject.deproject.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
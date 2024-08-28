package com.riwi.APIRESTful.repository;

import com.riwi.APIRESTful.models.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventRepository extends JpaRepository<EventEntity, UUID> {
}

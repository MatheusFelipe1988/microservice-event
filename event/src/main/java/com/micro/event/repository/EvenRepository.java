package com.micro.event.repository;

import com.micro.event.entity.Event;
import jakarta.annotation.Nonnull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface EvenRepository extends JpaRepository<Event, String> {
    @Query(value = "SELECT * FROM event e WHERE parsedatetime(e.date, dd/MM/yyyy) > :currentDate", nativeQuery = true)
    List<Event> findComingEvent(@Param("currentDate")LocalDateTime currentDate);

    @Nonnull
    Optional<Event> findById(@Nonnull String id);

}

package com.micro.event.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity(name = "subscription")
@Table(name = "subscription")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Event event;
    private String participantEmail;
}

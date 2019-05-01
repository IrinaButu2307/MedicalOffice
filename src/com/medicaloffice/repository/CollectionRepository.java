package com.medicaloffice.repository;


import com.medicaloffice.models.Appointment;

import java.util.function.Function;
import java.util.stream.Collectors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public final class CollectionRepository implements AppointmentRepository {
    private final Map<Long, Appointment> appointments = new HashMap<>();


    @Override
    public Optional<Appointment> findById(Long id) {
        return Optional.ofNullable(appointments.get(id));
    }

    @Override
    public List<Appointment> getAll() {
        return new ArrayList<>(appointments.values());
    }

    @Override
    public Long put(Appointment item) {
        appointments.put(item.getId(), item);
        return item.getId();
    }

    @Override
    public List<Long> putAll(List<Appointment> items) {
        final List<Long> ids = items.stream()
                .map(Appointment::getId)
                .collect(Collectors.toList());

        final Map<Long, Appointment> newValues = items.stream()
                .collect(Collectors.toMap(Appointment::getId, Function.identity()));

        appointments.putAll(newValues);

        return ids;
    }
}

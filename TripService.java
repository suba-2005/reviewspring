package com.java.trip.Service;

import com.java.trip.Model.Trip;
import com.java.trip.Repository.TripRepository;

import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TripService {

    @Autowired
    private TripRepository tripRepo;

    public Trip createTrips(@NonNull Trip trip) {
        return tripRepo.save(trip);
    }

    public List<Trip> getAllTrips() {
        return tripRepo.findAll();
    }

    public Trip getTicketById(@NonNull Integer id) {
        return tripRepo.findById(id).orElse(null);
    }

    public boolean updateTrips(int id, Trip trip) {
        if (getTicketById(id) == null) {
            return false;
        }
        try {
            tripRepo.save(trip);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean deleteTrips(int id) {
        if (getTicketById(id) == null) {
            return false;
        }
        tripRepo.deleteById(id);
        return true;
    }
}
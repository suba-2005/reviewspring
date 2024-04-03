package com.java.trip.Controller;

import com.java.trip.Model.Trip;
import com.java.trip.Service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TripController {

    @Autowired
    private TripService tripService;

    @PostMapping("/trip")
    public ResponseEntity<Trip> add(@RequestBody Trip trip) {
        Trip newtrip = tripService.createTrips(trip);
        if (newtrip != null) {
            return new ResponseEntity<>(newtrip, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/trips")
    public ResponseEntity<List<Trip>> getAllTrips() {
        List<Trip> trips = tripService.getAllTrips();
        if (!trips.isEmpty()) {
            return new ResponseEntity<>(trips, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/trip/{tripId}")
    public ResponseEntity<Trip> updateTrip(@PathVariable int tripId, @RequestBody Trip trip) {
        boolean updated = tripService.updateTrips(tripId, trip);
        if (updated) {
            return new ResponseEntity<>(trip, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/trip/{tripId}")
    public ResponseEntity<Boolean> deleteTrip(@PathVariable int tripId) {
        boolean deleted = tripService.deleteTrips(tripId);
        if (deleted) {
            return new ResponseEntity<>(true, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(false, HttpStatus.NOT_FOUND);
        }
    }
}
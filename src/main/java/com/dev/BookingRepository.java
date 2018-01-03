package com.dev;

/**
 * Created by N5608296 on 03/01/2018 003.
 */
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface BookingRepository extends MongoRepository<Booking, String>  {

    /**
     * This method will find an Boooking instance in the database by its departure.
     * Note that this method is not implemented and its working code will be
     * automatically generated from its signature by Spring Data JPA.
     */
    public Booking findByDeparture(String departure);
}

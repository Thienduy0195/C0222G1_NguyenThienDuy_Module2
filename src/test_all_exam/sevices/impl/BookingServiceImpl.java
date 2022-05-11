package test_all_exam.sevices.impl;

import test_all_exam.models.booking.Booking;
import test_all_exam.sevices.IServices;
import test_all_exam.utils.NewReadAndWrite;

import java.util.Set;
import java.util.TreeSet;

public class BookingServiceImpl extends NewReadAndWrite implements IServices {
    Set<Booking> bookingSet = new TreeSet<>();

    @Override
    public void addNewItem() {
        bookingSet = NewReadAndWrite.readBookingFromCsv();
        int id = 1;
        if (!bookingSet.isEmpty()) {
            id = bookingSet.size() + 1;
        }
    }

    @Override
    public void displayItem() {

    }

    @Override
    public void editItem() {

    }
}

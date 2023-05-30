
// import Java's array list interface
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

class TimeSlot { // timeslot class
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    // constructor
    public TimeSlot(LocalDateTime startTime, LocalDateTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    // getters and setters
    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
}

class Person { // Person class
    private String name;
    private List<TimeSlot> availability;

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TimeSlot> getAvailability() {
        return availability;
    }

    public void setAvailability(List<TimeSlot> availability) {
        this.availability = availability;
    }
}

class Schedule { // schedule class
    private List<TimeSlot> slots; // stores a list of timeslot objects in a list called slots

    public Schedule() { // constructor; creates a new arraylist with list of time slots
        this.slots = new ArrayList<>();
    }

    public void addTimeSlot(TimeSlot timeSlot) { // add a timeslot to the array list
        slots.add(timeSlot);
    }

    public void removeTimeSlot(TimeSlot timeSlot) { // remove a timeslot from array list
        slots.remove(timeSlot);
    }

    public List<TimeSlot> getSlots() {
        return slots;
    }

}


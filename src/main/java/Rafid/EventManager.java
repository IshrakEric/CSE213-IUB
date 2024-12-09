package Rafid;

import static com.example.oopproject2024.Volunteer.readAndReturnArrayList;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EventManager extends User implements Serializable {
    private ArrayList<Events> participatedEvents;

    public EventManager(Integer id, String name, String email, Integer age, String password, String location, ArrayList<Events> participatedEvents) {
        super(name, email, password, location, id, age);
        this.participatedEvents = new ArrayList<>();
    }
    // File Writing Method
    public static boolean registerEventManagerToFile(Integer id, String name, String email, Integer age, String password, String location, ArrayList<Events> participatedEvents) throws IOException {

        EventManager eventManager = new EventManager(id, name, email, age, password, location, participatedEvents);

        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {

            f = new File("EventManager.bin");

            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);

            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(eventManager);
            return true;

        } catch (Exception e) {
            System.out.println("Error writing Event Manager Object to binary file");
            return false;
        } finally {
            oos.close();
        }

    }

    // File reading method
    public static ArrayList<EventManager> readAndReturnEventManagerArrayList() throws IOException, ClassNotFoundException {

        FileInputStream fis = null;
        try {

            fis = new FileInputStream("EventManager.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<EventManager> eventManagerArrayList = new ArrayList<>();

            try {
                // The File reading starts
                while (true) {
                    Object obj = ois.readObject();
                    if (obj instanceof EventManager) {
                        EventManager deserializedEventManager = (EventManager) obj;
                        System.out.println(deserializedEventManager.toString());
                        eventManagerArrayList.add(deserializedEventManager);
                    }
                }
            } catch (EOFException e) {
                // End of file reached (EOFException thrown)
                // No more objects to read, so we stop the loop
                System.out.println("FIle has been read to the end.");
            }
            ois.close();
            fis.close();
            return eventManagerArrayList; // return the read objects as deserialized objects ArrayList

        } catch (FileNotFoundException ex) {
            Logger.getLogger(EventManager.class.getName()).log(Level.SEVERE, null, ex);
            // File not found Exception (EOFException thrown)
            System.out.println("File was not found.");
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(EventManager.class.getName()).log(Level.SEVERE, null, ex);
                // File opening exception
            }
        }
        return null; // Return Null if file couldn't be read
    }

    public ArrayList<Events> getParticipatedEvents() {
        return participatedEvents;
    }

    public void setParticipatedEvents(ArrayList<Events> participatedEvents) {
        this.participatedEvents = participatedEvents;
    }

    // Add events to the eventManager instance instead of setting a new list every time.
    public void addEvent(Events eventsAdded) {
        if (this.participatedEvents != null) {
            this.participatedEvents.add(eventsAdded);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "EventManager : " + super.toString() + ", ParticipatedEvents=" + participatedEvents;
    }

    // When adding new events, we need to update the change to the serialized .bin file
    public static void updateEventManagerInFile(EventManager eventManager) throws IOException, ClassNotFoundException {
        ArrayList<EventManager> eventManagerList = readAndReturnEventManagerArrayList();

        for (int i = 0; i < eventManagerList.size(); i++) {
            if (eventManagerList.get(i).getId().equals(eventManager.getId())) {
                eventManagerList.set(i, eventManager);
                break;
            }
        }

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("EventManager.bin"));
        for (EventManager v : eventManagerList) {
            oos.writeObject(v);
        }
        oos.close();
    }


}

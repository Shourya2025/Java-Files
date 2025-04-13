package Learning;

class Subject {
    private int maxMarks;
    private String subId;
    private int marksObtain;
    private String name;

    public int getMaxMarks() {
        return maxMarks;
    }

    public String getSubId() {
        return subId;
    }

    public String getName() {
        return name;
    }

    public int getMarksObtain() {
        return marksObtain;
    }

    public void setMarksObtain(int m) {
        marksObtain = m;
    }

    public void setMaxMarks(int max) {
        maxMarks = max;
    }

    // Constructor with ID and name
    public Subject(String sid, String nam) {
        subId = sid;
        name = nam;
    }

    // Constructor with ID, name, and max marks
    public Subject(String sid, String nam, int max) {
        subId = sid;
        name = nam;
        maxMarks = max;
    }

    @Override
    public String toString() {
        return "\nSubject Id: " + subId + "\nSubject Name: " + name + "\nMaximum Marks: " + maxMarks;
    }
}

public class StudentChallengeConstructor1 {
    public static void main(String[] args) {
        // Creating an array of Subject objects
        Subject subs[] = new Subject[3];
        subs[0] = new Subject("s101", "DS", 100);
        subs[1] = new Subject("s102", "Algorithm", 100);
        subs[2] = new Subject("s103", "OS", 100);

        // Printing all subject details
        for (Subject s : subs) {
            System.out.println(s);
            System.out.println("--------------------------------------");
        }
    }
}

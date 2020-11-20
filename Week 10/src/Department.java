public class Department {
    private Lecturer[] lecturers;
    private int numLecturers;

    public Department() {
        lecturers = new Lecturer[5];
        numLecturers = 0;
    }

    public int getNumLecturers() {
        return numLecturers;
    }

    public Lecturer[] getLecturers() {
        return lecturers;
    }

    public Lecturer addLecturer(String firstName, String lastName, String position) {
        Lecturer lecturer = null;
        if (position != null) {
            lecturer = new Lecturer(firstName, lastName, position); // create new Lecturer object
            lecturers[numLecturers] = lecturer; // add to array at next empty position
            numLecturers = numLecturers + 1; // increment position
        }
        return lecturer;
    }

    public Lecturer getLecturer(int ID) {
        for (int i = 0; i < numLecturers; i++) {
            if (lecturers[i].getID() == ID)
                return lecturers[i]; // lecturer ID was found
        }
        return null; // lecturer ID was not found
    }
}

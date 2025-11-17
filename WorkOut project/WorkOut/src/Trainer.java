public class Trainer {
    private String name;
    private String specialty;


    public Trainer(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    // Getter Methods
    /*
     * Gets the name of the trainer
     * @return name of the trainer
     */
    public String getName() {
        return name;
    }

    /*
     * Gets the specialty of the trainer
     * @return specialty of the trainer
     */
    public String getSpecialty() {
        return specialty;
    }

    // Setter Methods

    /*
     * Sets the name of the trainer
     * @param the new name of the trainer
     */
    public void setName(String name) {
        this.name = name;
    }

    /*
     * Sets the specialty of the trainer
     * @param the new specialty of the trainer
     */
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}



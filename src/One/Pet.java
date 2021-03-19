package One;



public class Pet {
private String petName;

    public Pet() {
    }

    public Pet(String petName) {
        this.petName = petName;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    @Override
    public String toString() {
        return " petName= " + petName ;
    }
}

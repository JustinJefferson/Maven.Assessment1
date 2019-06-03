package com.zipcodewilmington.assessment1.part3;


/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    private String name;
    private Pet[] pets;
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        if(pets != null) {
            this.pets = pets;
            for(Pet pet : this.pets) {
                pet.setOwner(this);
            }
        }
        else{
            this.pets = new Pet[1];
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {

        Boolean spaceAvailible = false;

        for(int i = 0; i < pets.length; i++) {
            if(pets[i] == null) {
                pets[i] = pet;
                spaceAvailible = true;
            }

        }



        if(!spaceAvailible) {

            Pet[] newPets = new Pet[pets.length + 1];
            Integer index = 0;

            for (Pet thisPet : pets) {
                newPets[index] = thisPet;
                index++;
            }

            newPets[newPets.length - 1] = pet;

            pets = newPets;
        }



    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {

        Pet[] newPets = new Pet[pets.length];
        Integer index = 0;

        for(Pet thisPet : pets) {
            if(!thisPet.equals(pet)) {
                newPets[index] = thisPet;
                index++;
            }
        }

        pets = newPets;

    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {

        Boolean owner = false;

        for(Pet thisPet : pets) {
            if(thisPet.equals(pet)) {
                owner = true;
                break;
            }
        }
        return owner;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {

        Integer age = null;

        for(Pet pet : pets) {
            if((age == null) || (pet.getAge() < age)) {
                age = pet.getAge();
            }
        }
        return age;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer age = null;

        for(Pet pet : pets) {
            if((age == null) || (pet.getAge() > age)) {
                age = pet.getAge();
            }
        }
        return age;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {

        Float average = (float) 0;

        for(Pet pet : pets) {
            average += pet.getAge();
        }

        average /= pets.length;

        return average;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return pets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return pets;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package books.management;

import java.util.Objects;

/**
 *int id - unique identifier
 *String firstName - author’s first name
 *String lastName - author’s last name
 *
 * @author ABDO
 */
class Author {
    private int id;
    private String firstName;
    private String lastName;
    
    public Author(){
        
    }

    public Author(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Author [id=" + id + ", firstName=" + firstName + ", lastName" + lastName + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Author author = (Author) obj;
        return id == author.id &&
               firstName == this.firstName || firstName != null && firstName.equals(author.firstName) &&
               lastName == this.lastName || lastName != null && lastName.equals(author.lastName);
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + Objects.hash(id , firstName , lastName);
        return result;
    }
    
    
    
}

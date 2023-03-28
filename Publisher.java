/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package books.management;

import java.util.Objects;

/**
 *
 * @author ABDO
 */
class Publisher {
    private int id;
    private String publisherName;

    public Publisher() {
    }

    public Publisher(int id, String publisherName) {
        this.id = id;
        this.publisherName = publisherName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getPublisherName() {
        return publisherName;
    }

    @Override
    public String toString() {
        return "Publisher [id="+ id +", publisher Name=" + publisherName +"]"; 
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        
        Publisher publisher = (Publisher) obj;
        return id == publisher.id &&
               publisherName == publisher.publisherName || Objects.equals(publisherName, publisher.publisherName);
    }

    @Override
    public int hashCode() {
        int prime =31;
        int result = 1;
        result = prime * result + Objects.hash(id , publisherName);
        return result;
    }
    
    
}

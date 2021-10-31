/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.libsbooks;

/**
 *
 * @author scherman
 */
public class Book {
    
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    private String title;
    private int edition;
    private int publishingDate;
    private String serialNumber;
    private Author author;
    private PublishingCompany publishingCompany;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public int getPublishingDate() {
        return publishingDate;
    }

    public void setPublishingDate(int publishingDate) {
        this.publishingDate = publishingDate;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author autor) {
        this.author = autor;
    }

    public PublishingCompany getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(PublishingCompany publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
    
}

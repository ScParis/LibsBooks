/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.sevices;

import java.util.List;
import com.poo.libsbooks.Book;
import com.poo.libsbooks.Author;
import com.poo.libsbooks.PublishingCompany;
import java.util.ArrayList;



/**
 *
 * @author scherman
 */
public class DataBase {
    private List<Book> books;
    private List<Author> authors;
    private List<PublishingCompany> publishers;

    public DataBase() {
        authors = new ArrayList<>();
        books = new ArrayList<>();
        publishers = new ArrayList<>();
        
    }
       
    public boolean createAuthor(Author author){
        if (author.getId() == 0) {
            author.setId(authors.size() + 1);
        }
        return authors.add(author);
    }
    
    public Author searchAuthor(String name){
        for(Author author : authors){
            if(author.getName().equalsIgnoreCase(name)){
                return author;
            }
        }
        return null;
    }
    
    public Author searchAuthorById(int id){
    for(Author author : authors){
        if(author.getId() == id){
            return author;
        }
    }
    return null;
    }
    
    public boolean deleteAuthor(Author author){
        
        if (authors.contains(author)){
            return authors.remove(author);
        }
        return false;
    }
    
    public Author updateAuthor(Author author){
        
        if(authors.contains(author)){
            deleteAuthor(author);
            authors.add(author);        
        }
        return author;
    
    }
    
    public void insertAuthors(){
        
        Author author = new Author();
        
        author.setId(1);
        author.setName("Autornildo Livrários");
        author.setGender(true);
        authors.add(author);
        
        
        author = new Author();
        author.setId(2);
        author.setName("Ecriturnina De Books");
        author.setGender(false);
        authors.add(author);
        
        author = new Author();
        author.setId(3);
        author.setName("Livranildo Paginários");
        author.setGender(true);
        authors.add(author);
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
    
    
    
}

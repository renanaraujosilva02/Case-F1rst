package com.livraria.catalogo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;                  // ID do livro
    
    								  // Definido como TEXT para tratativa de erro
    @Column(name = "title", columnDefinition = "TEXT")
    private String title;             // Título do livro
    
    @Column(name = "author")
    private String author;            // Autor do livro
    
    @Column(name = "main_genre")
    private String mainGenre;         // Gênero principal
    
    @Column(name = "sub_genre")
    private String subGenre;          // Subgênero
    
    @Column(name = "type")
    private String type;              // Tipo (Ex: eBook, Paperback)
    
    @Column(name = "price")
    private Double price;             // Preço do livro
    
    @Column(name = "rating")
    private Double rating;            // Avaliação
    
    @Column(name = "no_of_people_rated")
    private Integer noOfPeopleRated;   // Número de pessoas que avaliaram
    
    								   // Definido como TEXT para tratativa de erro
    @Column(name = "urls", columnDefinition = "TEXT")
    private String urls;              // URLs relacionadas ao livro

    // Construtores
    public Livro() {}

    public Livro(String title, String author, String mainGenre, String subGenre, 
                 String type, Double price, Double rating, Integer noOfPeopleRated, 
                 String urls) {
        this.title = title;
        this.author = author;
        this.mainGenre = mainGenre;
        this.subGenre = subGenre;
        this.type = type;
        this.price = price;
        this.rating = rating;
        this.noOfPeopleRated = noOfPeopleRated;
        this.urls = urls;
    }

    // Get e Set
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getMainGenre() {
        return mainGenre;
    }

    public void setMainGenre(String mainGenre) {
        this.mainGenre = mainGenre;
    }

    public String getSubGenre() {
        return subGenre;
    }

    public void setSubGenre(String subGenre) {
        this.subGenre = subGenre;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Integer getNoOfPeopleRated() {
        return noOfPeopleRated;
    }

    public void setNoOfPeopleRated(Integer noOfPeopleRated) {
        this.noOfPeopleRated = noOfPeopleRated;
    }

    public String getUrls() {
        return urls;
    }

    public void setUrls(String urls) {
        this.urls = urls;
    }
}
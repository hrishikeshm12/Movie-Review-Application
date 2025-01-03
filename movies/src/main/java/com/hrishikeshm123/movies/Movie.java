package com.hrishikeshm123.movies;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "movies")

public class Movie {

    private ObjectId  id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String poster;
    private String trailerLink;
    private List<String> genres;
    private List<String> backdrops;
    private List<Review> reviewIds;

    // Getters
    public ObjectId getId() {
        return id;
    }

    public String getImdbId() {
        return imdbId;
    }

    public String getTitle() {
        return title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getTrailerLink() {
        return trailerLink;
    }

    public String getPoster() {
        return poster;
    }

    public List<String> getGenres() {
        return genres;
    }

    public List<String> getBackdrops() {
        return backdrops;
    }

    public List<Review> getReviewIds() {
        return reviewIds;
    }


}

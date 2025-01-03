package com.hrishikeshm123.movies;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews") // Fixed the typo in the annotation
@NoArgsConstructor
@AllArgsConstructor
public class Review {

    @Id
    private ObjectId id;
    private String body;

    // Constructor for body
    public Review(String body) {
        this.body = body;
    }

    // Getters and Setters
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    // toString Method
    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", body='" + body + '\'' +
                '}';
    }

    // equals Method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Review review = (Review) o;
        return id.equals(review.id) && body.equals(review.body);
    }

    // hashCode Method
    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (body != null ? body.hashCode() : 0);
        return result;
    }
}

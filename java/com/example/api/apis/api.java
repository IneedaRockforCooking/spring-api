package com.example.api.apis;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.*;

import java.util.List;

@Document(collection="uu")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Api {
    @Id
    private ObjectId id;
    private String title;
    private String releaseDate;

    public Comic(String title, String releaseDate) {
        this.title = title;
        this.releaseDate = releaseDate;
    }
}

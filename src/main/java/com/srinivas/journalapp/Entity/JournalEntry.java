package com.srinivas.journalapp.Entity;

import com.srinivas.journalapp.Enums.Sentiment;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Document
@Data
@NoArgsConstructor
public class JournalEntry {
    private ObjectId id;
    private String title;
    private String content;
    private String author;
    private LocalDateTime dateTime;
    private Sentiment sentiment;
}

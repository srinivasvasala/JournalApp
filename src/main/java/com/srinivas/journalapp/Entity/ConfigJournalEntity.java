package com.srinivas.journalapp.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "config_journal_app")
@Data
@NoArgsConstructor
public class ConfigJournalEntity {
    private String key;
    private String value;
}

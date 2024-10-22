package com.srinivas.journalapp.Service;

import com.srinivas.journalapp.Entity.JournalEntry;
import com.srinivas.journalapp.Repository.JournalEntryRepository;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class JournalService {
    private final JournalEntryRepository journalEntryRepository;

    @Autowired
    public JournalService(JournalEntryRepository journalEntryRepository){
        this.journalEntryRepository = journalEntryRepository;
    }

    public void saveEntry(JournalEntry journalEntry){
        journalEntryRepository.save(journalEntry);
        log.info("Entry Saved");
    }
    public List<JournalEntry> getAllEntries(){
       return journalEntryRepository.findAll();
    }
    public Optional<JournalEntry> getEntryById(ObjectId id){
        return journalEntryRepository.findById(id);
    }

}

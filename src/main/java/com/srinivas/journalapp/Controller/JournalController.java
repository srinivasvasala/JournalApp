package com.srinivas.journalapp.Controller;

import com.srinivas.journalapp.Service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/journal")
public class JournalController {

    private final JournalService journalService;


    @Autowired
    public JournalController(JournalService journalService) {
        this.journalService = journalService;
    }



    @GetMapping("/entries")
    public ResponseEntity<?> getAllEntries() {
        return ResponseEntity.ok(journalService.getAllEntries());
    }

}

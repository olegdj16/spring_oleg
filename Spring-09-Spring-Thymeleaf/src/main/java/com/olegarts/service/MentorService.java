package com.olegarts.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.olegarts.model.Mentor;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Service
public class MentorService {
    private final List<Mentor> mentors = new ArrayList<>();
    private final ObjectMapper objectMapper = new ObjectMapper();

    // ✅ Correct path inside `src/main/resources/data/`
    private static final String FILE_PATH = Paths.get("src", "main", "resources", "data", "mentors.json").toString();

    public MentorService() {
        loadMentorsFromFile(); // Load mentors on startup
    }

    public void saveMentor(Mentor mentor) {
        mentors.add(mentor);
        saveMentorsToFile();  // Save to JSON file
    }

    public List<Mentor> getAllMentors() {
        return mentors;
    }

    // ✅ Save mentors to JSON file
    private void saveMentorsToFile() {
        try {
            File file = new File(FILE_PATH);
            file.getParentFile().mkdirs(); // Ensure `data/` directory exists
            objectMapper.writeValue(file, mentors);
            System.out.println("✅ Mentor data saved to: " + file.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("❌ Error saving mentors.json: " + e.getMessage());
        }
    }

    // ✅ Load mentors from JSON file
    private void loadMentorsFromFile() {
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            System.out.println("ℹ️ No existing mentor data found. Starting fresh.");
            return;
        }

        try {
            List<Mentor> loadedMentors = objectMapper.readValue(file, new TypeReference<>() {});
            mentors.addAll(loadedMentors);
            System.out.println("✅ Loaded " + loadedMentors.size() + " mentors from file.");
        } catch (IOException e) {
            System.err.println("❌ Error loading mentors.json: " + e.getMessage());
        }
    }
}

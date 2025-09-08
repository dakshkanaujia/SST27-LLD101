package com.example.imports;
import java.nio.file.Path;


public class CsvProfileImporter implements ProfileImporter{
    NaiveCsvReader csvReader;
    ProfileService profileService;
    public CsvProfileImporter(NaiveCsvReader csvReader, ProfileService profileService) {
        this.csvReader = csvReader;
        this.profileService = profileService;
    }
    public int importFrom(Path csvFile) {
        int count = 0;
        for (String[] row : csvReader.read(csvFile)) {
            if (row.length < 2) continue; // skip invalid rows
            String id = row[0].trim();
            String displayName = row[1].trim();
            String email = row[2].trim();
            try {
                profileService.createProfile(id, email, displayName);
                count++;
            } catch (Exception e) {
                // log and skip invalid profiles
                System.err.println("Failed to create profile for id " + id + ": " + e.getMessage());
            }
        }
        return count;
    }   
}
package com.example.profiles;

/**
 * Service now delegates to immutable UserProfile.Builder.
 */
public class ProfileService {

    public UserProfile createMinimal(String id, String email) {
        return new UserProfile.Builder(id, email).build();
    }

    public UserProfile createWithDisplayName(String id, String email, String displayName) {
        return new UserProfile.Builder(id, email)
                .displayName(displayName)
                .build();
    }
}

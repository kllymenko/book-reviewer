package ua.klymenko.bookreviewer.enums;

public enum Role {
    ADMIN("Admin"),
    READER("Reader");
    private String role;
    Role(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}

package org.example.model;

import lombok.Value;

public record Message(String title, String body, String senderName) {
}

package com.sl.student.primary.model;

import lombok.Builder;
import lombok.Data;

@Builder
public record KeyValuePair(String key, String value) {
}

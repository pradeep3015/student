package com.sl.student.primary.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
public record Request(String procedureName, List<KeyValuePair> keyValuePairs) {
}

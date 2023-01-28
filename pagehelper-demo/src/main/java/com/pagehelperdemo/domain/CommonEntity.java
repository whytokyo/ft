package com.pagehelperdemo.domain;

import lombok.Data;

import java.util.Map;

@Data
public class CommonEntity {
    private Map<String, Object> params;
}

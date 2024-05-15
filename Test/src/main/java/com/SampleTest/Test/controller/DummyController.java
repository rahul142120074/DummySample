package com.SampleTest.Test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/dummy")
public class DummyController {


    @GetMapping("/somenew")
    public Map<String, String> fetch() {
        Map<String, String> data = new HashMap<>();
        data.put("SOme", "Some");
        return data;
    }
}

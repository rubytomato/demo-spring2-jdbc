package com.example.demo.controller;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@Controller
public class IndexController {

  private final JdbcTemplate jdbcTemplate;

  public IndexController(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  @GetMapping(path = {"/", ""})
  public String index(Model model) {
    model.addAttribute("message", "Hello World");
    List<Map<String, Object>> fruits = jdbcTemplate.queryForList("select * from fruits");
    model.addAttribute("fruits", fruits);
    return "index";
  }

}

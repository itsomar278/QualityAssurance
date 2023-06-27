package com.example.QualityAssurance;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import com.google.gson.JsonObject;

@SpringBootApplication
@RestController
public class QualityAssuranceApplication {


	public static void main(String[] args) {
		SpringApplication.run(QualityAssuranceApplication.class, args);
		System.out.println("HI");
	}

}

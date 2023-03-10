package com.example.springbootwiththymeleaf.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(MyController.class)
public class MyControllerTest {

    @Autowired
    private MyController myController;

    @Autowired
    private MockMvc mockMvc;

    //To check if application context starts or not
    @Test
    public void contextLoads() throws Exception {
        assertThat(myController).isNotNull();
    }

    //To check if index page is shown or not
    @Test
    public void shouldReturnIndexPage() throws Exception {
        this.mockMvc.perform(get("/"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("index"));
    }

    //To check if basic page is shown or not
    @Test
    public void shouldReturnBasicPage() throws Exception {
        this.mockMvc.perform(get("/basic"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("basic"));
    }

    //To check if condition page is shown or not
    @Test
    public void shouldReturnConditionPage() throws Exception {
        this.mockMvc.perform(get("/condition"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("condition"));
    }

    //To check if iteration page is shown or not
    @Test
    public void shouldReturnIterationPage() throws Exception {
        this.mockMvc.perform(get("/iteration"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("iteration"));
    }

    //To check if fragments page is shown or not
    @Test
    public void shouldReturnFragmentsPage() throws Exception {
        this.mockMvc.perform(get("/fragment"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("fragments"));
    }

    //To check if dynamicValueWithFragments page is shown or not
    @Test
    public void shouldReturnDynamicValueWithFragmentsPage() throws Exception {
        this.mockMvc.perform(get("/dynamicValue"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("dynamicValueWithFragments"));
    }

    //To check if about page is shown or not
    @Test
    public void shouldReturnAboutPage() throws Exception {
        this.mockMvc.perform(get("/about"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("inheritence/about"));
    }

    //To check if services page is shown or not
    @Test
    public void shouldReturnServicesPage() throws Exception {
        this.mockMvc.perform(get("/services"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("inheritence/services"));
    }

}

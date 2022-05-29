package io.kubesphere.devops.application;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {

    @Test
    void sayHello() {
        assertEquals("Hello KubeSphere!",new HelloController().SayHello());
    }
}
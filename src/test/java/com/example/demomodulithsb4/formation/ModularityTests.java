package com.example.demomodulithsb4.formation;

import com.example.demomodulithsb4.DemoModulithSb4Application;
import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;

class ModularityTests {

    @Test
    void verifiesModuleStructure() {
        ApplicationModules.of(DemoModulithSb4Application.class).verify();
    }
}
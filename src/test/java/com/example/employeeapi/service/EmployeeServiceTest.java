package com.example.employeeapi.service;

import com.example.employeeapi.model.Employee;
import com.example.employeeapi.repository.EmployeeRepository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeServiceTest {

    @Mock
    private EmployeeRepository employeeRepository;

    @InjectMocks
    private EmployeeService employeeService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetEmployeeById() {
        // Create an Employee object
        Employee emp = new Employee(1L, "John", "Developer", 50000.0);

        // Mock the behavior of the repository
        when(employeeRepository.findById(1L)).thenReturn(Optional.of(emp));

        // Call the service method
        Employee result = employeeService.getEmployeeById(1L);

        // Verify the result
        assertEquals("John", result.getName());
        assertEquals("Developer", result.getRole());
        assertEquals(50000.0, result.getSalary());
    }
}

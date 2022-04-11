package com.brandmv.app.services;

import com.brandmv.app.dummy.StudentDummy;
import com.brandmv.app.models.Student;
import com.brandmv.app.repositories.IStudentRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class StudentServiceImplTest {

    @Mock
    private IStudentRepository repository;

    @InjectMocks
    private StudentServiceImpl service;

    /*@BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this);
    }*/

    @Test
    void testSuccessSearchStudentByNameLastname(){
        //IStudentRepository repository = new StudentRespositoryImpl();
        //IStudentRepository repository = Mockito.mock(IStudentRepository.class); //* Returns completely simulated object
        //IStudentService service = new StudentServiceImpl(repository);

        when(repository.getAllStudents()).thenReturn(StudentDummy.getAllStudents());
        Student student = service.searchStudentByNameLastname("Brandon", "Meza");
        assertEquals("Brandon", student.getName());
        assertEquals(3L, student.getId());
    }

    @Test
    void testFailSearchStudentByNameLastnameEmptyList(){

        //IStudentRepository repository = Mockito.mock(IStudentRepository.class); //* Returns completely simulated object
        //IStudentService service = new StudentServiceImpl(repository);

        when(repository.getAllStudents()).thenReturn(StudentDummy.getAllStudentsEmptyList());

        assertThrows(NoSuchElementException.class, () -> {
            service.searchStudentByNameLastname("Brandon", "Meza");
        });

    }

    @Test
    void testFailSearchStudentByNameLastnameNullList(){
        //IStudentRepository repository = Mockito.mock(IStudentRepository.class); //* Returns completely simulated object
        //IStudentService service = new StudentServiceImpl(repository);

        when(repository.getAllStudents()).thenReturn(null);
        assertThrows(NullPointerException.class, () -> {
            service.searchStudentByNameLastname("Brandon", "Meza");
        });
    }

    @Test
    void testSuccessSearchStudentByNameLastnameNotFound(){
        //IStudentRepository repository = new StudentRespositoryImpl();
        //IStudentRepository repository = Mockito.mock(IStudentRepository.class); //* Returns completely simulated object
        //IStudentService service = new StudentServiceImpl(repository);

        when(repository.getAllStudents()).thenReturn(StudentDummy.getAllStudents());
        assertThrows(NoSuchElementException.class, () -> {
            service.searchStudentByNameLastname("Juanito", "Perez");
        });
    }

    }
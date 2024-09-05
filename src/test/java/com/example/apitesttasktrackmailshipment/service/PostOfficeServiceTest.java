package com.example.apitesttasktrackmailshipment.service;

import com.example.apitesttasktrackmailshipment.model.PostOffice;
import com.example.apitesttasktrackmailshipment.repository.PostOfficeRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class PostOfficeServiceTest {

    @Mock
    private PostOfficeRepository repositoryMock;

    @InjectMocks
    private PostOfficeService postOfficeService;

    @Test
    void removePostOffice() {
        //Given
        Long postOfficeId = 1L;
        //When
       assertDoesNotThrow(() -> postOfficeService.removePostOffice(postOfficeId));
        //Then
        verify(repositoryMock, atMost(1)).deleteById(postOfficeId);
    }

    @Test
    void save() {
        //Given
        PostOffice postOffice = new PostOffice();
        //When
        when(repositoryMock.save(postOffice))
                .thenReturn(postOffice);
        ResponseEntity<PostOffice> postSave = postOfficeService.save(postOffice);
        //Then
        assertEquals(ResponseEntity.ok(postOffice), postSave);
        verify(repositoryMock, only()).save(postOffice);
    }

    @Test
    void findAllNotNull() {
        //Given
        PostOfficeService postOfficeService = new PostOfficeService(repositoryMock);
        //When
        List<PostOffice> expected = postOfficeService.findAll();
        //Then
        assertNotNull(expected);
        verify(repositoryMock, only()).findAll();
    }

    @Test
    void findById() {
        //Given
        Long postId = 1L;
        //When
        assertDoesNotThrow(() -> postOfficeService.findById(postId));
        //Then
        verify(repositoryMock, times(1)).findById(postId);
    }
}
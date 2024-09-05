package com.example.apitesttasktrackmailshipment.service;

import com.example.apitesttasktrackmailshipment.model.PostalItems;
import com.example.apitesttasktrackmailshipment.repository.PostalItemsRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class PostalItemsServiceTest {

    @Mock
    private PostalItemsRepository repository;

    @InjectMocks
    private PostalItemsService postalItemsService;

    @Test
    void save() {
        //Given
        PostalItems postalItems = new PostalItems();
        //When
        when(repository.save(postalItems))
                .thenReturn(postalItems);
        PostalItems postalSave = postalItemsService.save(postalItems);
        //Then
        assertEquals(postalItems, postalSave);
        verify(repository, only()).save(postalItems);
    }

    @Test
    void findById() {
        //Given
        Long postalId = 1L;
        PostalItems postalItems = new PostalItems();
        //When
        assertDoesNotThrow(() -> postalItemsService.findById(postalId));
        //Then
        verify(repository, only()).findById(postalId);
    }
}
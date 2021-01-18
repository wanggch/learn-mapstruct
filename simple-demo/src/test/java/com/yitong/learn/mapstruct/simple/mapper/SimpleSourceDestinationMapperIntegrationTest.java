package com.yitong.learn.mapstruct.simple.mapper;

import com.yitong.learn.mapstruct.simple.entity.SimpleDestination;
import com.yitong.learn.mapstruct.simple.entity.SimpleSource;
import org.junit.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.Assert.assertEquals;

public class SimpleSourceDestinationMapperIntegrationTest {

    private SimpleSourceDestinationMapper simpleSourceDestinationMapper = Mappers.getMapper(SimpleSourceDestinationMapper.class);

    @Test
    public void testSourceToDestination() {
        SimpleSource source = new SimpleSource();
        source.setName("SourceName");
        source.setDescription("SourceDescription");
        SimpleDestination destination = simpleSourceDestinationMapper.sourceToDestination(source);
        assertEquals(source.getName(), destination.getName());
        assertEquals(source.getDescription(), destination.getDescription());
    }

    @Test
    public void testDestinationToSource() {
        SimpleDestination destination = new SimpleDestination();
        destination.setName("DestinationName");
        destination.setDescription("DestinationDescription");
        SimpleSource source = simpleSourceDestinationMapper.destinationToSource(destination);
        assertEquals(source.getName(), destination.getName());
        assertEquals(source.getDescription(), destination.getDescription());
    }
}

package com.yitong.learn.mapstruct.simple.mapper.impl;

import com.yitong.learn.mapstruct.simple.mapper.SimpleSourceDestinationMapper;
import com.yitong.learn.mapstruct.simple.entity.SimpleDestination;
import com.yitong.learn.mapstruct.simple.entity.SimpleSource;

import java.util.Objects;

public class SimpleSourceDestinationMapperImpl implements SimpleSourceDestinationMapper {
    @Override
    public SimpleDestination sourceToDestination(SimpleSource source) {
        if (Objects.isNull(source)) {
            return null;
        }
        SimpleDestination destination = new SimpleDestination();
        destination.setName(source.getName());
        destination.setDescription(source.getDescription());
        return destination;
    }

    @Override
    public SimpleSource destinationToSource(SimpleDestination destination) {
        if (Objects.isNull(destination)) {
            return null;
        }
        SimpleSource source = new SimpleSource();
        source.setName(destination.getName());
        source.setDescription(destination.getDescription());
        return source;
    }
}

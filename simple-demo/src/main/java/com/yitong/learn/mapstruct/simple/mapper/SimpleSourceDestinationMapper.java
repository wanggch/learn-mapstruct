package com.yitong.learn.mapstruct.simple.mapper;

import com.yitong.learn.mapstruct.simple.entity.SimpleDestination;
import com.yitong.learn.mapstruct.simple.entity.SimpleSource;
import org.mapstruct.Mapper;

@Mapper
public interface SimpleSourceDestinationMapper {

    SimpleDestination sourceToDestination(SimpleSource source);

    SimpleSource destinationToSource(SimpleDestination destination);
}

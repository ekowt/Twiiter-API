package com.cooksystems.springassessmentsocialmediaapr2024team3.mappers;

import com.cooksystems.springassessmentsocialmediaapr2024team3.dtos.HashtagDto;
import com.cooksystems.springassessmentsocialmediaapr2024team3.entities.Hashtag;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-28T14:58:46-0400",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17.0.7 (Oracle Corporation)"
)
@Component
public class HashtagMapperImpl implements HashtagMapper {

    @Override
    public HashtagDto entityToDto(Hashtag entity) {
        if ( entity == null ) {
            return null;
        }

        HashtagDto hashtagDto = new HashtagDto();

        hashtagDto.setLabel( entity.getLabel() );
        hashtagDto.setFirstUsed( entity.getFirstUsed() );
        hashtagDto.setLastUsed( entity.getLastUsed() );

        return hashtagDto;
    }

    @Override
    public List<HashtagDto> entitiesToDtos(List<Hashtag> entities) {
        if ( entities == null ) {
            return null;
        }

        List<HashtagDto> list = new ArrayList<HashtagDto>( entities.size() );
        for ( Hashtag hashtag : entities ) {
            list.add( entityToDto( hashtag ) );
        }

        return list;
    }
}

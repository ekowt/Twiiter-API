package com.cooksystems.springassessmentsocialmediaapr2024team3.mappers;

import com.cooksystems.springassessmentsocialmediaapr2024team3.dtos.TweetResponseDto;
import com.cooksystems.springassessmentsocialmediaapr2024team3.entities.Tweet;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-28T14:58:46-0400",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17.0.7 (Oracle Corporation)"
)
@Component
public class TweetMapperImpl implements TweetMapper {

    @Autowired
    private UserMapper userMapper;

    @Override
    public TweetResponseDto entityToDto(Tweet entity) {
        if ( entity == null ) {
            return null;
        }

        TweetResponseDto tweetResponseDto = new TweetResponseDto();

        tweetResponseDto.setId( entity.getId() );
        tweetResponseDto.setAuthor( userMapper.entityToDto( entity.getAuthor() ) );
        tweetResponseDto.setPosted( entity.getPosted() );
        tweetResponseDto.setContent( entity.getContent() );
        tweetResponseDto.setInReplyTo( entityToDto( entity.getInReplyTo() ) );
        tweetResponseDto.setRepostOf( entityToDto( entity.getRepostOf() ) );

        return tweetResponseDto;
    }

    @Override
    public List<TweetResponseDto> entitiesToDtos(List<Tweet> entities) {
        if ( entities == null ) {
            return null;
        }

        List<TweetResponseDto> list = new ArrayList<TweetResponseDto>( entities.size() );
        for ( Tweet tweet : entities ) {
            list.add( entityToDto( tweet ) );
        }

        return list;
    }
}

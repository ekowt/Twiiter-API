package com.cooksystems.springassessmentsocialmediaapr2024team3.mappers;

import com.cooksystems.springassessmentsocialmediaapr2024team3.dtos.CredentialsDto;
import com.cooksystems.springassessmentsocialmediaapr2024team3.dtos.ProfileDto;
import com.cooksystems.springassessmentsocialmediaapr2024team3.dtos.UserRequestDto;
import com.cooksystems.springassessmentsocialmediaapr2024team3.dtos.UserResponseDto;
import com.cooksystems.springassessmentsocialmediaapr2024team3.entities.Credentials;
import com.cooksystems.springassessmentsocialmediaapr2024team3.entities.Profile;
import com.cooksystems.springassessmentsocialmediaapr2024team3.entities.User;
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
public class UserMapperImpl implements UserMapper {

    @Override
    public UserResponseDto entityToDto(User entity) {
        if ( entity == null ) {
            return null;
        }

        UserResponseDto userResponseDto = new UserResponseDto();

        userResponseDto.setUsername( entityCredentialsUsername( entity ) );
        userResponseDto.setProfile( profileToProfileDto( entity.getProfile() ) );
        userResponseDto.setJoined( entity.getJoined() );

        return userResponseDto;
    }

    @Override
    public List<UserResponseDto> entitiesToDtos(List<User> entities) {
        if ( entities == null ) {
            return null;
        }

        List<UserResponseDto> list = new ArrayList<UserResponseDto>( entities.size() );
        for ( User user : entities ) {
            list.add( entityToDto( user ) );
        }

        return list;
    }

    @Override
    public User requestDtoEntity(UserRequestDto userRequestDto) {
        if ( userRequestDto == null ) {
            return null;
        }

        User user = new User();

        user.setCredentials( credentialsDtoToCredentials( userRequestDto.getCredentials() ) );
        user.setProfile( profileDtoToProfile( userRequestDto.getProfile() ) );

        return user;
    }

    private String entityCredentialsUsername(User user) {
        if ( user == null ) {
            return null;
        }
        Credentials credentials = user.getCredentials();
        if ( credentials == null ) {
            return null;
        }
        String username = credentials.getUsername();
        if ( username == null ) {
            return null;
        }
        return username;
    }

    protected ProfileDto profileToProfileDto(Profile profile) {
        if ( profile == null ) {
            return null;
        }

        ProfileDto profileDto = new ProfileDto();

        profileDto.setFirstName( profile.getFirstName() );
        profileDto.setLastName( profile.getLastName() );
        profileDto.setEmail( profile.getEmail() );
        profileDto.setPhone( profile.getPhone() );

        return profileDto;
    }

    protected Credentials credentialsDtoToCredentials(CredentialsDto credentialsDto) {
        if ( credentialsDto == null ) {
            return null;
        }

        Credentials credentials = new Credentials();

        credentials.setUsername( credentialsDto.getUsername() );
        credentials.setPassword( credentialsDto.getPassword() );

        return credentials;
    }

    protected Profile profileDtoToProfile(ProfileDto profileDto) {
        if ( profileDto == null ) {
            return null;
        }

        Profile profile = new Profile();

        profile.setFirstName( profileDto.getFirstName() );
        profile.setLastName( profileDto.getLastName() );
        profile.setEmail( profileDto.getEmail() );
        profile.setPhone( profileDto.getPhone() );

        return profile;
    }
}

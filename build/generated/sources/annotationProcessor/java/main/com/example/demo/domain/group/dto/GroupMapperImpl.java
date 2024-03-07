package com.example.demo.domain.group.dto;

import com.example.demo.domain.authority.Authority;
import com.example.demo.domain.authority.dto.AuthorityDTO;
import com.example.demo.domain.group.Group;
import com.example.demo.domain.role.Role;
import com.example.demo.domain.role.dto.RoleDTO;
import com.example.demo.domain.user.User;
import com.example.demo.domain.user.dto.MinimalUserDTO;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-07T11:52:59+0100",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.0.jar, environment: Java 19.0.2 (Oracle Corporation)"
)
@Component
public class GroupMapperImpl implements GroupMapper {

    @Override
    public Group fromDTO(GroupDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Group group = new Group();

        group.setId( dto.getId() );
        group.setName( dto.getName() );
        group.setDescription( dto.getDescription() );
        group.setLogoUrl( dto.getLogoUrl() );
        group.setMemberCount( dto.getMemberCount() );
        group.setUsers( minimalUserDTOSetToUserSet( dto.getUsers() ) );

        return group;
    }

    @Override
    public List<Group> fromDTOs(List<GroupDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Group> list = new ArrayList<Group>( dtos.size() );
        for ( GroupDTO groupDTO : dtos ) {
            list.add( fromDTO( groupDTO ) );
        }

        return list;
    }

    @Override
    public Set<Group> fromDTOs(Set<GroupDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        Set<Group> set = new LinkedHashSet<Group>( Math.max( (int) ( dtos.size() / .75f ) + 1, 16 ) );
        for ( GroupDTO groupDTO : dtos ) {
            set.add( fromDTO( groupDTO ) );
        }

        return set;
    }

    @Override
    public GroupDTO toDTO(Group BO) {
        if ( BO == null ) {
            return null;
        }

        GroupDTO groupDTO = new GroupDTO();

        groupDTO.setId( BO.getId() );
        groupDTO.setName( BO.getName() );
        groupDTO.setDescription( BO.getDescription() );
        groupDTO.setLogoUrl( BO.getLogoUrl() );
        groupDTO.setMemberCount( BO.getMemberCount() );
        groupDTO.setUsers( userSetToMinimalUserDTOSet( BO.getUsers() ) );

        return groupDTO;
    }

    @Override
    public List<GroupDTO> toDTOs(List<Group> BOs) {
        if ( BOs == null ) {
            return null;
        }

        List<GroupDTO> list = new ArrayList<GroupDTO>( BOs.size() );
        for ( Group group : BOs ) {
            list.add( toDTO( group ) );
        }

        return list;
    }

    @Override
    public Set<GroupDTO> toDTOs(Set<Group> BOs) {
        if ( BOs == null ) {
            return null;
        }

        Set<GroupDTO> set = new LinkedHashSet<GroupDTO>( Math.max( (int) ( BOs.size() / .75f ) + 1, 16 ) );
        for ( Group group : BOs ) {
            set.add( toDTO( group ) );
        }

        return set;
    }

    protected Authority authorityDTOToAuthority(AuthorityDTO authorityDTO) {
        if ( authorityDTO == null ) {
            return null;
        }

        Authority authority = new Authority();

        authority.setId( authorityDTO.getId() );
        authority.setName( authorityDTO.getName() );

        return authority;
    }

    protected Set<Authority> authorityDTOSetToAuthoritySet(Set<AuthorityDTO> set) {
        if ( set == null ) {
            return null;
        }

        Set<Authority> set1 = new LinkedHashSet<Authority>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( AuthorityDTO authorityDTO : set ) {
            set1.add( authorityDTOToAuthority( authorityDTO ) );
        }

        return set1;
    }

    protected Role roleDTOToRole(RoleDTO roleDTO) {
        if ( roleDTO == null ) {
            return null;
        }

        Role role = new Role();

        role.setId( roleDTO.getId() );
        role.setName( roleDTO.getName() );
        role.setAuthorities( authorityDTOSetToAuthoritySet( roleDTO.getAuthorities() ) );

        return role;
    }

    protected Set<Role> roleDTOSetToRoleSet(Set<RoleDTO> set) {
        if ( set == null ) {
            return null;
        }

        Set<Role> set1 = new LinkedHashSet<Role>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( RoleDTO roleDTO : set ) {
            set1.add( roleDTOToRole( roleDTO ) );
        }

        return set1;
    }

    protected User minimalUserDTOToUser(MinimalUserDTO minimalUserDTO) {
        if ( minimalUserDTO == null ) {
            return null;
        }

        User user = new User();

        user.setId( minimalUserDTO.getId() );
        user.setFirstName( minimalUserDTO.getFirstName() );
        user.setLastName( minimalUserDTO.getLastName() );
        user.setEmail( minimalUserDTO.getEmail() );
        user.setRoles( roleDTOSetToRoleSet( minimalUserDTO.getRoles() ) );

        return user;
    }

    protected Set<User> minimalUserDTOSetToUserSet(Set<MinimalUserDTO> set) {
        if ( set == null ) {
            return null;
        }

        Set<User> set1 = new LinkedHashSet<User>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( MinimalUserDTO minimalUserDTO : set ) {
            set1.add( minimalUserDTOToUser( minimalUserDTO ) );
        }

        return set1;
    }

    protected AuthorityDTO authorityToAuthorityDTO(Authority authority) {
        if ( authority == null ) {
            return null;
        }

        AuthorityDTO authorityDTO = new AuthorityDTO();

        authorityDTO.setId( authority.getId() );
        authorityDTO.setName( authority.getName() );

        return authorityDTO;
    }

    protected Set<AuthorityDTO> authoritySetToAuthorityDTOSet(Set<Authority> set) {
        if ( set == null ) {
            return null;
        }

        Set<AuthorityDTO> set1 = new LinkedHashSet<AuthorityDTO>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Authority authority : set ) {
            set1.add( authorityToAuthorityDTO( authority ) );
        }

        return set1;
    }

    protected RoleDTO roleToRoleDTO(Role role) {
        if ( role == null ) {
            return null;
        }

        RoleDTO roleDTO = new RoleDTO();

        roleDTO.setId( role.getId() );
        roleDTO.setName( role.getName() );
        roleDTO.setAuthorities( authoritySetToAuthorityDTOSet( role.getAuthorities() ) );

        return roleDTO;
    }

    protected Set<RoleDTO> roleSetToRoleDTOSet(Set<Role> set) {
        if ( set == null ) {
            return null;
        }

        Set<RoleDTO> set1 = new LinkedHashSet<RoleDTO>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Role role : set ) {
            set1.add( roleToRoleDTO( role ) );
        }

        return set1;
    }

    protected MinimalUserDTO userToMinimalUserDTO(User user) {
        if ( user == null ) {
            return null;
        }

        MinimalUserDTO minimalUserDTO = new MinimalUserDTO();

        minimalUserDTO.setId( user.getId() );
        minimalUserDTO.setFirstName( user.getFirstName() );
        minimalUserDTO.setLastName( user.getLastName() );
        minimalUserDTO.setEmail( user.getEmail() );
        minimalUserDTO.setRoles( roleSetToRoleDTOSet( user.getRoles() ) );

        return minimalUserDTO;
    }

    protected Set<MinimalUserDTO> userSetToMinimalUserDTOSet(Set<User> set) {
        if ( set == null ) {
            return null;
        }

        Set<MinimalUserDTO> set1 = new LinkedHashSet<MinimalUserDTO>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( User user : set ) {
            set1.add( userToMinimalUserDTO( user ) );
        }

        return set1;
    }
}

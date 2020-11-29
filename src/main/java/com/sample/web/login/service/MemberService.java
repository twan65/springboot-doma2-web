package com.sample.web.login.service;

import com.sample.web.login.model.UserForm;
import org.springframework.security.core.userdetails.UserDetailsService;

public class MemberService implements UserDetailsService {

//    @Transactional
//    public Long joinUser(UserRequestForm memberDto) {
//        // パスワードの暗号化
//        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//        memberDto.setPassword(passwordEncoder.encode(memberDto.getPassword()));
//
//        return memberRepository.save(memberDto.toEntity()).getId();
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String userEmail) throws UsernameNotFoundException {
//        Optional<MemberEntity> userEntityWrapper = memberRepository.findByEmail(userEmail);
//        MemberEntity userEntity = userEntityWrapper.get();
//
//        List<GrantedAuthority> authorities = new ArrayList<>();
//
//        if (("admin@example.com").equals(userEmail)) {
//            authorities.add(new SimpleGrantedAuthority(Role.ADMIN.getValue()));
//        } else {
//            authorities.add(new SimpleGrantedAuthority(Role.MEMBER.getValue()));
//        }
//
//        return new User(userEntity.getEmail(), userEntity.getPassword(), authorities);
//    }

    public UserForm login(String userId, String password) {

        return new UserForm();
    }
}

package com.ev.core;//package com.ev.core;
//
//import org.springframework.security.authentication.AbstractAuthenticationToken;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.SpringSecurityCoreVersion;
//
//import java.util.Collection;
//
///**
// * @author
// * @create 2018-11-30 上午10:11
// **/
//public class SmsCodeAuthenticationToken extends AbstractAuthenticationToken {
//
//    private static final long serialVersionUID = SpringSecurityCoreVersion.SERIAL_VERSION_UID;
//
//    //认证前  放用户名 认证后放用户信息userDetail
//    private final Object principal;
//
//    // ~ Constructors
//    // ===================================================================================================
//
//    /**
//     * This constructor can be safely used by any code that wishes to create a
//     * <code>UsernamePasswordAuthenticationToken</code>, as the {@link #isAuthenticated()}
//     * will return <code>false</code>.
//     *
//     */
//    public SmsCodeAuthenticationToken(String mobile) {
//        super(null);
//        this.principal = mobile;
//        setAuthenticated(false);
//    }
//
//    /**
//     * This constructor should only be used by <code>AuthenticationManager</code> or
//     * <code>AuthenticationProvider</code> implementations that are satisfied with
//     * producing a trusted (i.e. {@link #isAuthenticated()} = <code>true</code>)
//     * authentication token.
//     *
//     * @param principal
//     * @param authorities
//     */
//    public SmsCodeAuthenticationToken(Object principal,
//                                               Collection<? extends GrantedAuthority> authorities) {
//        super(authorities);
//        this.principal = principal;
//        super.setAuthenticated(true);
//    }
//
//
//    @Override
//    public Object getCredentials() {
//        return null;
//    }
//
//    public Object getPrincipal() {
//        return this.principal;
//    }
//
//    public void setAuthenticated(boolean isAuthenticated) throws IllegalArgumentException {
//        if (isAuthenticated) {
//            throw new IllegalArgumentException(
//                    "Cannot set this token to trusted - use constructor which takes a GrantedAuthority list instead");
//        }
//
//        super.setAuthenticated(false);
//    }
//
//    @Override
//    public void eraseCredentials() {
//        super.eraseCredentials();
//    }
//}
//
//
